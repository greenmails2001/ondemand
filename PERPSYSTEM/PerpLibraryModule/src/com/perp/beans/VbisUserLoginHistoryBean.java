
package com.perp.beans;

import java.io.Serializable;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;

public class VbisUserLoginHistoryBean implements Serializable {
    private Number accId;
    private Number vulId;
    private String envId;
    private Date loginAt;
    private String userName;
    private String ipAddress;
    private String module;
    private String platform;
    private String userAgent;
    private String country;
    private Date logoutAt;
    private String status;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;


    public VbisUserLoginHistoryBean() {
        super();
    }

    public void setVulId(Number vulId) {
        this.vulId = vulId;
    }

    public Number getVulId() {
        return vulId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public String getEnvId() {
        return envId;
    }

    public void setLoginAt(Date loginAt) {
        this.loginAt = loginAt;
    }

    public Date getLoginAt() {
        return loginAt;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModule() {
        return module;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setLogoutAt(Date logoutAt) {
        this.logoutAt = logoutAt;
    }

    public Date getLogoutAt() {
        return logoutAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAccId(Number accId) {
        this.accId = accId;
    }

    public Number getAccId() {
        return accId;
    }
}
