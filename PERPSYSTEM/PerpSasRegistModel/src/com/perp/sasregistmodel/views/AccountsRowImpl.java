package com.perp.sasregistmodel.views;

import com.perp.sasregistmodel.entities.AccountsImpl;

import com.perp.sasregistmodel.views.common.AccountsRow;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 08 14:05:50 ICT 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AccountsRowImpl extends ViewRowImpl implements AccountsRow {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        AccId {
            public Object get(AccountsRowImpl obj) {
                return obj.getAccId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setAccId((Number)value);
            }
        }
        ,
        FullName {
            public Object get(AccountsRowImpl obj) {
                return obj.getFullName();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setFullName((String)value);
            }
        }
        ,
        ContactTelephone {
            public Object get(AccountsRowImpl obj) {
                return obj.getContactTelephone();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setContactTelephone((String)value);
            }
        }
        ,
        Email {
            public Object get(AccountsRowImpl obj) {
                return obj.getEmail();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        OrganizationName {
            public Object get(AccountsRowImpl obj) {
                return obj.getOrganizationName();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setOrganizationName((String)value);
            }
        }
        ,
        ProId {
            public Object get(AccountsRowImpl obj) {
                return obj.getProId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setProId((Number)value);
            }
        }
        ,
        Address {
            public Object get(AccountsRowImpl obj) {
                return obj.getAddress();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setAddress((String)value);
            }
        }
        ,
        TaxCode {
            public Object get(AccountsRowImpl obj) {
                return obj.getTaxCode();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setTaxCode((String)value);
            }
        }
        ,
        RolId {
            public Object get(AccountsRowImpl obj) {
                return obj.getRolId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setRolId((Number)value);
            }
        }
        ,
        NumberOfEmployee {
            public Object get(AccountsRowImpl obj) {
                return obj.getNumberOfEmployee();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setNumberOfEmployee((Number)value);
            }
        }
        ,
        CustomerApproach {
            public Object get(AccountsRowImpl obj) {
                return obj.getCustomerApproach();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setCustomerApproach((String)value);
            }
        }
        ,
        UserName {
            public Object get(AccountsRowImpl obj) {
                return obj.getUserName();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setUserName((String)value);
            }
        }
        ,
        Password {
            public Object get(AccountsRowImpl obj) {
                return obj.getPassword();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setPassword((String)value);
            }
        }
        ,
        ActivedCode {
            public Object get(AccountsRowImpl obj) {
                return obj.getActivedCode();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setActivedCode((String)value);
            }
        }
        ,
        CouId {
            public Object get(AccountsRowImpl obj) {
                return obj.getCouId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setCouId((Number)value);
            }
        }
        ,
        IndId {
            public Object get(AccountsRowImpl obj) {
                return obj.getIndId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setIndId((Number)value);
            }
        }
        ,
        Status {
            public Object get(AccountsRowImpl obj) {
                return obj.getStatus();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        SquId {
            public Object get(AccountsRowImpl obj) {
                return obj.getSquId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setSquId((Number)value);
            }
        }
        ,
        SecurityAnswer {
            public Object get(AccountsRowImpl obj) {
                return obj.getSecurityAnswer();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setSecurityAnswer((String)value);
            }
        }
        ,
        MmeId {
            public Object get(AccountsRowImpl obj) {
                return obj.getMmeId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setMmeId((Number)value);
            }
        }
        ,
        LabId {
            public Object get(AccountsRowImpl obj) {
                return obj.getLabId();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setLabId((Number)value);
            }
        }
        ,
        ActivatedFlag {
            public Object get(AccountsRowImpl obj) {
                return obj.getActivatedFlag();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setActivatedFlag((String)value);
            }
        }
        ,
        IsAdmin {
            public Object get(AccountsRowImpl obj) {
                return obj.getIsAdmin();
            }

            public void put(AccountsRowImpl obj, Object value) {
                obj.setIsAdmin((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AccountsRowImpl object);

        public abstract void put(AccountsRowImpl object, Object value);

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


    public static final int ACCID = AttributesEnum.AccId.index();
    public static final int FULLNAME = AttributesEnum.FullName.index();
    public static final int CONTACTTELEPHONE = AttributesEnum.ContactTelephone.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int ORGANIZATIONNAME = AttributesEnum.OrganizationName.index();
    public static final int PROID = AttributesEnum.ProId.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int TAXCODE = AttributesEnum.TaxCode.index();
    public static final int ROLID = AttributesEnum.RolId.index();
    public static final int NUMBEROFEMPLOYEE = AttributesEnum.NumberOfEmployee.index();
    public static final int CUSTOMERAPPROACH = AttributesEnum.CustomerApproach.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int ACTIVEDCODE = AttributesEnum.ActivedCode.index();
    public static final int COUID = AttributesEnum.CouId.index();
    public static final int INDID = AttributesEnum.IndId.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int SQUID = AttributesEnum.SquId.index();
    public static final int SECURITYANSWER = AttributesEnum.SecurityAnswer.index();
    public static final int MMEID = AttributesEnum.MmeId.index();
    public static final int LABID = AttributesEnum.LabId.index();
    public static final int ACTIVATEDFLAG = AttributesEnum.ActivatedFlag.index();
    public static final int ISADMIN = AttributesEnum.IsAdmin.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AccountsRowImpl() {
    }

    /**
     * Gets Accounts entity object.
     * @return the Accounts
     */
    public AccountsImpl getAccounts() {
        return (AccountsImpl)getEntity(0);
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
     * Gets the attribute value for PRO_ID using the alias name ProId.
     * @return the PRO_ID
     */
    public Number getProId() {
        return (Number) getAttributeInternal(PROID);
    }

    /**
     * Sets <code>value</code> as attribute value for PRO_ID using the alias name ProId.
     * @param value value to set the PRO_ID
     */
    public void setProId(Number value) {
        setAttributeInternal(PROID, value);
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
     * Gets the attribute value for ROL_ID using the alias name RolId.
     * @return the ROL_ID
     */
    public Number getRolId() {
        return (Number) getAttributeInternal(ROLID);
    }

    /**
     * Sets <code>value</code> as attribute value for ROL_ID using the alias name RolId.
     * @param value value to set the ROL_ID
     */
    public void setRolId(Number value) {
        setAttributeInternal(ROLID, value);
    }

    /**
     * Gets the attribute value for NUMBER_OF_EMPLOYEE using the alias name NumberOfEmployee.
     * @return the NUMBER_OF_EMPLOYEE
     */
    public Number getNumberOfEmployee() {
        return (Number) getAttributeInternal(NUMBEROFEMPLOYEE);
    }

    /**
     * Sets <code>value</code> as attribute value for NUMBER_OF_EMPLOYEE using the alias name NumberOfEmployee.
     * @param value value to set the NUMBER_OF_EMPLOYEE
     */
    public void setNumberOfEmployee(Number value) {
        setAttributeInternal(NUMBEROFEMPLOYEE, value);
    }

    /**
     * Gets the attribute value for CUSTOMER_APPROACH using the alias name CustomerApproach.
     * @return the CUSTOMER_APPROACH
     */
    public String getCustomerApproach() {
        return (String) getAttributeInternal(CUSTOMERAPPROACH);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMER_APPROACH using the alias name CustomerApproach.
     * @param value value to set the CUSTOMER_APPROACH
     */
    public void setCustomerApproach(String value) {
        setAttributeInternal(CUSTOMERAPPROACH, value);
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
     * Gets the attribute value for COU_ID using the alias name CouId.
     * @return the COU_ID
     */
    public Number getCouId() {
        return (Number) getAttributeInternal(COUID);
    }

    /**
     * Sets <code>value</code> as attribute value for COU_ID using the alias name CouId.
     * @param value value to set the COU_ID
     */
    public void setCouId(Number value) {
        setAttributeInternal(COUID, value);
    }

    /**
     * Gets the attribute value for IND_ID using the alias name IndId.
     * @return the IND_ID
     */
    public Number getIndId() {
        return (Number) getAttributeInternal(INDID);
    }

    /**
     * Sets <code>value</code> as attribute value for IND_ID using the alias name IndId.
     * @param value value to set the IND_ID
     */
    public void setIndId(Number value) {
        setAttributeInternal(INDID, value);
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
     * Gets the attribute value for SQU_ID using the alias name SquId.
     * @return the SQU_ID
     */
    public Number getSquId() {
        return (Number) getAttributeInternal(SQUID);
    }

    /**
     * Sets <code>value</code> as attribute value for SQU_ID using the alias name SquId.
     * @param value value to set the SQU_ID
     */
    public void setSquId(Number value) {
        setAttributeInternal(SQUID, value);
    }

    /**
     * Gets the attribute value for SECURITY_ANSWER using the alias name SecurityAnswer.
     * @return the SECURITY_ANSWER
     */
    public String getSecurityAnswer() {
        return (String) getAttributeInternal(SECURITYANSWER);
    }

    /**
     * Sets <code>value</code> as attribute value for SECURITY_ANSWER using the alias name SecurityAnswer.
     * @param value value to set the SECURITY_ANSWER
     */
    public void setSecurityAnswer(String value) {
        setAttributeInternal(SECURITYANSWER, value);
    }

    /**
     * Gets the attribute value for MME_ID using the alias name MmeId.
     * @return the MME_ID
     */
    public Number getMmeId() {
        return (Number) getAttributeInternal(MMEID);
    }

    /**
     * Sets <code>value</code> as attribute value for MME_ID using the alias name MmeId.
     * @param value value to set the MME_ID
     */
    public void setMmeId(Number value) {
        setAttributeInternal(MMEID, value);
    }

    /**
     * Gets the attribute value for LAB_ID using the alias name LabId.
     * @return the LAB_ID
     */
    public Number getLabId() {
        return (Number) getAttributeInternal(LABID);
    }

    /**
     * Sets <code>value</code> as attribute value for LAB_ID using the alias name LabId.
     * @param value value to set the LAB_ID
     */
    public void setLabId(Number value) {
        setAttributeInternal(LABID, value);
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
     * Gets the attribute value for IS_ADMIN using the alias name IsAdmin.
     * @return the IS_ADMIN
     */
    public String getIsAdmin() {
        return (String) getAttributeInternal(ISADMIN);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_ADMIN using the alias name IsAdmin.
     * @param value value to set the IS_ADMIN
     */
    public void setIsAdmin(String value) {
        setAttributeInternal(ISADMIN, value);
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
