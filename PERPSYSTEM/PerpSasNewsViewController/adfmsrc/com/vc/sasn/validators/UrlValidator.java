package com.vc.sasn.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;

import javax.faces.validator.ValidatorException;


public class UrlValidator implements Validator {
    public UrlValidator() {
        super();
    }

    public void validate(FacesContext facesContext, UIComponent uiComponent,
                         Object object) {
        if (object instanceof String) {
            String text = (String)object;
            if (text != null && !text.trim().startsWith("http")) {
                FacesMessage message = new FacesMessage();
                message.setDetail("Link khong chinh xac, khong co http");
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                facesContext.addMessage(uiComponent.getClientId(facesContext),
                                        message);
                throw new ValidatorException(message);
            }
        }
    }
}
