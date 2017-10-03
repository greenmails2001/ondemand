package com.perp.sasenvmodel;

import com.perp.beans.DBUtils;
import com.perp.sasenvmodel.common.PerpSasEnvAppModule;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jbo.JboException;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 24 09:25:20 ICT 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PerpSasEnvAppModuleImpl extends ApplicationModuleImpl implements PerpSasEnvAppModule {
  /**
   * This is the default constructor (do not remove).
   */
  public PerpSasEnvAppModuleImpl() {
  }

  /**
   * Container's getter for Sasem001Environments.
   * @return Sasem001Environments
   */
  public ViewObject getSasem001Environments() {
    return findViewObject("Sasem001Environments");
  }

  /**
   * Container's getter for Sasem001LovSubscriptionViewDetails.
   * @return Sasem001LovSubscriptionViewDetails
   */
  public ViewObject getSasem001LovSubscriptionViewDetails() {
    return findViewObject("Sasem001LovSubscriptionViewDetails");
  }

  /**
   * Tinh tong so Sub_Id co gia tri nhu trong tham so , khong tinh Env_Id .
   * Method nay su dung de kiem tra tinh duy nhat cua Sub_Id trong bang Environments .
   * @param envId
   */
  public int getCountSubscriptionExceptEnvId(Long envId, Long subId) {
    String sql =
      "Select Count(1) " + "From   Environments Env " + "Where  Env.Sub_Id = :p_Sub_Id " +
      "And    Env.Env_Id <> :p_Env_Id";
    PreparedStatement pstm = null;
    ResultSet rs = null;
    try {
      pstm = this.getDBTransaction().createPreparedStatement(sql, 2);
      pstm.setLong(1, subId);
      pstm.setLong(2, envId);
      rs = pstm.executeQuery();
      if (rs.next()) {
        return rs.getInt(1);
      }
    } catch (SQLException e) {
      throw new JboException(e.getMessage());
    } finally {
      DBUtils.close(pstm);
    }
    return 0;
  }

  public void test() {
  }
}
