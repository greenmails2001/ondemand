package com.vc.sasnmodel.views.sasn.common;

import oracle.jbo.Row;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 22 00:10:50 ICT 2010
// ---------------------------------------------------------------------
public interface ConsultantsRow extends Row {
    Number getConId();

    void setConId(Number value);

    Number getCcaId();

    void setCcaId(Number value);

    String getQuestion();

    void setQuestion(String value);

    ClobDomain getAnswer();

    void setAnswer(ClobDomain value);

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
}