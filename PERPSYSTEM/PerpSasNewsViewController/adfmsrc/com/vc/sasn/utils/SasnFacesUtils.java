package com.vc.sasn.utils;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.perp.beans.SasnSessionLoginObject;

import com.vc.sasnmodel.PerpSasNewsAppModuleImpl;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jbo.client.Configuration;


public class SasnFacesUtils {

    /** Goi trong backing bean, khong goi trong Servlet . Xem method tuong tu goi trong Servlet */
    public static PerpSasNewsAppModule getPerpSasNewsAppModule() {
        return (PerpSasNewsAppModule)FacesUtils.getApplicationModuleForDataControl("PerpSasNewsAppModuleDataControl");
    }

    /** Su dung goi trong Servlet */
    public static PerpSasNewsAppModule getPerpSasNewsAppModule(HttpServletRequest request,
                                                               HttpServletResponse response) {
        return (PerpSasNewsAppModule)FacesUtils.getApplicationModuleForDataControl(request,
                                                                                   response,
                                                                                   "PerpSasNewsAppModuleDataControl");
    }

    /**
     * Su dung trong Servlet. Goi theo cach Lay Local.
     * @return
     */
    public static PerpSasNewsAppModule getLocalPerpSasNewsAppModule() {
        String appName = PerpSasNewsAppModuleImpl.class.getName();
        String configName = "PerpSasNewsAppModuleLocal";


        Object obj =
            Configuration.createRootApplicationModule(appName, configName);

        return (PerpSasNewsAppModule)obj;

    }

    public static SasnSessionLoginObject getSasnSessionLoginObject() {
        return (SasnSessionLoginObject)FacesUtils.resolveExpression("#{sasnSessionLoginObject}");
    }
}
