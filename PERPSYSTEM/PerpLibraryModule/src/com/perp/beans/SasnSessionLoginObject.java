package com.perp.beans;

import java.io.Serializable;


public class SasnSessionLoginObject implements Serializable {
    private boolean logined = false;

    public SasnSessionLoginObject() {
        super();
    }

    public boolean isSasnAdmin() {
        return logined;
    }

    public void setSasnAdmin(boolean logined) {
        this.logined = logined;
    }


}
