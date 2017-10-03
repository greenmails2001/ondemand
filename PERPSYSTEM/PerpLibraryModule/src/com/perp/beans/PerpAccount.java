package com.perp.beans;

import java.io.Serializable;

public class PerpAccount implements Serializable {
    private Long ausId;
    private String userName;
    private String password;

    public PerpAccount() {
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

    public void setAusId(Long ausId) {
        this.ausId = ausId;
    }

    public Long getAusId() {
        return ausId;
    }
}
