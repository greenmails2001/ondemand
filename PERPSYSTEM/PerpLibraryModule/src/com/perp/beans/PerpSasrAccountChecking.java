package com.perp.beans;

import java.io.Serializable;

import java.util.Random;

public class PerpSasrAccountChecking implements Serializable {

    private static final int USER_NOT_FOUND = 100;
    private static final int USER_FOUND = USER_NOT_FOUND + 1;
    private static final int PASSWORD_INVALID = 200;
    private static final int PASSWORD_VALID = PASSWORD_INVALID + 1;

    private static final int ACCOUNT_NOT_ACTIVATED = 400;
    private static final int ACCOUNT_ACTIVATED = ACCOUNT_NOT_ACTIVATED + 1;

    private int status = USER_NOT_FOUND;

    private LoginHistoryBean loginHistoy;
    private PerpSasrAccount perpSasrAccount = new PerpSasrAccount();

    public PerpSasrAccountChecking() {
    }

    public PerpSasrAccount getPerpSasrAccount() {
        if (this.isPasswordValid()) {
            return this.perpSasrAccount;
        }
        return null;
    }

    public void setPerpSasrAccount(PerpSasrAccount perpSasrAccount) {
        this.perpSasrAccount = perpSasrAccount;
    }

    public boolean isUserFound() {
        return this.status >= USER_FOUND;
    }

    public boolean isPasswordValid() {
        return this.status >= PASSWORD_VALID;
    }

    public boolean isAccountActivated() {
        return this.status >= ACCOUNT_ACTIVATED;
    }

    public void setToUserNotFound() {
        this.status = USER_NOT_FOUND;
    }

    public void setToUserFound() {
        this.status = USER_FOUND;
    }

    public void setToPasswordInvalid() {
        this.status = PASSWORD_INVALID;
    }

    public void setToPasswordValid() {
        this.status = PASSWORD_VALID;
    }

    public void setToAccountNotActivated() {
        this.status = ACCOUNT_NOT_ACTIVATED;
    }

    public void setToAccountActivated() {
        this.status = ACCOUNT_ACTIVATED;
    }

    public boolean isIsAdmin() {
        if (this.perpSasrAccount != null) {
            String isAdmin = this.perpSasrAccount.getIsAdmin();
            return isAdmin != null ? isAdmin.equals("Y") : false;
        }
        return false;
    }

    public void setLoginHistoy(LoginHistoryBean loginHistoy) {
        this.loginHistoy = loginHistoy;
    }

    public LoginHistoryBean getLoginHistoy() {
        return loginHistoy;
    }
}
