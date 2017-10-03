package com.perp.beans;

import java.io.Serializable;
import oracle.jbo.domain.Number;

public class PerpEnvChecking implements Serializable {

    private PerpSasEnv perpEnv = new PerpSasEnv();
    private PerpSasSubscriptionInfo subscriptionInfo =
        new PerpSasSubscriptionInfo();

    private int status = SessionLoginObject.SUBSCRIPTION_NOT_FOUND;
    private Long subId;
    private Number accId;
    
    public PerpEnvChecking() {
    }

    /** Private only . Khong thay doi */
    private final void setPerpSasEnv(PerpSasEnv perpEnv) {
        // Do nothing
    }

    public PerpSasEnv getPerpSasEnv() {
        if (this.isEnvFound()) {
            return this.perpEnv;
        }
        return null;
    }

    public PerpSasSubscriptionInfo getSubscriptionInfo() {
        if (this.isSubscriptionFound()) {
            return this.subscriptionInfo;
        }
        return null;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Long getSubId() {
        return subId;
    }

    public boolean isSubscriptionNotFound() {
        return this.status <= SessionLoginObject.SUBSCRIPTION_NOT_FOUND;
    }

    public boolean isSubscriptionFound() {
        return this.status >= SessionLoginObject.SUBSCRIPTION_FOUND;
    }

    public boolean isEnvNotFound() {
        return this.status <= SessionLoginObject.ENV_INFO_NOT_FOUND;
    }

    public boolean isEnvFound() {
        return this.status >= SessionLoginObject.ENV_INFO_FOUND;
    }

    public void setToSubscriptionNotFound() {
        this.status = SessionLoginObject.SUBSCRIPTION_NOT_FOUND;
    }

    public void setToSubscriptionFound() {
        this.status = SessionLoginObject.SUBSCRIPTION_FOUND;
    }


    public void setToEnvInfoNotFound() {
        this.status = SessionLoginObject.ENV_INFO_NOT_FOUND;
    }

    public void setToEnvInfoFound() {
        this.status = SessionLoginObject.ENV_INFO_FOUND;
    }


    public void setAccId(Number accId) {
        this.accId = accId;
    }

    public Number getAccId() {
        return accId;
    }
}
