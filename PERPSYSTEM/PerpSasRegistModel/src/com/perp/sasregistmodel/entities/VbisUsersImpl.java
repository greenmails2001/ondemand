package com.perp.sasregistmodel.entities;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.perp.beans.SasrSessionLoginObject;

import com.perp.sasregistmodel.common.PerpSasRegistAppModule;

import com.perp.sasregistmodel.views.sasr002.common.Sasr002A2SubscriptionsRow;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 21 16:01:56 ICT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VbisUsersImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        VusId {
            public Object get(VbisUsersImpl obj) {
                return obj.getVusId();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setVusId((Number)value);
            }
        }
        ,
        UserName {
            public Object get(VbisUsersImpl obj) {
                return obj.getUserName();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setUserName((String)value);
            }
        }
        ,
        Password {
            public Object get(VbisUsersImpl obj) {
                return obj.getPassword();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setPassword((String)value);
            }
        }
        ,
        Password1 {
            public Object get(VbisUsersImpl obj) {
                return obj.getPassword1();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setPassword1((String)value);
            }
        }
        ,
        Password2 {
            public Object get(VbisUsersImpl obj) {
                return obj.getPassword2();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setPassword2((String)value);
            }
        }
        ,
        FullName {
            public Object get(VbisUsersImpl obj) {
                return obj.getFullName();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setFullName((String)value);
            }
        }
        ,
        ContactTelephone {
            public Object get(VbisUsersImpl obj) {
                return obj.getContactTelephone();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setContactTelephone((String)value);
            }
        }
        ,
        Email {
            public Object get(VbisUsersImpl obj) {
                return obj.getEmail();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        OrganizationName {
            public Object get(VbisUsersImpl obj) {
                return obj.getOrganizationName();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setOrganizationName((String)value);
            }
        }
        ,
        Address {
            public Object get(VbisUsersImpl obj) {
                return obj.getAddress();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAddress((String)value);
            }
        }
        ,
        TaxCode {
            public Object get(VbisUsersImpl obj) {
                return obj.getTaxCode();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setTaxCode((String)value);
            }
        }
        ,
        ActivedCode {
            public Object get(VbisUsersImpl obj) {
                return obj.getActivedCode();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setActivedCode((String)value);
            }
        }
        ,
        Status {
            public Object get(VbisUsersImpl obj) {
                return obj.getStatus();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        ActivatedFlag {
            public Object get(VbisUsersImpl obj) {
                return obj.getActivatedFlag();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setActivatedFlag((String)value);
            }
        }
        ,
        SubId {
            public Object get(VbisUsersImpl obj) {
                return obj.getSubId();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setSubId((Number)value);
            }
        }
        ,
        CreateDate {
            public Object get(VbisUsersImpl obj) {
                return obj.getCreateDate();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setCreateDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(VbisUsersImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        ModifyDate {
            public Object get(VbisUsersImpl obj) {
                return obj.getModifyDate();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setModifyDate((Date)value);
            }
        }
        ,
        ModifiedBy {
            public Object get(VbisUsersImpl obj) {
                return obj.getModifiedBy();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setModifiedBy((String)value);
            }
        }
        ,
        Attribute1 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute1();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute2();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute3();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute4();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute5();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute6();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute7();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute8();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute9();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(VbisUsersImpl obj) {
                return obj.getAttribute10();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        AccId {
            public Object get(VbisUsersImpl obj) {
                return obj.getAccId();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setAccId((Number)value);
            }
        }
        ,
        Subscriptions {
            public Object get(VbisUsersImpl obj) {
                return obj.getSubscriptions();
            }

            public void put(VbisUsersImpl obj, Object value) {
                obj.setSubscriptions((EntityImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(VbisUsersImpl object);

        public abstract void put(VbisUsersImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
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
    public static final int SUBSCRIPTIONS = AttributesEnum.Subscriptions.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VbisUsersImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.perp.sasregistmodel.entities.VbisUsers");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for VusId, using the alias name VusId.
     * @return the VusId
     */
    public Number getVusId() {
        return (Number)getAttributeInternal(VUSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for VusId.
     * @param value value to set the VusId
     */
    public void setVusId(Number value) {
        setAttributeInternal(VUSID, value);
    }

    /**
     * Gets the attribute value for UserName, using the alias name UserName.
     * @return the UserName
     */
    public String getUserName() {
        return (String)getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserName.
     * @param value value to set the UserName
     */
    public void setUserName(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for Password, using the alias name Password.
     * @return the Password
     */
    public String getPassword() {
        return (String)getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Password.
     * @param value value to set the Password
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
    }

    /**
     * Gets the attribute value for Password1, using the alias name Password1.
     * @return the Password1
     */
    public String getPassword1() {
        return (String)getAttributeInternal(PASSWORD1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Password1.
     * @param value value to set the Password1
     */
    public void setPassword1(String value) {
        setAttributeInternal(PASSWORD1, value);
    }

    /**
     * Gets the attribute value for Password2, using the alias name Password2.
     * @return the Password2
     */
    public String getPassword2() {
        return (String)getAttributeInternal(PASSWORD2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Password2.
     * @param value value to set the Password2
     */
    public void setPassword2(String value) {
        setAttributeInternal(PASSWORD2, value);
    }

    /**
     * Gets the attribute value for FullName, using the alias name FullName.
     * @return the FullName
     */
    public String getFullName() {
        return (String)getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FullName.
     * @param value value to set the FullName
     */
    public void setFullName(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the attribute value for ContactTelephone, using the alias name ContactTelephone.
     * @return the ContactTelephone
     */
    public String getContactTelephone() {
        return (String)getAttributeInternal(CONTACTTELEPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactTelephone.
     * @param value value to set the ContactTelephone
     */
    public void setContactTelephone(String value) {
        setAttributeInternal(CONTACTTELEPHONE, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the Email
     */
    public String getEmail() {
        return (String)getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for OrganizationName, using the alias name OrganizationName.
     * @return the OrganizationName
     */
    public String getOrganizationName() {
        return (String)getAttributeInternal(ORGANIZATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrganizationName.
     * @param value value to set the OrganizationName
     */
    public void setOrganizationName(String value) {
        setAttributeInternal(ORGANIZATIONNAME, value);
    }

    /**
     * Gets the attribute value for Address, using the alias name Address.
     * @return the Address
     */
    public String getAddress() {
        return (String)getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Address.
     * @param value value to set the Address
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for TaxCode, using the alias name TaxCode.
     * @return the TaxCode
     */
    public String getTaxCode() {
        return (String)getAttributeInternal(TAXCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxCode.
     * @param value value to set the TaxCode
     */
    public void setTaxCode(String value) {
        setAttributeInternal(TAXCODE, value);
    }

    /**
     * Gets the attribute value for ActivedCode, using the alias name ActivedCode.
     * @return the ActivedCode
     */
    public String getActivedCode() {
        return (String)getAttributeInternal(ACTIVEDCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivedCode.
     * @param value value to set the ActivedCode
     */
    public void setActivedCode(String value) {
        setAttributeInternal(ACTIVEDCODE, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the Status
     */
    public String getStatus() {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for ActivatedFlag, using the alias name ActivatedFlag.
     * @return the ActivatedFlag
     */
    public String getActivatedFlag() {
        return (String)getAttributeInternal(ACTIVATEDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivatedFlag.
     * @param value value to set the ActivatedFlag
     */
    public void setActivatedFlag(String value) {
        setAttributeInternal(ACTIVATEDFLAG, value);
    }

    /**
     * Gets the attribute value for SubId, using the alias name SubId.
     * @return the SubId
     */
    public Number getSubId() {
        return (Number)getAttributeInternal(SUBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubId.
     * @param value value to set the SubId
     */
    public void setSubId(Number value) {
        setAttributeInternal(SUBID, value);
    }

    /**
     * Gets the attribute value for CreateDate, using the alias name CreateDate.
     * @return the CreateDate
     */
    public Date getCreateDate() {
        return (Date)getAttributeInternal(CREATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreateDate.
     * @param value value to set the CreateDate
     */
    public void setCreateDate(Date value) {
        setAttributeInternal(CREATEDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for ModifyDate, using the alias name ModifyDate.
     * @return the ModifyDate
     */
    public Date getModifyDate() {
        return (Date)getAttributeInternal(MODIFYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifyDate.
     * @param value value to set the ModifyDate
     */
    public void setModifyDate(Date value) {
        setAttributeInternal(MODIFYDATE, value);
    }

    /**
     * Gets the attribute value for ModifiedBy, using the alias name ModifiedBy.
     * @return the ModifiedBy
     */
    public String getModifiedBy() {
        return (String)getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedBy.
     * @param value value to set the ModifiedBy
     */
    public void setModifiedBy(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for Attribute1, using the alias name Attribute1.
     * @return the Attribute1
     */
    public String getAttribute1() {
        return (String)getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute1.
     * @param value value to set the Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for Attribute2, using the alias name Attribute2.
     * @return the Attribute2
     */
    public String getAttribute2() {
        return (String)getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute2.
     * @param value value to set the Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for Attribute3, using the alias name Attribute3.
     * @return the Attribute3
     */
    public String getAttribute3() {
        return (String)getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute3.
     * @param value value to set the Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for Attribute4, using the alias name Attribute4.
     * @return the Attribute4
     */
    public String getAttribute4() {
        return (String)getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute4.
     * @param value value to set the Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for Attribute5, using the alias name Attribute5.
     * @return the Attribute5
     */
    public String getAttribute5() {
        return (String)getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute5.
     * @param value value to set the Attribute5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for Attribute6, using the alias name Attribute6.
     * @return the Attribute6
     */
    public String getAttribute6() {
        return (String)getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute6.
     * @param value value to set the Attribute6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for Attribute7, using the alias name Attribute7.
     * @return the Attribute7
     */
    public String getAttribute7() {
        return (String)getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute7.
     * @param value value to set the Attribute7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for Attribute8, using the alias name Attribute8.
     * @return the Attribute8
     */
    public String getAttribute8() {
        return (String)getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute8.
     * @param value value to set the Attribute8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for Attribute9, using the alias name Attribute9.
     * @return the Attribute9
     */
    public String getAttribute9() {
        return (String)getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute9.
     * @param value value to set the Attribute9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for Attribute10, using the alias name Attribute10.
     * @return the Attribute10
     */
    public String getAttribute10() {
        return (String)getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute10.
     * @param value value to set the Attribute10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for AccId, using the alias name AccId.
     * @return the AccId
     */
    public Number getAccId() {
        return (Number)getAttributeInternal(ACCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccId.
     * @param value value to set the AccId
     */
    public void setAccId(Number value) {
        setAttributeInternal(ACCID, value);
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

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSubscriptions() {
        return (EntityImpl)getAttributeInternal(SUBSCRIPTIONS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSubscriptions(EntityImpl value) {
        setAttributeInternal(SUBSCRIPTIONS, value);
    }


    /**
     * @param vusId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number vusId) {
        return new Key(new Object[]{vusId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("VUS_SEQ", this.getDBTransaction());
        setVusId(seq.getSequenceNumber());

        SasrSessionLoginObject session =
            (SasrSessionLoginObject)FacesUtils.resolveExpression("#{sasrSessionLoginObject}");
        if (session != null) {
            setAccId(session.getPerpSasrAccount().getAccId());
            setCreatedBy(session.getPerpSasrAccount().getUserName());
            PerpSasRegistAppModule module =
                (PerpSasRegistAppModule)FacesUtils.getApplicationModuleForDataControl("PerpSasRegistAppModuleDataControl");
            Sasr002A2SubscriptionsRow row =
                module.getCurrentRowSasr002A2Subscriptions(session.getPerpSasrAccount().getAccId());
            setSubId(row.getSubId());
        } else {
            setCreatedBy("perp");
        }


    }
}
