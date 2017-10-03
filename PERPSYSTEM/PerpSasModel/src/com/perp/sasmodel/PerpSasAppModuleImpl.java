package com.perp.sasmodel;


import com.oracle.adffwkextensions.faces.FacesUtils;

import com.perp.beans.DBUtils;
import com.perp.beans.PerpAccountChecking;
import com.perp.beans.SessionLoginObject;
import com.perp.sasmodel.common.PerpSasAppModule;

import com.perp.sasmodel.views.sas.AppLoginView1Impl;
import com.perp.sasmodel.views.sas.AppLoginView1RowImpl;
import com.perp.sasmodel.views.sas.AppLoginViewImpl;
import com.perp.sasmodel.views.sas.AppLoginViewRowImpl;

import com.perp.sasmodel.views.sas.AppLoginsImpl;

import com.perp.sasmodel.views.sas.AppLoginsRowImpl;

import com.perp.sasmodel.views.sas.AppUsersRowImpl;
import com.perp.sasmodel.views.sas.DiagramProcessViewImpl;
import com.perp.sasmodel.views.sas.SasAppUsersImpl;

import com.perp.sasmodel.views.sas.SasAppUsersRowImpl;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Sequence;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 16 13:50:10 ICT 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PerpSasAppModuleImpl extends ApplicationModuleImpl implements PerpSasAppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public PerpSasAppModuleImpl() {
    }

    public PerpAccountChecking doPerpAccountChecking(String userName,
                                                     String password,
                                                     String captchaText) {

        DBTransaction transaction = this.getDBTransaction();
        String sql =
            "Select Aus.User_Name ,App_Secure.Encrypt_Password(lower(Aus.User_Name) " +
            "                                  ,?)  ,Aus.Password,Aus.Aus_Id " +
            "From   App_Users Aus Where  lower(Aus.User_Name) = ?";

        PerpAccountChecking checkingInfo = new PerpAccountChecking();
        checkingInfo.setLoginUserName(userName);
        checkingInfo.setLoginEncrytPassword(password);
        checkingInfo.setCaptchaText(captchaText);
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            pstm = transaction.createPreparedStatement(sql, 2);
            pstm.setString(1, password);
            pstm.setString(2, userName.toLowerCase());
            rs = pstm.executeQuery();
            if (rs.next()) {
                checkingInfo.setToPerpAccountFound();
                String loginEncrytPassword = rs.getString(2);
                String dbEncrytPassword = rs.getString(3);
                Long ausId = rs.getLong(4);

                checkingInfo.setLoginEncrytPassword(loginEncrytPassword);
                checkingInfo.setDbEncrytPassword(dbEncrytPassword);

                if (loginEncrytPassword != null &&
                    loginEncrytPassword.equals(dbEncrytPassword)) {
                    // Password chinh xac .
                    checkingInfo.setToPerpAccountValid();
                    checkingInfo.getPerpAccount().setAusId(ausId);
                    checkingInfo.getPerpAccount().setUserName(userName);
                    checkingInfo.getPerpAccount().setPassword(password);
                } else {
                    // Password khong chinh xac .
                    checkingInfo.setToPerpAccountInvalid();
                }
            } else {
                checkingInfo.setToPerpAccountNotFound();
            }
        } catch (Exception e) {
            checkingInfo.setToLoginError();
            System.out.println("###Error01:" + e);
            e.printStackTrace();
        } finally {
            DBUtils.close(rs);
            DBUtils.close(pstm);
        }
        return checkingInfo;
    }


    public void prepareToShowSasUserRoles(String appCode, Long ausId) {
        ViewObjectImpl view = this.getSasUserRoles();
        view.setNamedWhereClauseParam("p_App_Code", appCode);
        view.setNamedWhereClauseParam("p_Aus_Id", ausId);
        view.executeQuery();
    }
    /*
    public void prepareToShowAppLogins(String userName) {
        ViewObjectImpl view = this.getAppLogins1();
        view.setNamedWhereClauseParam("p_UserName", userName);
        view.executeQuery();
    }
    */

    public void prepareToShowAppLogins() {
        SessionLoginObject session =
            (SessionLoginObject)FacesUtils.resolveExpression("#{sessionLoginObject}");
        String userName = session.getPerpAccount().getUserName();
        ViewObjectImpl view = this.getAppLogins1();
        view.setNamedWhereClauseParam("p_UserName", userName);
        view.executeQuery();
    }

    /**
     * Container's getter for SasUserRoles.
     * @return SasUserRoles
     */
    public ViewObjectImpl getSasUserRoles() {
        return (ViewObjectImpl)findViewObject("SasUserRoles");
    }


    /**
     * Container's getter for SasMenusRootX1.
     * @return SasMenusRootX1
     */
    public ViewObjectImpl getSasMenusRootX1() {
        return (ViewObjectImpl)findViewObject("SasMenusRootX1");
    }

    /**
     * Container's getter for SasMenusRoot_SasUserRoles1.
     * @return SasMenusRoot_SasUserRoles1
     */
    public ViewLinkImpl getSasMenusRoot_SasUserRoles1() {
        return (ViewLinkImpl)findViewLink("SasMenusRoot_SasUserRoles1");
    }

    /**
     * Container's getter for SasMenusSearch.
     * @return SasMenusSearch
     */
    public ViewObjectImpl getSasMenusSearch() {
        return (ViewObjectImpl)findViewObject("SasMenusSearch");
    }

    public void prepareToShowSasMenusSearch(String appCode, Long ausId,
                                            String searchText, String findIn) {
        ViewObjectImpl view = this.getSasMenusSearch();
        view.setNamedWhereClauseParam("p_App_Code", appCode);
        view.setNamedWhereClauseParam("p_Aus_Id", ausId);
        view.setNamedWhereClauseParam("p_Search_Text", searchText);
        view.setNamedWhereClauseParam("p_Find_In", findIn);
        view.executeQuery();
    }


    /**
     * Container's getter for SasMenusX2.
     * @return SasMenusX2
     */
    public ViewObjectImpl getSasMenusX2() {
        return (ViewObjectImpl)findViewObject("SasMenusX2");
    }

    /**
     * Container's getter for SasMenus_SasMenusRoot1.
     * @return SasMenus_SasMenusRoot1
     */
    public ViewLinkImpl getSasMenus_SasMenusRoot1() {
        return (ViewLinkImpl)findViewLink("SasMenus_SasMenusRoot1");
    }


    /**
     * Container's getter for Adv01OrganizationUnitsRoot.
     * @return Adv01OrganizationUnitsRoot
     */
    public ViewObjectImpl getAdv01OrganizationUnitsRoot() {
        return (ViewObjectImpl)findViewObject("Adv01OrganizationUnitsRoot");
    }

    /**
     * Container's getter for Adv01OrganizationUnitsListInRoot.
     * @return Adv01OrganizationUnitsListInRoot
     */
    public ViewObjectImpl getAdv01OrganizationUnitsListInRoot() {
        return (ViewObjectImpl)findViewObject("Adv01OrganizationUnitsListInRoot");
    }

    /**
     * Container's getter for Oun_OunRoot1.
     * @return Oun_OunRoot1
     */
    public ViewLinkImpl getOun_OunRoot1() {
        return (ViewLinkImpl)findViewLink("Oun_OunRoot1");
    }

    /**
     * Container's getter for Adv02OrganizationUnitsP01.
     * @return Adv02OrganizationUnitsP01
     */
    public ViewObjectImpl getAdv02OrganizationUnitsP01() {
        return (ViewObjectImpl)findViewObject("Adv02OrganizationUnitsP01");
    }

    /**
     * Container's getter for Adv02CostCentersListInOun.
     * @return Adv02CostCentersListInOun
     */
    public ViewObjectImpl getAdv02CostCentersListInOun() {
        return (ViewObjectImpl)findViewObject("Adv02CostCentersListInOun");
    }

    /**
     * Container's getter for Cce_OunP01_1.
     * @return Cce_OunP01_1
     */
    public ViewLinkImpl getCce_OunP01_1() {
        return (ViewLinkImpl)findViewLink("Cce_OunP01_1");
    }


    public void prepareToShowAdv02OrganizationUnitsP01(oracle.jbo.domain.Number ounId) {
        ViewObjectImpl view = getAdv02OrganizationUnitsP01();
        view.setNamedWhereClauseParam("p_Oun_Id", ounId);
        view.executeQuery();
    }

    public void createAppLogin(String userName, String envId, String browser,
                               Date loginAt, String ipAddress,
                               String country) {
        ViewObjectImpl view = this.getAppLogins1();
        AppLoginsRowImpl row = (AppLoginsRowImpl)view.createRow();
        Sequence aloSeq = new Sequence("Aplo_Seq", this);
        oracle.jbo.domain.Number aloId =
            new oracle.jbo.domain.Number(aloSeq.getValue());
        row.setAloId(aloId);
        row.setEnvId(envId);
        row.setUserName(userName);
        row.setBrowser(browser);
        row.setLoginAt(loginAt);
        row.setIpAddress(ipAddress);
        row.setCountry(country);
        view.insertRow(row);
        this.getDBTransaction().commit();
    }


    /**
     * Container's getter for AppLogins1.
     * @return AppLogins1
     */
    public ViewObjectImpl getAppLogins1() {
        return (ViewObjectImpl)findViewObject("AppLogins1");
    }

    /**
     * Container's getter for SasAppUsers1.
     * @return SasAppUsers1
     */
    public SasAppUsersImpl getSasAppUsers1() {
        return (SasAppUsersImpl)findViewObject("SasAppUsers1");
    }

    public PerpAccountChecking doPerpSasLogin(String userName, String password,
                                              String captchaText,
                                              String subscriptionCode) {
        return null;
    }


    /**
     * Container's getter for DiagramProcessView1.
     * @return DiagramProcessView1
     */
    public ViewObjectImpl getDiagramProcessView1() {
        return (ViewObjectImpl)findViewObject("DiagramProcessView1");
    }

    public void prepareToShowDiagramProcesses(String appCode) {
        ViewObjectImpl view = this.getDiagramProcessView1();
        view.setNamedWhereClauseParam("p_App_Code", appCode);
        view.executeQuery();
    }

    public boolean doChangePassword(Long ausId, String newPassword) {
        DBTransaction transaction = this.getDBTransaction();
        int rows = 0;
        String plsql =
            " BEGIN " + " UPDATE APP_USERS " + " SET PASSWORD = App_Secure.Encrypt_Password(lower(User_Name),?)" +
            " WHERE AUS_ID = ?;" + " END; ";
        CallableStatement statement = null;
        try {
            statement = transaction.createCallableStatement(plsql, 2);
            statement.setString(1, newPassword);
            statement.setLong(2, ausId);

            rows = statement.executeUpdate();
            transaction.commit();
        } catch (SQLException s) {
            throw new JboException(s);
        } finally {
            try {
                if (statement != null)
                    statement.close();
                return true;
            } catch (SQLException s) {
                System.out.print(s.getMessage());
            }
        }
        return true;
    }

    /**
     * Container's getter for AppUsers1.
     * @return AppUsers1
     */
    public ViewObjectImpl getAppUsers1() {
        return (ViewObjectImpl)findViewObject("AppUsers1");
    }
}
