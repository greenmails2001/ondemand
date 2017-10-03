package com.perp.beans;

import java.io.Serializable;

public class PerpAccountChecking implements Serializable {

    private String loginUserName;
    private String loginPassword;
    private String dbEncrytPassword;
    private String loginEncrytPassword;
    private String captchaText;

    private int status = SessionLoginObject.PERP_ACCOUNT_LOGIN_ERROR;
    
    private LoginHistoryBean loginHistoy;
    private PerpAccount perpAccount = new PerpAccount();

    public PerpAccountChecking() {
    }

    /** Private only . Khong thay doi */
    private final void setPerpAccount(PerpAccount perpAccount) {
        // Do nothing
    }

    public PerpAccount getPerpAccount() {
        if (this.isPerpAccountFound()) {
            return perpAccount;
        }
        return null;
    }

    public String toString() {
        String text =
            "\n\n-----------------------------------------------" + "\tUserName :" +
            this.loginUserName + "\n\tPassword " + this.loginPassword +
            "\n\tPerpAccountValid :" + this.isPerpAccountValid() +
            "\n-----------------------------------------------\n\n";
        return text;
    }

    public boolean isPerpLoginError() {
        return this.status == SessionLoginObject.PERP_ACCOUNT_LOGIN_ERROR;
    }

    public boolean isPerpAccountNotFound() {
        return this.status <= SessionLoginObject.PERP_ACCOUNT_NOT_FOUND;
    }

    public boolean isPerpAccountFound() {
        return this.status >= SessionLoginObject.PERP_ACCOUNT_FOUND;
    }

    public boolean isPerpAccountInvalid() {
        return this.status <= SessionLoginObject.PERP_ACCOUNT_INVALID_PASSWORD;
    }

    public boolean isPerpAccountValid() {
        return this.status >= SessionLoginObject.PERP_ACCOUNT_VALID_PASSWORD;
    }


    public void setToLoginError() {
        this.status = SessionLoginObject.PERP_ACCOUNT_LOGIN_ERROR;
    }

    public void setToPerpAccountNotFound() {
        this.status = SessionLoginObject.PERP_ACCOUNT_NOT_FOUND;
    }

    public void setToPerpAccountFound() {
        this.status = SessionLoginObject.PERP_ACCOUNT_FOUND;
    }

    public void setToPerpAccountInvalid() {
        this.status = SessionLoginObject.PERP_ACCOUNT_INVALID_PASSWORD;
    }

    public void setToPerpAccountValid() {
        this.status = SessionLoginObject.PERP_ACCOUNT_VALID_PASSWORD;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setDbEncrytPassword(String dbEncrytPassword) {
        this.dbEncrytPassword = dbEncrytPassword;
    }

    public String getDbEncrytPassword() {
        return dbEncrytPassword;
    }

    public void setLoginEncrytPassword(String loginEncrytPassword) {
        this.loginEncrytPassword = loginEncrytPassword;
    }

    public String getLoginEncrytPassword() {
        return loginEncrytPassword;
    }


    public void setCaptchaText(String captchaText) {
        this.captchaText = captchaText;
    }

    public String getCaptchaText() {
        return captchaText;
    }

    public void setLoginHistoy(LoginHistoryBean loginHistoy) {
        this.loginHistoy = loginHistoy;
    }

    public LoginHistoryBean getLoginHistoy() {
        return loginHistoy;
    }
}
