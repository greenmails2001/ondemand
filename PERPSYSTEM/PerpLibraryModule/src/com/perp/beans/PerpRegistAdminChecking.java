package com.perp.beans;

import java.io.Serializable;

public class PerpRegistAdminChecking implements Serializable {

    private String userName;
    private String password;

    public PerpRegistAdminChecking() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
