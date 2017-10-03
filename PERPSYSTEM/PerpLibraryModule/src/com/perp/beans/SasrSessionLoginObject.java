package com.perp.beans;

import java.io.Serializable;

public class SasrSessionLoginObject implements Serializable {
    private PerpSasrAccountChecking perpSasrAccountChecking;

    public SasrSessionLoginObject() {

    }

    public void setPerpSasrAccountChecking(PerpSasrAccountChecking perpSasrAccountChecking) {
        this.perpSasrAccountChecking = perpSasrAccountChecking;
    }

    public PerpSasrAccountChecking getPerpSasrAccountChecking() {
        return perpSasrAccountChecking;
    }

    public PerpSasrAccount getPerpSasrAccount() {
        if (this.perpSasrAccountChecking != null) {
            return this.perpSasrAccountChecking.getPerpSasrAccount();
        }
        return null;
    }
}
