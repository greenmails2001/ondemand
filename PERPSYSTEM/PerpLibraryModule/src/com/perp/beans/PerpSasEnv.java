package com.perp.beans;

import java.io.Serializable;

import java.sql.Timestamp;

public class PerpSasEnv implements Serializable {

    private Long envId;
    private Long subId;
    private String dbHost;
    private int dbPort;
    private String sid;
    private String dbUser;
    private String dbPwd;
    private String appHost;
    private Timestamp setupDate;
    private Timestamp removedDate;
    private int currentNumOfAppUser;
    private String description;
    private String activatedCode;
    private String jdbcURL;
    private int appPort;


    public PerpSasEnv() {
    }

    public String getConnectionURL() {
        if (this.jdbcURL != null || !this.jdbcURL.isEmpty())
            return this.jdbcURL;

        String connUrl =
            "jdbc:oracle:thin:@" + this.dbHost + ":" + this.dbPort + ":" +
            this.sid;
        //System.out.println("PerpSasEnv.getConnectionURL()=" + connUrl);
        return connUrl;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Long getSubId() {
        return subId;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbPort(int dbPort) {
        this.dbPort = dbPort;
    }

    public int getDbPort() {
        return dbPort;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbPwd(String dbPwd) {
        this.dbPwd = dbPwd;
    }

    public String getDbPwd() {
        return dbPwd;
    }

    public void setAppHost(String appHost) {
        this.appHost = appHost;
    }

    public String getAppHost() {
        return appHost;
    }

    public void setSetupDate(Timestamp setupDate) {
        this.setupDate = setupDate;
    }

    public Timestamp getSetupDate() {
        return setupDate;
    }

    public void setRemovedDate(Timestamp removedDate) {
        this.removedDate = removedDate;
    }

    public Timestamp getRemovedDate() {
        return removedDate;
    }

    public void setCurrentNumOfAppUser(int currentNumOfAppUser) {
        this.currentNumOfAppUser = currentNumOfAppUser;
    }

    public int getCurrentNumOfAppUser() {
        return currentNumOfAppUser;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAppPort(int appPort) {
        this.appPort = appPort;
    }

    public int getAppPort() {
        return appPort;
    }

    public void setActivatedCode(String activatedCode) {
        this.activatedCode = activatedCode;
    }

    public String getActivatedCode() {
        return activatedCode;
    }

    public void setJdbcURL(String jdbcURL) {
        this.jdbcURL = jdbcURL;
    }

    public String getJdbcURL() {
        return jdbcURL;
    }
}
