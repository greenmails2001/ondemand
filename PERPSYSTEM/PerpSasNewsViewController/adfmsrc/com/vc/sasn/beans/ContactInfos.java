package com.vc.sasn.beans;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.perp.beans.SasnSessionLoginObject;

import com.vc.sasn.utils.SasnFacesUtils;

import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import java.io.UnsupportedEncodingException;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpServletRequest;

import nl.captcha.Captcha;

import oracle.adf.view.rich.component.rich.RichPopup;

public class ContactInfos {
    public ContactInfos() {
    }

    private String contactName;
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String content;
    private String confirmCode;

    private boolean isValidated() {
        if (this.contactName == null || this.contactName.equals("")) {
            FacesUtils.addError(null,
                                "Contact name must be entered. Please check and try again.");
            return false;
        }
        if (this.companyName == null || this.companyName.equals("")) {
            FacesUtils.addError(null,
                                "Company name must be entered. Please check and try again.");
            return false;
        }
        if (this.phoneNumber == null || this.phoneNumber.equals("")) {
            FacesUtils.addError(null,
                                "Phone number Code must be entered. Please check and try again.");
            return false;
        }
        if (this.email == null || this.email.equals("")) {
            FacesUtils.addError(null,
                                "Email Code must be entered. Please check and try again.");
            return false;
        }
        if (this.content == null || this.content.equals("")) {
            FacesUtils.addError(null,
                                "Content Code must be entered. Please check and try again.");
            return false;
        }
        if (this.confirmCode == null || this.confirmCode.equals("")) {
            FacesUtils.addError(null,
                                "Confirm code must be entered. Please check and try again.");
            return false;
        }
        return true;
    }

    public void contactActionListener(ActionEvent actionEvent) {
        if (!this.isValidated())
            return;
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request =
            (HttpServletRequest)context.getExternalContext().getRequest();
        //Kiem tr captcha
        Map<String, Object> sessionMap =
            context.getExternalContext().getSessionMap();
        Captcha captcha = (Captcha)sessionMap.get(Captcha.NAME);
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            //bad luck - but ignore
            System.out.println("UTF not supported !");
        }
        if (confirmCode != null &&
            captcha.isCorrect(confirmCode.toLowerCase())) {
            //FacesUtils.addMessage(null, "Captcha is OK!");
        } else {
            FacesUtils.addError(null,
                                "Captcha is incorrect.Please check and try again!");
            return;
        }
        PerpSasNewsAppModule appModule =
            SasnFacesUtils.getPerpSasNewsAppModule();
        boolean ret =
            appModule.insertContactInfo(contactName, companyName, address,
                                        phoneNumber, email, content,
                                        confirmCode, contactName);
        if (ret) {          
            FacesUtils.addMessage(null,
                                  "Your information has been sent to us.");
        } else {
            FacesUtils.addError(null,
                                "Error while inserting your contact information.");
        }
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public String getConfirmCode() {
        return confirmCode;
    }
}
