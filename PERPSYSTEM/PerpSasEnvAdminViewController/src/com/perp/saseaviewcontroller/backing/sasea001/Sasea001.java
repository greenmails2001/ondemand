package com.perp.saseaviewcontroller.backing.sasea001;

import com.perp.saseaviewcontroller.util.SaseaFacesUtils;

import com.perp.sasenvmodel.common.PerpSasEnvAppModule;

import javax.faces.event.ActionEvent;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Sequence;

public class Sasea001 {
  public Sasea001() {
  }

  public void createEnvActionListener(ActionEvent actionEvent) {
    // Add event code here...
    PerpSasEnvAppModule module = SaseaFacesUtils.getPerpSasEnvAppModule();
    ViewObject view =module.getSasem001Environments();
    Row row=view.createRow();
    Sequence seq= new Sequence("Env_Seq",module);
    row.setAttribute("EnvId",seq);
    row.setAttribute("SetupDate",new Date());   
    view.setCurrentRow(row);
  }
}
