package com.oracle.adffwkextensions.faces;


import java.util.Iterator;
import java.util.List;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.FactoryFinder;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import javax.faces.context.FacesContextFactory;
import javax.faces.lifecycle.Lifecycle;
import javax.faces.lifecycle.LifecycleFactory;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.jbo.ApplicationModule;

import oracle.jbo.uicli.binding.JUIteratorBinding;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


public class FacesUtils {

    private static FacesContext facesContext4Servlet;

    private abstract static class InnerFacesContext extends FacesContext {
        protected static void setFacesContextAsCurrentInstance(FacesContext facesContext) {
            //FacesContext.setCurrentInstance(facesContext);
            //facesContext4Servlet = facesContext;
        }
    }

    private FacesUtils() {
    }

    /**
     * hatv mo rong , trong truong hop ko the lay duoc FacesContext trong Servlet .
     *
     * @param request
     * @param response
     * @return
     */

    public static FacesContext getFacesContextForServlet(HttpServletRequest request,
                                                         HttpServletResponse response) {
        //FacesContext facesContext = FacesContext.getCurrentInstance();
        FacesContext facesContext = facesContext4Servlet;
        if (facesContext == null) {
            FacesContextFactory contextFactory =
                (FacesContextFactory)FactoryFinder.getFactory(FactoryFinder.FACES_CONTEXT_FACTORY);
            LifecycleFactory lifecycleFactory =
                (LifecycleFactory)FactoryFinder.getFactory(FactoryFinder.LIFECYCLE_FACTORY);
            Lifecycle lifecycle =
                lifecycleFactory.getLifecycle(LifecycleFactory.DEFAULT_LIFECYCLE);

            facesContext =
                    contextFactory.getFacesContext(request.getSession().getServletContext(),
                                                   request, response,
                                                   lifecycle);

            // Set using our inner class
            InnerFacesContext.setFacesContextAsCurrentInstance(facesContext);

            // Set a new viewRoot, otherwise context.getViewRoot returns null
            UIViewRoot view =
                facesContext.getApplication().getViewHandler().createView(facesContext,
                                                                          "");
            facesContext.setViewRoot(view);
        }
        return facesContext;
    }

    public static ApplicationModule getApplicationModuleForDataControl(String dataControlName) {
        return (ApplicationModule)FacesUtils.resolveExpression("#{data." +
                                                               dataControlName +
                                                               ".dataProvider}");
    }

    /** Su dung goi trong Servlet */
    public static ApplicationModule getApplicationModuleForDataControl(HttpServletRequest request,
                                                                       HttpServletResponse response,
                                                                       String dataControlName) {
        FacesContext facesContext =
            getFacesContextForServlet(request, response);
        return (ApplicationModule)FacesUtils.resolveExpression(facesContext,
                                                               "#{data." +
                                                               dataControlName +
                                                               ".dataProvider}");
    }


    public static void addMessage(String summaryMessage,
                                  String detailMessage) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage fm =
            new FacesMessage(FacesMessage.SEVERITY_INFO, summaryMessage,
                             detailMessage);
        context.addMessage(null, fm);
    }

    public static void addError(String summaryError, String detailError) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage fm =
            new FacesMessage(FacesMessage.SEVERITY_ERROR, summaryError,
                             detailError);
        context.addMessage(null, fm);
    }

    public static void addError(String id, String summaryError,
                                String detailError) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage fm =
            new FacesMessage(FacesMessage.SEVERITY_ERROR, summaryError,
                             detailError);
        context.addMessage(id, fm);
    }

    public static Object resolveExpression(String expression) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        return resolveExpression(facesContext, expression);
    }

    public static JUIteratorBinding getIteratorBinding(String iteratorName) {
        return (JUIteratorBinding)resolveExpression("#{bindings." +
                                                    iteratorName + "}");
    }

    /** Thuong su dung goi ben trong servlet , khi do phai init facesContext truoc */
    public static Object resolveExpression(FacesContext facesContext,
                                           String expression) {
        Application app = facesContext.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesContext.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, expression,
                                            Object.class);
        return valueExp.getValue(elContext);
    }

    /**
     * Return the current page's binding container.
     * @return the current page's binding container
     * oracle.adf.model.binding.DCBindingContainer
     * oracle.binding.BindingContainer
     */
    public static DCBindingContainer getBindingContainer() {
        return (DCBindingContainer)resolveExpression("#{bindings}");
    }


    public static void addPartialTarget(UIComponent component) {
        RequestContext.getCurrentInstance().addPartialTarget(component);
    }

    public static HttpServletRequest getHttpServletRequest() {
        FacesContext context = FacesContext.getCurrentInstance();
        return (HttpServletRequest)context.getExternalContext().getRequest();
    }

    public static HttpServletResponse getHttpServletResponse() {
        FacesContext context = FacesContext.getCurrentInstance();
        return (HttpServletResponse)context.getExternalContext().getResponse();
    }

    public static HttpSession getHttpSession() {
        return getHttpServletRequest().getSession();
    }

    public static void hidePopup(RichPopup popup) {
        FacesContext context = FacesContext.getCurrentInstance();
        StringBuilder script = new StringBuilder();
        script.append("var popup = AdfPage.PAGE.findComponent('");
        script.append(popup.getClientId(context)).append("'); ");
        script.append("popup.hide();");
        ExtendedRenderKitService erks =
            Service.getService(context.getRenderKit(),
                               ExtendedRenderKitService.class);
        erks.addScript(context, script.toString());
    }


    public static void showPopup(RichPopup popup) {
        FacesContext context = FacesContext.getCurrentInstance();
        StringBuilder script = new StringBuilder();
        script.append("var popup = AdfPage.PAGE.findComponent('");
        script.append(popup.getClientId(context)).append("'); ");
        script.append("if (!popup.isPopupVisible()) { ");
        script.append("var hints = {}; ");
        script.append("popup.show(hints);}");
        ExtendedRenderKitService erks =
            Service.getService(context.getRenderKit(),
                               ExtendedRenderKitService.class);
        erks.addScript(context, script.toString());
    }

    // find a jsf component inside the JSF page

    public static UIComponent getUIComponent(String name) {
        FacesContext facesCtx = FacesContext.getCurrentInstance();
        return facesCtx.getViewRoot().findComponent(name);
    }

    // find a UIComponent inside a UIComponent

    public static UIComponent getUIComponent(UIComponent component,
                                             String name) {
        if (component != null)
            System.out.println(component.getId());

        List<UIComponent> items = component.getChildren();
        Iterator<UIComponent> facets = component.getFacetsAndChildren();

        if (items.size() > 0) {
            System.out.println("got childern");
            for (UIComponent item : items) {
                UIComponent found = getUIComponent(item, name);
                if (found != null) {
                    return found;
                }
                if (item.getId().equalsIgnoreCase(name)) {
                    return item;
                }
            }
        } else if (facets.hasNext()) {
            System.out.println("got facets");
            while (facets.hasNext()) {
                UIComponent facet = facets.next();
                UIComponent found = getUIComponent(facet, name);
                if (found != null) {
                    return found;
                }
                if (facet.getId().equalsIgnoreCase(name)) {
                    return facet;
                }
            }
        }
        return null;
    }


    public static void refreshPage() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        String refreshpage = fctx.getViewRoot().getViewId();
        ViewHandler ViewH = fctx.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fctx, refreshpage);
        UIV.setViewId(refreshpage);
        fctx.setViewRoot(UIV);
    }

}
