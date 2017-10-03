package com.vc.sasnmodel.views.sasn.common;

import oracle.jbo.Row;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 22 10:48:20 ICT 2010
// ---------------------------------------------------------------------
public interface PartnersRow extends Row {
    Number getParId();

    void setParId(Number value);

    Number getPgrId();

    void setPgrId(Number value);

    String getCompanyName();

    void setCompanyName(String value);

    String getCompanyAddress();

    void setCompanyAddress(String value);

    String getCompanyTelephone();

    void setCompanyTelephone(String value);

    String getCompanyFax();

    void setCompanyFax(String value);

    String getCompanyEmail();

    void setCompanyEmail(String value);

    String getCompanyWebsite();

    void setCompanyWebsite(String value);

    String getContactPersonName();

    void setContactPersonName(String value);

    String getContactPersonPosition();

    void setContactPersonPosition(String value);

    String getContactPersonTelephone();

    void setContactPersonTelephone(String value);

    String getContactPersonEmail();

    void setContactPersonEmail(String value);

    Date getCreateDate();

    void setCreateDate(Date value);

    String getCreatedBy();

    void setCreatedBy(String value);

    Date getModifyDate();

    void setModifyDate(Date value);

    String getModifiedBy();

    void setModifiedBy(String value);

    String getDescription();

    void setDescription(String value);

    BlobDomain getImage();

    void setImage(BlobDomain value);
}
