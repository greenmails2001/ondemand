package com.vc.sasn.beans;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import com.vc.sasnmodel.views.customize.common.C01NewsOthersRow;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import javax.faces.event.PhaseEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.event.DialogEvent;

import com.vc.sasnmodel.beans.NewsOthersBean;

import java.io.IOException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class IndexBean {

    private NewsOthersBean newsOthers;

    private String selectedItem = "consultant";

    public IndexBean() {
        super();
    }

    public void setNewsOthersBean(NewsOthersBean newsOthers) {
        this.newsOthers = newsOthers;
    }

    public NewsOthersBean getNewsOthersBean() {
        if (newsOthers == null) {
            this.newsOthers = new NewsOthersBean();
        }
        return newsOthers;
    }

    // Xem bang News_Others

    public void showPopupNewsOthers(ActionListener a) {
        // String notNumber = a.
        FacesContext context = FacesContext.getCurrentInstance();
        RichPopup popup =
            (RichPopup)context.getViewRoot().findComponent("newsOthersPopupID");
        FacesUtils.showPopup(popup);
    }

    public void editNewsOthersActionListener(ActionEvent e) {

        UIComponent ui = e.getComponent();
        Map<String, Object> attributes = ui.getAttributes();
        String notNumber = (String)attributes.get("notNumber");

        if (notNumber != null) {
            PerpSasNewsAppModule module =
                SasnFacesUtils.getPerpSasNewsAppModule();
            C01NewsOthersRow row = module.getC01NewsOthersByCode(notNumber);

            if (row != null) {
                newsOthers = new NewsOthersBean();
                newsOthers.setNotNumber(row.getNotNumber());
                newsOthers.setTitle(row.getTitle());
                newsOthers.setContent(row.getContent());
                newsOthers.setDescription(row.getDescription());
                FacesContext context = FacesContext.getCurrentInstance();
                RichPopup popup =
                    (RichPopup)context.getViewRoot().findComponent("newsOthersPopupID");
                FacesUtils.addPartialTarget(popup);
                FacesUtils.showPopup(popup);
            } else {
                newsOthers = null;
            }
        }
    }

    public void saveNewsOthersDialogListener(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
            PerpSasNewsAppModule module =
                SasnFacesUtils.getPerpSasNewsAppModule();
            module.saveNewsOthersBean(newsOthers);
        }
    }

    public void goConsutantDownloadActionListener(ActionEvent actionEvent) {
        this.selectedItem = "consultant";
        RichPanelTabbed richPanelTabbed = getPanelTabbed("pt1");
        for (UIComponent child : richPanelTabbed.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }
        this.selectedItem = "r7:0:download";
        RichPanelTabbed richPanelTabbed2 = getPanelTabbed("r7:consult");
        for (UIComponent child : richPanelTabbed2.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }
    }

    private boolean isThisItemToBeDisclosed(RichShowDetailItem sdi) {
        FacesContext context = FacesContext.getCurrentInstance();
        String clientId = sdi.getClientId(context);
        boolean ret = selectedItem.equals(clientId);
        return ret;

    }


    private RichPanelTabbed getPanelTabbed(String panelTabbedId) {
        FacesContext context = FacesContext.getCurrentInstance();
        return (RichPanelTabbed)context.getViewRoot().findComponent(panelTabbedId);
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void goHomeActionListener(ActionEvent actionEvent) {
        this.selectedItem = "introduction";
        RichPanelTabbed richPanelTabbed = getPanelTabbed("pt1");
        for (UIComponent child : richPanelTabbed.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }

        this.selectedItem = "r1:0:vbiscloud";
        RichPanelTabbed richPanelTabbed2 = getPanelTabbed("r1:intro");
        for (UIComponent child : richPanelTabbed2.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }
    }


    public void goContactActionListener(ActionEvent actionEvent) {
        this.selectedItem = "introduction";
        RichPanelTabbed richPanelTabbed = getPanelTabbed("pt1");
        for (UIComponent child : richPanelTabbed.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }

        this.selectedItem = "r1:0:sdi3";
        RichPanelTabbed richPanelTabbed2 = getPanelTabbed("r1:intro");
        for (UIComponent child : richPanelTabbed2.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }
    }

    public void goConsultantHelpActionListener(ActionEvent actionEvent) {
        this.selectedItem = "consultant";
        RichPanelTabbed richPanelTabbed = getPanelTabbed("pt1");
        for (UIComponent child : richPanelTabbed.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }
        this.selectedItem = "r7:0:consul";
        RichPanelTabbed richPanelTabbed2 = getPanelTabbed("r7:consult");
        for (UIComponent child : richPanelTabbed2.getChildren()) {
            RichShowDetailItem sdi = (RichShowDetailItem)child;
            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
        }
    }

    public void goForumActionListener(ActionEvent actionEvent) {
        String destination = "http://www.vbiscloud.com/forum";
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(destination);
        } catch (IOException e) {
        }
    }

    public void goSignInPerpsas(ActionEvent actionEvent) {
        String destination = "http://www.vbiscloud.com/perpsas";
        try {
            HttpServletResponse response =
                (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.sendRedirect(destination);
            //FacesContext.getCurrentInstance().getExternalContext().redirect(destination);
        } catch (IOException e) {

        }
    }

    public void onPageLoad(PhaseEvent phaseEvent) {
        if (phaseEvent.getPhaseId().equals(phaseEvent.getPhaseId().RENDER_RESPONSE)) {
            if (!AdfFacesContext.getCurrentInstance().isPostback()) {
                FacesContext context = FacesContext.getCurrentInstance();
                HttpServletRequest request =
                    (HttpServletRequest)context.getExternalContext().getRequest();
                //Link: http://127.0.0.1:7101/sasn/faces/index.jspx?parentTab=consultant&region=r7&childTab=consul
                //region tu :r1->r8
                String parentTab = (String)request.getParameter("parentTab");
                String region = (String)request.getParameter("region");
                String childTab = (String)request.getParameter("childTab");
                if (parentTab != null) {
                    this.selectedItem = parentTab;
                    RichPanelTabbed richPanelTabbed = getPanelTabbed("pt1");
                    for (UIComponent child : richPanelTabbed.getChildren()) {
                        RichShowDetailItem sdi = (RichShowDetailItem)child;
                        sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
                    }
                }
                if (region != null) {
                    String regionTab = null;
                    if (region.equals("r1")) {
                        regionTab = "intro";
                    } else if (region.equals("r2")) {
                        regionTab = "prod";
                    } else if (region.equals("r3")) {
                        regionTab = "serv";
                    } else if (region.equals("r4")) {
                        regionTab = "partner";
                    } else if (region.equals("r5")) {
                        regionTab = "cust";
                    } else if (region.equals("r6")) {
                        regionTab = "news";
                    } else if (region.equals("r7")) {
                        regionTab = "consult";
                    } else if (region.equals("r8")) {
                        regionTab = "system";
                    }
                    if (childTab != null) {
                        this.selectedItem = region + ":0:" + childTab;
                        RichPanelTabbed richPanelTabbed2 =
                            getPanelTabbed(region + ":" + regionTab);
                        for (UIComponent child :
                             richPanelTabbed2.getChildren()) {
                            RichShowDetailItem sdi = (RichShowDetailItem)child;
                            sdi.setDisclosed(isThisItemToBeDisclosed(sdi));
                        }
                    }
                }
                //FacesUtils.addMessage(null, "Welcome to this Page!");
            }
        }
    }
}
