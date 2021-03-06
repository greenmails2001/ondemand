package com.perp.sasregistmodel.views.sasr002;

import com.perp.sasregistmodel.entities.VbisUsersImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 22 09:03:32 ICT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VbisUsersViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        VusId {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getVusId();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setVusId((Number)value);
            }
        }
        ,
        UserName {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getUserName();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setUserName((String)value);
            }
        }
        ,
        Password {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getPassword();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setPassword((String)value);
            }
        }
        ,
        Password1 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getPassword1();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setPassword1((String)value);
            }
        }
        ,
        Password2 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getPassword2();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setPassword2((String)value);
            }
        }
        ,
        FullName {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getFullName();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setFullName((String)value);
            }
        }
        ,
        ContactTelephone {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getContactTelephone();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setContactTelephone((String)value);
            }
        }
        ,
        Email {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getEmail();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        OrganizationName {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getOrganizationName();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setOrganizationName((String)value);
            }
        }
        ,
        Address {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAddress();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAddress((String)value);
            }
        }
        ,
        TaxCode {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getTaxCode();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setTaxCode((String)value);
            }
        }
        ,
        ActivedCode {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getActivedCode();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setActivedCode((String)value);
            }
        }
        ,
        Status {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getStatus();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        ActivatedFlag {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getActivatedFlag();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setActivatedFlag((String)value);
            }
        }
        ,
        SubId {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getSubId();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setSubId((Number)value);
            }
        }
        ,
        CreateDate {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getCreateDate();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setCreateDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        ModifyDate {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getModifyDate();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setModifyDate((Date)value);
            }
        }
        ,
        ModifiedBy {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getModifiedBy();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setModifiedBy((String)value);
            }
        }
        ,
        Attribute1 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute1();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute2();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute3();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute4();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute5();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute6();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute7();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute8();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute9();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAttribute10();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        AccId {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAccId();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAccId((Number)value);
            }
        }
        ,
        Accounts {
            public Object get(VbisUsersViewRowImpl obj) {
                return obj.getAccounts();
            }

            public void put(VbisUsersViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(VbisUsersViewRowImpl object);

        public abstract void put(VbisUsersViewRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int VUSID = AttributesEnum.VusId.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int PASSWORD1 = AttributesEnum.Password1.index();
    public static final int PASSWORD2 = AttributesEnum.Password2.index();
    public static final int FULLNAME = AttributesEnum.FullName.index();
    public static final int CONTACTTELEPHONE = AttributesEnum.ContactTelephone.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int ORGANIZATIONNAME = AttributesEnum.OrganizationName.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int TAXCODE = AttributesEnum.TaxCode.index();
    public static final int ACTIVEDCODE = AttributesEnum.ActivedCode.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int ACTIVATEDFLAG = AttributesEnum.ActivatedFlag.index();
    public static final int SUBID = AttributesEnum.SubId.index();
    public static final int CREATEDATE = AttributesEnum.CreateDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int MODIFYDATE = AttributesEnum.ModifyDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ACCID = AttributesEnum.AccId.index();
    public static final int ACCOUNTS = AttributesEnum.Accounts.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VbisUsersViewRowImpl() {
    }

    /**
     * Gets VbisUsers entity object.
     * @return the VbisUsers
     */
    public VbisUsersImpl getVbisUsers() {
        return (VbisUsersImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for VUS_ID using the alias name VusId.
     * @return the VUS_ID
     */
    public Number getVusId() {
        return (Number) getAttributeInternal(VUSID);
    }

    /**
     * Sets <code>value</code> as attribute value for VUS_ID using the alias name VusId.
     * @param value value to set the VUS_ID
     */
    public void setVusId(Number value) {
        setAttributeInternal(VUSID, value);
    }

    /**
     * Gets the attribute value for USER_NAME using the alias name UserName.
     * @return the USER_NAME
     */
    public String getUserName() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_NAME using the alias name UserName.
     * @param value value to set the USER_NAME
     */
    public void setUserName(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for PASSWORD using the alias name Password.
     * @return the PASSWORD
     */
    public String getPassword() {
        return (String) getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSWORD using the alias name Password.
     * @param value value to set the PASSWORD
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
    }

    /**
     * Gets the attribute value for PASSWORD1 using the alias name Password1.
     * @return the PASSWORD1
     */
    public String getPassword1() {
        return (String) getAttributeInternal(PASSWORD1);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSWORD1 using the alias name Password1.
     * @param value value to set the PASSWORD1
     */
    public void setPassword1(String value) {
        setAttributeInternal(PASSWORD1, value);
    }

    /**
     * Gets the attribute value for PASSWORD2 using the alias name Password2.
     * @return the PASSWORD2
     */
    public String getPassword2() {
        return (String) getAttributeInternal(PASSWORD2);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSWORD2 using the alias name Password2.
     * @param value value to set the PASSWORD2
     */
    public void setPassword2(String value) {
        setAttributeInternal(PASSWORD2, value);
    }

    /**
     * Gets the attribute value for FULL_NAME using the alias name FullName.
     * @return the FULL_NAME
     */
    public String getFullName() {
        return (String) getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FULL_NAME using the alias name FullName.
     * @param value value to set the FULL_NAME
     */
    public void setFullName(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the attribute value for CONTACT_TELEPHONE using the alias name ContactTelephone.
     * @return the CONTACT_TELEPHONE
     */
    public String getContactTelephone() {
        return (String) getAttributeInternal(CONTACTTELEPHONE);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTACT_TELEPHONE using the alias name ContactTelephone.
     * @param value value to set the CONTACT_TELEPHONE
     */
    public void setContactTelephone(String value) {
        setAttributeInternal(CONTACTTELEPHONE, value);
    }

    /**
     * Gets the attribute value for EMAIL using the alias name Email.
     * @return the EMAIL
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for EMAIL using the alias name Email.
     * @param value value to set the EMAIL
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for ORGANIZATION_NAME using the alias name OrganizationName.
     * @return the ORGANIZATION_NAME
     */
    public String getOrganizationName() {
        return (String) getAttributeInternal(ORGANIZATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for ORGANIZATION_NAME using the alias name OrganizationName.
     * @param value value to set the ORGANIZATION_NAME
     */
    public void setOrganizationName(String value) {
        setAttributeInternal(ORGANIZATIONNAME, value);
    }

    /**
     * Gets the attribute value for ADDRESS using the alias name Address.
     * @return the ADDRESS
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for ADDRESS using the alias name Address.
     * @param value value to set the ADDRESS
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for TAX_CODE using the alias name TaxCode.
     * @return the TAX_CODE
     */
    public String getTaxCode() {
        return (String) getAttributeInternal(TAXCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_CODE using the alias name TaxCode.
     * @param value value to set the TAX_CODE
     */
    public void setTaxCode(String value) {
        setAttributeInternal(TAXCODE, value);
    }

    /**
     * Gets the attribute value for ACTIVED_CODE using the alias name ActivedCode.
     * @return the ACTIVED_CODE
     */
    public String getActivedCode() {
        return (String) getAttributeInternal(ACTIVEDCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVED_CODE using the alias name ActivedCode.
     * @param value value to set the ACTIVED_CODE
     */
    public void setActivedCode(String value) {
        setAttributeInternal(ACTIVEDCODE, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for ACTIVATED_FLAG using the alias name ActivatedFlag.
     * @return the ACTIVATED_FLAG
     */
    public String getActivatedFlag() {
        return (String) getAttributeInternal(ACTIVATEDFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVATED_FLAG using the alias name ActivatedFlag.
     * @param value value to set the ACTIVATED_FLAG
     */
    public void setActivatedFlag(String value) {
        setAttributeInternal(ACTIVATEDFLAG, value);
    }

    /**
     * Gets the attribute value for SUB_ID using the alias name SubId.
     * @return the SUB_ID
     */
    public Number getSubId() {
        return (Number) getAttributeInternal(SUBID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_ID using the alias name SubId.
     * @param value value to set the SUB_ID
     */
    public void setSubId(Number value) {
        setAttributeInternal(SUBID, value);
    }

    /**
     * Gets the attribute value for CREATE_DATE using the alias name CreateDate.
     * @return the CREATE_DATE
     */
    public Date getCreateDate() {
        return (Date) getAttributeInternal(CREATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATE_DATE using the alias name CreateDate.
     * @param value value to set the CREATE_DATE
     */
    public void setCreateDate(Date value) {
        setAttributeInternal(CREATEDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFY_DATE using the alias name ModifyDate.
     * @return the MODIFY_DATE
     */
    public Date getModifyDate() {
        return (Date) getAttributeInternal(MODIFYDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFY_DATE using the alias name ModifyDate.
     * @param value value to set the MODIFY_DATE
     */
    public void setModifyDate(Date value) {
        setAttributeInternal(MODIFYDATE, value);
    }

    /**
     * Gets the attribute value for MODIFIED_BY using the alias name ModifiedBy.
     * @return the MODIFIED_BY
     */
    public String getModifiedBy() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_BY using the alias name ModifiedBy.
     * @param value value to set the MODIFIED_BY
     */
    public void setModifiedBy(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @return the ATTRIBUTE1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @param value value to set the ATTRIBUTE1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @return the ATTRIBUTE2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @param value value to set the ATTRIBUTE2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @return the ATTRIBUTE3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @param value value to set the ATTRIBUTE3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @return the ATTRIBUTE4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @param value value to set the ATTRIBUTE4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @return the ATTRIBUTE5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @param value value to set the ATTRIBUTE5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @return the ATTRIBUTE6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @param value value to set the ATTRIBUTE6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @return the ATTRIBUTE7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @param value value to set the ATTRIBUTE7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @return the ATTRIBUTE8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @param value value to set the ATTRIBUTE8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @return the ATTRIBUTE9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @param value value to set the ATTRIBUTE9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @return the ATTRIBUTE10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @param value value to set the ATTRIBUTE10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for ACC_ID using the alias name AccId.
     * @return the ACC_ID
     */
    public Number getAccId() {
        return (Number) getAttributeInternal(ACCID);
    }

    /**
     * Sets <code>value</code> as attribute value for ACC_ID using the alias name AccId.
     * @param value value to set the ACC_ID
     */
    public void setAccId(Number value) {
        setAttributeInternal(ACCID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link Accounts.
     */
    public RowIterator getAccounts() {
        return (RowIterator)getAttributeInternal(ACCOUNTS);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
