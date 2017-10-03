package com.perp.beans;

import java.io.Serializable;

public class PerpSasSubscriptionInfo implements Serializable {

    private Long subId;
    private String organizationName;
    private String fullName;

    /**
     * Xem trong bang Service_Packages cot Package_Code .
     */
    private String packageCode;

    /** Tuong ung la cot Activated_Code trong bang Subscription
     *  De nghi doi cot Activated_Code thanh Subscription_Code .
     */
    private String subscriptionCode;


    public PerpSasSubscriptionInfo() {
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Long getSubId() {
        return subId;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }


    public void setSubscriptionCode(String subscriptionCode) {
        this.subscriptionCode = subscriptionCode;
    }

    public String getSubscriptionCode() {
        return subscriptionCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPackageCode() {
        return packageCode;
    }
}
