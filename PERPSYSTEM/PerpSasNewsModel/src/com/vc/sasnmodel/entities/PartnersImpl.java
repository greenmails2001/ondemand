package com.vc.sasnmodel.entities;

import com.oracle.adffwkextensions.utils.DateUtils;

import oracle.jbo.Key;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 16 12:01:06 ICT 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PartnersImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        ParId {
            public Object get(PartnersImpl obj) {
                return obj.getParId();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setParId((Number)value);
            }
        }
        ,
        PgrId {
            public Object get(PartnersImpl obj) {
                return obj.getPgrId();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setPgrId((Number)value);
            }
        }
        ,
        CompanyName {
            public Object get(PartnersImpl obj) {
                return obj.getCompanyName();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCompanyName((String)value);
            }
        }
        ,
        CompanyAddress {
            public Object get(PartnersImpl obj) {
                return obj.getCompanyAddress();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCompanyAddress((String)value);
            }
        }
        ,
        CompanyTelephone {
            public Object get(PartnersImpl obj) {
                return obj.getCompanyTelephone();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCompanyTelephone((String)value);
            }
        }
        ,
        CompanyFax {
            public Object get(PartnersImpl obj) {
                return obj.getCompanyFax();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCompanyFax((String)value);
            }
        }
        ,
        CompanyEmail {
            public Object get(PartnersImpl obj) {
                return obj.getCompanyEmail();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCompanyEmail((String)value);
            }
        }
        ,
        CompanyWebsite {
            public Object get(PartnersImpl obj) {
                return obj.getCompanyWebsite();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCompanyWebsite((String)value);
            }
        }
        ,
        ContactPersonName {
            public Object get(PartnersImpl obj) {
                return obj.getContactPersonName();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setContactPersonName((String)value);
            }
        }
        ,
        ContactPersonPosition {
            public Object get(PartnersImpl obj) {
                return obj.getContactPersonPosition();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setContactPersonPosition((String)value);
            }
        }
        ,
        ContactPersonTelephone {
            public Object get(PartnersImpl obj) {
                return obj.getContactPersonTelephone();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setContactPersonTelephone((String)value);
            }
        }
        ,
        ContactPersonEmail {
            public Object get(PartnersImpl obj) {
                return obj.getContactPersonEmail();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setContactPersonEmail((String)value);
            }
        }
        ,
        CreateDate {
            public Object get(PartnersImpl obj) {
                return obj.getCreateDate();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCreateDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(PartnersImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        ModifyDate {
            public Object get(PartnersImpl obj) {
                return obj.getModifyDate();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setModifyDate((Date)value);
            }
        }
        ,
        ModifiedBy {
            public Object get(PartnersImpl obj) {
                return obj.getModifiedBy();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setModifiedBy((String)value);
            }
        }
        ,
        Description {
            public Object get(PartnersImpl obj) {
                return obj.getDescription();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        Image {
            public Object get(PartnersImpl obj) {
                return obj.getImage();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setImage((BlobDomain)value);
            }
        }
        ,
        PartnerGroups {
            public Object get(PartnersImpl obj) {
                return obj.getPartnerGroups();
            }

            public void put(PartnersImpl obj, Object value) {
                obj.setPartnerGroups((EntityImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PartnersImpl object);

        public abstract void put(PartnersImpl object, Object value);

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


    public static final int PARID = AttributesEnum.ParId.index();
    public static final int PGRID = AttributesEnum.PgrId.index();
    public static final int COMPANYNAME = AttributesEnum.CompanyName.index();
    public static final int COMPANYADDRESS = AttributesEnum.CompanyAddress.index();
    public static final int COMPANYTELEPHONE = AttributesEnum.CompanyTelephone.index();
    public static final int COMPANYFAX = AttributesEnum.CompanyFax.index();
    public static final int COMPANYEMAIL = AttributesEnum.CompanyEmail.index();
    public static final int COMPANYWEBSITE = AttributesEnum.CompanyWebsite.index();
    public static final int CONTACTPERSONNAME = AttributesEnum.ContactPersonName.index();
    public static final int CONTACTPERSONPOSITION = AttributesEnum.ContactPersonPosition.index();
    public static final int CONTACTPERSONTELEPHONE = AttributesEnum.ContactPersonTelephone.index();
    public static final int CONTACTPERSONEMAIL = AttributesEnum.ContactPersonEmail.index();
    public static final int CREATEDATE = AttributesEnum.CreateDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int MODIFYDATE = AttributesEnum.ModifyDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int IMAGE = AttributesEnum.Image.index();
    public static final int PARTNERGROUPS = AttributesEnum.PartnerGroups.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PartnersImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.vc.sasnmodel.entities.Partners");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for ParId, using the alias name ParId.
     * @return the ParId
     */
    public Number getParId() {
        return (Number)getAttributeInternal(PARID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParId.
     * @param value value to set the ParId
     */
    public void setParId(Number value) {
        setAttributeInternal(PARID, value);
    }

    /**
     * Gets the attribute value for PgrId, using the alias name PgrId.
     * @return the PgrId
     */
    public Number getPgrId() {
        return (Number)getAttributeInternal(PGRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PgrId.
     * @param value value to set the PgrId
     */
    public void setPgrId(Number value) {
        setAttributeInternal(PGRID, value);
    }

    /**
     * Gets the attribute value for CompanyName, using the alias name CompanyName.
     * @return the CompanyName
     */
    public String getCompanyName() {
        return (String)getAttributeInternal(COMPANYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyName.
     * @param value value to set the CompanyName
     */
    public void setCompanyName(String value) {
        setAttributeInternal(COMPANYNAME, value);
    }

    /**
     * Gets the attribute value for CompanyAddress, using the alias name CompanyAddress.
     * @return the CompanyAddress
     */
    public String getCompanyAddress() {
        return (String)getAttributeInternal(COMPANYADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyAddress.
     * @param value value to set the CompanyAddress
     */
    public void setCompanyAddress(String value) {
        setAttributeInternal(COMPANYADDRESS, value);
    }

    /**
     * Gets the attribute value for CompanyTelephone, using the alias name CompanyTelephone.
     * @return the CompanyTelephone
     */
    public String getCompanyTelephone() {
        return (String)getAttributeInternal(COMPANYTELEPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyTelephone.
     * @param value value to set the CompanyTelephone
     */
    public void setCompanyTelephone(String value) {
        setAttributeInternal(COMPANYTELEPHONE, value);
    }

    /**
     * Gets the attribute value for CompanyFax, using the alias name CompanyFax.
     * @return the CompanyFax
     */
    public String getCompanyFax() {
        return (String)getAttributeInternal(COMPANYFAX);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyFax.
     * @param value value to set the CompanyFax
     */
    public void setCompanyFax(String value) {
        setAttributeInternal(COMPANYFAX, value);
    }

    /**
     * Gets the attribute value for CompanyEmail, using the alias name CompanyEmail.
     * @return the CompanyEmail
     */
    public String getCompanyEmail() {
        return (String)getAttributeInternal(COMPANYEMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyEmail.
     * @param value value to set the CompanyEmail
     */
    public void setCompanyEmail(String value) {
        setAttributeInternal(COMPANYEMAIL, value);
    }

    /**
     * Gets the attribute value for CompanyWebsite, using the alias name CompanyWebsite.
     * @return the CompanyWebsite
     */
    public String getCompanyWebsite() {
        return (String)getAttributeInternal(COMPANYWEBSITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyWebsite.
     * @param value value to set the CompanyWebsite
     */
    public void setCompanyWebsite(String value) {
        setAttributeInternal(COMPANYWEBSITE, value);
    }

    /**
     * Gets the attribute value for ContactPersonName, using the alias name ContactPersonName.
     * @return the ContactPersonName
     */
    public String getContactPersonName() {
        return (String)getAttributeInternal(CONTACTPERSONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPersonName.
     * @param value value to set the ContactPersonName
     */
    public void setContactPersonName(String value) {
        setAttributeInternal(CONTACTPERSONNAME, value);
    }

    /**
     * Gets the attribute value for ContactPersonPosition, using the alias name ContactPersonPosition.
     * @return the ContactPersonPosition
     */
    public String getContactPersonPosition() {
        return (String)getAttributeInternal(CONTACTPERSONPOSITION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPersonPosition.
     * @param value value to set the ContactPersonPosition
     */
    public void setContactPersonPosition(String value) {
        setAttributeInternal(CONTACTPERSONPOSITION, value);
    }

    /**
     * Gets the attribute value for ContactPersonTelephone, using the alias name ContactPersonTelephone.
     * @return the ContactPersonTelephone
     */
    public String getContactPersonTelephone() {
        return (String)getAttributeInternal(CONTACTPERSONTELEPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPersonTelephone.
     * @param value value to set the ContactPersonTelephone
     */
    public void setContactPersonTelephone(String value) {
        setAttributeInternal(CONTACTPERSONTELEPHONE, value);
    }

    /**
     * Gets the attribute value for ContactPersonEmail, using the alias name ContactPersonEmail.
     * @return the ContactPersonEmail
     */
    public String getContactPersonEmail() {
        return (String)getAttributeInternal(CONTACTPERSONEMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPersonEmail.
     * @param value value to set the ContactPersonEmail
     */
    public void setContactPersonEmail(String value) {
        setAttributeInternal(CONTACTPERSONEMAIL, value);
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
     * Gets the attribute value for Description, using the alias name Description.
     * @return the Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Image, using the alias name Image.
     * @return the Image
     */
    public BlobDomain getImage() {
        return (BlobDomain)getAttributeInternal(IMAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Image.
     * @param value value to set the Image
     */
    public void setImage(BlobDomain value) {
        setAttributeInternal(IMAGE, value);
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
    public EntityImpl getPartnerGroups() {
        return (EntityImpl)getAttributeInternal(PARTNERGROUPS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPartnerGroups(EntityImpl value) {
        setAttributeInternal(PARTNERGROUPS, value);
    }


    /**
     * @param parId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number parId) {
        return new Key(new Object[]{parId});
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_INSERT) {      
            SequenceImpl seq= new SequenceImpl("Par_Seq",this.getDBTransaction());
            this.setAttributeInternal(PARID, seq.getSequenceNumber());
            this.setCreateDate(DateUtils.getOracleSysdate());
            super.doDML(operation, e);
        } else if (operation == DML_UPDATE) {
            this.setModifyDate(DateUtils.getOracleSysdate());
            super.doDML(operation, e);
        } else {
            super.doDML(operation, e);
        }
    }
}
