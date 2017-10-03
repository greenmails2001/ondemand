package com.perp.saseaviewcontroller.util;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.perp.sasenvmodel.common.PerpSasEnvAppModule;

public class SaseaFacesUtils {
  public SaseaFacesUtils() {
  }
  
  public static PerpSasEnvAppModule getPerpSasEnvAppModule() {
     return (PerpSasEnvAppModule)FacesUtils.getApplicationModuleForDataControl("PerpSasEnvAppModuleDataControl");
  }
                                                    
}
