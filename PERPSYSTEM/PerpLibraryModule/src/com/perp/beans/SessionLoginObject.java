package com.perp.beans;

import java.io.Serializable;

public class SessionLoginObject implements Serializable {

    /** Tuong ung voi active code not found */
    public static final int SUBSCRIPTION_NOT_FOUND = 1000;

    /** Tim thay activated code */
    public static final int SUBSCRIPTION_FOUND = SUBSCRIPTION_NOT_FOUND + 1;

    /** Truong hop co subscription , nhung khong tim thay thong tin moi truong */
    public static final int ENV_INFO_NOT_FOUND = 2000;

    /** Tim thay thong tin subscription */
    public static final int ENV_INFO_FOUND = ENV_INFO_NOT_FOUND + 1;

    /** Co thong tin ve Env
     *  Nhung khong chinh xac :
     *   - Sai host <br>
     *   - Sai port <br>
     *   - Sai username <br>
     *   - Sai password <br>
     */
    public static final int ENV_DB_INVALID = 3000;

    /** Thong tin env db hop le */
    public static final int ENV_DB_VALID = ENV_DB_INVALID + 1;

    /** Loi tim kiem trong DB Perp user */

    public static final int PERP_ACCOUNT_LOGIN_ERROR = 3500;

    /** Khong tim thay thong tin User trong Perp DB */
    public static final int PERP_ACCOUNT_NOT_FOUND = 4000;

    /** Tim thay thong tin User trong Perp DB */
    public static final int PERP_ACCOUNT_FOUND = PERP_ACCOUNT_NOT_FOUND + 1;

    /** Tim thay user trong he thong Perp nhung password khong hop le */
    public static final int PERP_ACCOUNT_INVALID_PASSWORD = 5000;

    /** Tim thay user trong he thong Perp va password hop le */
    public static final int PERP_ACCOUNT_VALID_PASSWORD =
        PERP_ACCOUNT_INVALID_PASSWORD + 1;

    /** Ket noi thanh cong */
    public static final int SUCCESSFULL = 10000;

    //private int status = 0;

    private PerpEnvChecking envChecking = new PerpEnvChecking();
    private PerpAccountChecking perpChecking = new PerpAccountChecking();

    public SessionLoginObject() {
    }

    public void setEnvChecking(PerpEnvChecking envChecking) {
        if (envChecking != null) {
            this.envChecking = envChecking;
        } else {
            this.envChecking.setToEnvInfoNotFound();
        }
    }

    public PerpEnvChecking getEnvChecking() {
        return envChecking;
    }

    public void setPerpChecking(PerpAccountChecking perpChecking) {
        if (perpChecking != null) {
            this.perpChecking = perpChecking;
        } else {
            this.perpChecking.setToPerpAccountNotFound();
        }
    }

    public PerpAccountChecking getPerpChecking() {
        return perpChecking;
    }

    // ---------------------------------------------------------------------------

    public boolean isSubscriptionNotFound() {
        return this.envChecking.isSubscriptionNotFound();
    }

    public boolean isSubscriptionFound() {
        return this.envChecking.isSubscriptionFound();
    }

    public boolean isEnvNotFound() {
        return this.envChecking.isEnvNotFound();
    }

    public boolean isEnvFound() {
        return this.envChecking.isEnvFound();
    }

    public boolean isPerpLoginError() {
        return this.perpChecking.isPerpLoginError();
    }

    public boolean isPerpAccountNotFound() {
        return this.perpChecking.isPerpAccountNotFound();
    }

    public boolean isPerpAccountFound() {
        return this.perpChecking.isPerpAccountFound();
    }

    public boolean isPerpAccountInvalid() {
        return this.perpChecking.isPerpAccountInvalid();
    }

    public boolean isPerpAccountValid() {
        return this.perpChecking.isPerpAccountValid();
    }

    // ---------------------------------------------------------------------------

    public PerpSasEnv getPerpSasEnv() {
        return this.envChecking.getPerpSasEnv();
    }

    public PerpSasSubscriptionInfo getSubscriptionInfo() {
        return this.envChecking.getSubscriptionInfo();
    }

    public PerpAccount getPerpAccount() {
        return this.perpChecking.getPerpAccount();
    }

    public String toString() {
        PerpSasEnv env = this.getPerpSasEnv();
        String info = "";
        if (env != null) {
            info +=
                    "\n\n=== Thong tin co so du lieu Perp Sas =================" +
                    "\n\tEnvId : " + env.getEnvId() + "\n\tSubId : " +
                    env.getSubId() + "\n\tSetupDate : " + env.getSetupDate() +
                    "\n\tSid : " + env.getSid() + "\n\tDbHost : " +
                    env.getDbHost() + "\n\tDbPort : " + env.getDbPort() +
                    "\n\tDbUser : " + env.getDbUser() + "\n\tDbPwd : " +
                    env.getDbPwd() + "\n\tAppHost : " + env.getAppHost() +
                    "\n\tAppPort : " + env.getAppPort() +
                    "\n\tCurrentNumOfAppUser : " +
                    env.getCurrentNumOfAppUser() + "\n\tRemovedDate : " +
                    env.getRemovedDate() + "\n\tDescription : " +
                    env.getDescription() +
                    "\n=======================================================\n\n";
        }
        return info;
    }


}
