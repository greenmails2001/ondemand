package com.vc.sasnmodel.views.sasn.client;

import oracle.jbo.client.remote.RowImpl;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 22 00:44:36 ICT 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NewsRowClient extends RowImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public NewsRowClient() {
    }

    public Number getNewsId() {
        return (Number)getAttribute("NewsId");
    }

    public void setNewsId(Number value) {
        setAttribute("NewsId", value);
    }

    public Number getNcaId() {
        return (Number)getAttribute("NcaId");
    }

    public void setNcaId(Number value) {
        setAttribute("NcaId", value);
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

    public Number getPriorityLevel() {
        return (Number)getAttribute("PriorityLevel");
    }

    public void setPriorityLevel(Number value) {
        setAttribute("PriorityLevel", value);
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

    public String getShortContent() {
        return (String)getAttribute("ShortContent");
    }

    public void setShortContent(String value) {
        setAttribute("ShortContent", value);
    }

    public String getBookmarkCode() {
        return (String)getAttribute("BookmarkCode");
    }

    public void setBookmarkCode(String value) {
        setAttribute("BookmarkCode", value);
    }

    public Number getIreIdSmall() {
        return (Number)getAttribute("IreIdSmall");
    }

    public void setIreIdSmall(Number value) {
        setAttribute("IreIdSmall", value);
    }

    public Number getIreIdMedium() {
        return (Number)getAttribute("IreIdMedium");
    }

    public void setIreIdMedium(Number value) {
        setAttribute("IreIdMedium", value);
    }

    public Date getNewsDate() {
        return (Date)getAttribute("NewsDate");
    }

    public void setNewsDate(Date value) {
        setAttribute("NewsDate", value);
    }
}
