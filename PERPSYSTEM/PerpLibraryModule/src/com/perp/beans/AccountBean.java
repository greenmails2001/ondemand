package com.perp.beans;


import java.io.Serializable;

import oracle.jbo.domain.Number;

public class AccountBean implements Serializable {
    private Number accId;
    private String fullName;
    private String contactTelephone;
    private String email;
    private String organizationName;
    private Number proId;
    private String address;
    private String taxCode;
    private Number rolId;
    private Number numberOfEmployee;
    private String customerApproach;
    private String userName;
    private String password;
    private String confirmPassword;
    private String activedCode;
    private Number couId;
    private Number indId;
    private String status;
    private Number squId;
    private String securityAnswer;
    private Number mmeId;
    private Number labId;
    private String activatedFlag;
    private String isAdmin;

    public AccountBean() {
        super();
    }

    public void setAccId(Number accId) {
        this.accId = accId;
    }

    public Number getAccId() {
        return accId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setProId(Number proId) {
        this.proId = proId;
    }

    public Number getProId() {
        return proId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxCode() {
        return taxCode;
    }


    public void setNumberOfEmployee(Number numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public Number getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setCustomerApproach(String customerApproach) {
        this.customerApproach = customerApproach;
    }

    public String getCustomerApproach() {
        return customerApproach;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public void setCouId(Number couId) {
        this.couId = couId;
    }

    public Number getCouId() {
        return couId;
    }

    public void setIndId(Number indId) {
        this.indId = indId;
    }

    public Number getIndId() {
        return indId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setSquId(Number squId) {
        this.squId = squId;
    }

    public Number getSquId() {
        return squId;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setMmeId(Number mmeId) {
        this.mmeId = mmeId;
    }

    public Number getMmeId() {
        return mmeId;
    }

    public void setLabId(Number labId) {
        this.labId = labId;
    }

    public Number getLabId() {
        return labId;
    }

    public void setActivatedFlag(String activatedFlag) {
        this.activatedFlag = activatedFlag;
    }

    public String getActivatedFlag() {
        return activatedFlag;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setActivedCode(String activedCode) {
        this.activedCode = activedCode;
    }

    public String getActivedCode() {
        return activedCode;
    }

    public void setRolId(Number rolId) {
        this.rolId = rolId;
    }

    public Number getRolId() {
        return rolId;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getIsAdmin() {
        return isAdmin;
    }
}
