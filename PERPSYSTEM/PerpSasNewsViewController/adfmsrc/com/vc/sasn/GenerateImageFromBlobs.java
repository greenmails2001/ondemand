package com.vc.sasn;


import com.vc.sasn.utils.SasnFacesUtils;

import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import java.net.MalformedURLException;

import java.net.URISyntaxException;

import java.sql.Blob;
import java.sql.ResultSet;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


public class GenerateImageFromBlobs {
    public GenerateImageFromBlobs() {
        super();
    }

    public void generateImageFromBlobActionListener(ActionEvent actionEvent) {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            HttpServletRequest request =
                (HttpServletRequest)context.getExternalContext().getRequest();
            String realPath= request.getSession().getServletContext().getRealPath("");
            realPath = realPath == null ? "" : realPath;
            System.out.println("PATH =" + realPath);

            PerpSasNewsAppModule appModule =
                SasnFacesUtils.getPerpSasNewsAppModule();
            appModule.generateImageFromBlobDatas(realPath);
        } catch (Exception e) {
            System.out.println("Error 1 :" + e);
            e.printStackTrace();
        }
    }
}
