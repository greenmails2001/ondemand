package com.vc.sasn.beans;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;
import com.vc.sasnmodel.views.customize.common.C01NewsOthersRow;

import java.util.List;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class NewsOthersBean {

    private String notNumber;


    private C01NewsOthersRow item;

    public NewsOthersBean() {
        super();
    }


    public void setNotNumber(String notNumber) {
        this.notNumber = notNumber;
    }

    public String getNotNumber() {
        return notNumber;
    }

    public C01NewsOthersRow getNewsOthers() {
        if (item == null) {
            PerpSasNewsAppModule module =
                SasnFacesUtils.getPerpSasNewsAppModule();
            String nn =
                (String)FacesUtils.resolveExpression("${bindings.notNumber}");
            this.notNumber = nn;
            item = module.getC01NewsOthersByCode(notNumber);
        }
        System.out.println("Not number =" + this.notNumber);
        return item;
    }

}
