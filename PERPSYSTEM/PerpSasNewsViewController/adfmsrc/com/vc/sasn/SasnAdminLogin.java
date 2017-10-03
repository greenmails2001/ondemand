package com.vc.sasn;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.perp.beans.SasnSessionLoginObject;

import com.vc.sasn.utils.SasnFacesUtils;

import javax.faces.event.ActionEvent;

public class SasnAdminLogin {

    private String userName;
    private String password;
    private String outcome;

    public SasnAdminLogin() {
        super();
    }

    public void loginActionListener(ActionEvent actionEvent) {
        SasnSessionLoginObject sesionObject =
            SasnFacesUtils.getSasnSessionLoginObject();
        if (userName != null && userName.equals("vinhcuu") &&
            password != null && password.equals("vinhcuu1234")) {
            sesionObject.setSasnAdmin(true);
            this.outcome = "index";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getOutcome() {
        return outcome;
    }
}
