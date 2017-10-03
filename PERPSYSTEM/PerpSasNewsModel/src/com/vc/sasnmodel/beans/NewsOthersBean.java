package com.vc.sasnmodel.beans;

import java.io.Serializable;

import oracle.jbo.domain.ClobDomain;

public class NewsOthersBean implements Serializable {
    private String notNumber;
    private String title;
    private ClobDomain content;
    private String description;

    public void setNotNumber(String notNumber) {
        this.notNumber = notNumber;
    }

    public String getNotNumber() {
        return notNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(ClobDomain content) {
        this.content = content;
    }

    public ClobDomain getContent() {
        return content;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
