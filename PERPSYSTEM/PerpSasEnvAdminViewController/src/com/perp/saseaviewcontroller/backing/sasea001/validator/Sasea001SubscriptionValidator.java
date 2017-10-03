package com.perp.saseaviewcontroller.backing.sasea001.validator;

import com.perp.saseaviewcontroller.util.SaseaFacesUtils;

import com.perp.sasenvmodel.common.PerpSasEnvAppModule;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.DBSequence;

public class Sasea001SubscriptionValidator implements Validator {
  public Sasea001SubscriptionValidator() {
  }

  public void validate(FacesContext facesContext, UIComponent uiComponent,
                       Object object) {
    FacesMessage fm = null;
    RichInputText richText = (RichInputText)uiComponent;
    oracle.jbo.domain.Number subId2 =
      (oracle.jbo.domain.Number)richText.getValue();
    if (subId2 == null) {
      fm = new FacesMessage("Error", "Subscription required");
      throw new ValidatorException(fm);
    }
    PerpSasEnvAppModule module = SaseaFacesUtils.getPerpSasEnvAppModule();
    ViewObject view =module.getSasem001Environments();
    Row row =view.getCurrentRow();
    DBSequence seq = (DBSequence)row.getAttribute("EnvId");
    Long envId = seq.getValue();
    Long subId = subId2.longValue();
    int count =module.getCountSubscriptionExceptEnvId(envId,subId);
    if(count>0) {
      fm = new FacesMessage("Error", "Sub_Id "+subId+" not unique");
      throw new ValidatorException(fm);
    }    
  }
}
