package com.vc.sasn;


import com.oracle.adffwkextensions.faces.FacesUtils;

import com.perp.beans.SasnSessionLoginObject;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.jbo.uicli.binding.JUIteratorBinding;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.DisclosureEvent;


public class Testting {

  
   
    private RichPanelAccordion acc;
    private RichPanelTabbed tabbed;
    private RichShowDetailItem roleTabItem;

    public Testting() {
        super();
        SasnSessionLoginObject obj;
    }


    public void disclosureListener(DisclosureEvent disclosureEvent) {
        RichShowDetailItem ui =
            (RichShowDetailItem)disclosureEvent.getSource();
        Map<String, Object> map = ui.getAttributes();
        if (disclosureEvent.isExpanded()) {
            JUIteratorBinding ite =
                (JUIteratorBinding)FacesUtils.resolveExpression("#{bindings.Sasn03ConsultantCategoriesIterator}");
            ite.setCurrentRowWithKey((String)ui.getAttributes().get("rowKeyStr"));
            Object rangStartObj = map.get("rangeStart");
            System.out.println("RangeStart Object=" +
                               rangStartObj.getClass().getName());
            Integer rangStart = 0;
            if (rangStartObj instanceof String) {
                rangStart = Integer.parseInt((String)rangStartObj);
            } else {
                rangStart = (Integer)rangStartObj;
            }

            System.out.println("Range Start to set =" + rangStart);

            rangStart = rangStart == null ? 0 : rangStart;
            ite.setRangeStart(rangStart);
            RequestContext.getCurrentInstance().addPartialTarget(this.acc);
        }
    }


    public void nextSet(ActionEvent actionEvent) {
        JUIteratorBinding ite =
            (JUIteratorBinding)FacesUtils.resolveExpression("#{bindings.Sasn03ConsultantCategoriesIterator}");
        //ite.getRowSetIterator().

    }

    public void setRangeStart(int rangeStart) {
        System.out.println("Set Range Start=" + rangeStart);
        List<UIComponent> list = this.acc.getChildren();
        for(UIComponent ui: list) {
            if(ui instanceof RichShowDetailItem) {
                RichShowDetailItem showDetail = (RichShowDetailItem)ui;
                if(showDetail.isDisclosed()) {
                    System.out.println("Found Expand");
                    Map<String, Object> map = showDetail.getAttributes();
                    System.out.println(map.get("CcaName"));
                    map.put("rangeStart", rangeStart);
                }
            }
        }
       
    }

   

 
    public void setAcc(RichPanelAccordion acc) {
        this.acc = acc;
    }

    public RichPanelAccordion getAcc() {
        return acc;
    }

    public void setTabbed(RichPanelTabbed tabbed) {
        this.tabbed = tabbed;
    }

    public RichPanelTabbed getTabbed() {
        return tabbed;
    }

    public void setRoleTabItem(RichShowDetailItem roleTabItem) {
        this.roleTabItem = roleTabItem;
    }

    public RichShowDetailItem getRoleTabItem() {
        return roleTabItem;
    }
}
