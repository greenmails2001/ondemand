package com.vc.sasnmodel.views.sasn.client;

import oracle.jbo.client.remote.RowImpl;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 20 22:33:10 ICT 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ServicesRowClient extends RowImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ServicesRowClient() {
    }

    public Number getSerId() {
        return (Number)getAttribute("SerId");
    }

    public void setSerId(Number value) {
        setAttribute("SerId", value);
    }

    public String getTitle() {
        return (String)getAttribute("Title");
    }

    public void setTitle(String value) {
        setAttribute("Title", value);
    }

    public ClobDomain getContent() {
        return (ClobDomain)getAttribute("Content");
    }

    public void setContent(ClobDomain value) {
        setAttribute("Content", value);
    }

    public Date getCreateDate() {
        return (Date)getAttribute("CreateDate");
    }

    public void setCreateDate(Date value) {
        setAttribute("CreateDate", value);
    }

    public String getCreatedBy() {
        return (String)getAttribute("CreatedBy");
    }

    public void setCreatedBy(String value) {
        setAttribute("CreatedBy", value);
    }

    public Date getModifyDate() {
        return (Date)getAttribute("ModifyDate");
    }

    public void setModifyDate(Date value) {
        setAttribute("ModifyDate", value);
    }

    public String getModifiedBy() {
        return (String)getAttribute("ModifiedBy");
    }

    public void setModifiedBy(String value) {
        setAttribute("ModifiedBy", value);
    }

    public String getDescription() {
        return (String)getAttribute("Description");
    }

    public void setDescription(String value) {
        setAttribute("Description", value);
    }

    public Number getPriorityOrder() {
        return (Number)getAttribute("PriorityOrder");
    }

    public void setPriorityOrder(Number value) {
        setAttribute("PriorityOrder", value);
    }
}
