package com.perp.beans;

import java.io.Serializable;

public class PerpSasrAccount extends AccountBean implements Serializable {

    private boolean activated;

    public PerpSasrAccount() {
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }
}
