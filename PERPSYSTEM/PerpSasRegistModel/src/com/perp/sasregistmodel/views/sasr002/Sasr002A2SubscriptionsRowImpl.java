package com.perp.sasregistmodel.views.sasr002;

import com.perp.sasregistmodel.views.sasr002.common.Sasr002A2SubscriptionsRow;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 06 14:17:37 ICT 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Sasr002A2SubscriptionsRowImpl extends ViewRowImpl implements Sasr002A2SubscriptionsRow {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        AccId {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getAccId();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setAccId((Number)value);
            }
        }
        ,
        ActivatedCode {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getActivatedCode();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setActivatedCode((String)value);
            }
        }
        ,
        AppUrl {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getAppUrl();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setAppUrl((String)value);
            }
        }
        ,
        EndDate {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getEndDate();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        Quantity {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getQuantity();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setQuantity((Number)value);
            }
        }
        ,
        SpaId {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getSpaId();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setSpaId((Number)value);
            }
        }
        ,
        StartDate {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getStartDate();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        Status {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getStatus();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        SubId {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getSubId();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setSubId((Number)value);
            }
        }
        ,
        SubscribeDate {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getSubscribeDate();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setSubscribeDate((Date)value);
            }
        }
        ,
        Sasr002A2ServicePackages {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getSasr002A2ServicePackages();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        VbisUsersView {
            public Object get(Sasr002A2SubscriptionsRowImpl obj) {
                return obj.getVbisUsersView();
            }

            public void put(Sasr002A2SubscriptionsRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(Sasr002A2SubscriptionsRowImpl object);

        public abstract void put(Sasr002A2SubscriptionsRowImpl object,
                                 Object value);

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
    public static final int ACTIVATEDCODE = AttributesEnum.ActivatedCode.index();
    public static final int APPURL = AttributesEnum.AppUrl.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int SPAID = AttributesEnum.SpaId.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int SUBID = AttributesEnum.SubId.index();
    public static final int SUBSCRIBEDATE = AttributesEnum.SubscribeDate.index();
    public static final int SASR002A2SERVICEPACKAGES = AttributesEnum.Sasr002A2ServicePackages.index();
    public static final int VBISUSERSVIEW = AttributesEnum.VbisUsersView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Sasr002A2SubscriptionsRowImpl() {
    }

    /**
     * Gets Subscriptions entity object.
     * @return the Subscriptions
     */
    public EntityImpl getSubscriptions() {
        return (EntityImpl)getEntity(0);
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
     * Gets the attribute value for ACTIVATED_CODE using the alias name ActivatedCode.
     * @return the ACTIVATED_CODE
     */
    public String getActivatedCode() {
        return (String) getAttributeInternal(ACTIVATEDCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVATED_CODE using the alias name ActivatedCode.
     * @param value value to set the ACTIVATED_CODE
     */
    public void setActivatedCode(String value) {
        setAttributeInternal(ACTIVATEDCODE, value);
    }

    /**
     * Gets the attribute value for APP_URL using the alias name AppUrl.
     * @return the APP_URL
     */
    public String getAppUrl() {
        return (String) getAttributeInternal(APPURL);
    }

    /**
     * Sets <code>value</code> as attribute value for APP_URL using the alias name AppUrl.
     * @param value value to set the APP_URL
     */
    public void setAppUrl(String value) {
        setAttributeInternal(APPURL, value);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Date getEndDate() {
        return (Date) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public Number getQuantity() {
        return (Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for SPA_ID using the alias name SpaId.
     * @return the SPA_ID
     */
    public Number getSpaId() {
        return (Number) getAttributeInternal(SPAID);
    }

    /**
     * Sets <code>value</code> as attribute value for SPA_ID using the alias name SpaId.
     * @param value value to set the SPA_ID
     */
    public void setSpaId(Number value) {
        setAttributeInternal(SPAID, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Date getStartDate() {
        return (Date) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
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
     * Gets the attribute value for SUBSCRIBE_DATE using the alias name SubscribeDate.
     * @return the SUBSCRIBE_DATE
     */
    public Date getSubscribeDate() {
        return (Date) getAttributeInternal(SUBSCRIBEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBSCRIBE_DATE using the alias name SubscribeDate.
     * @param value value to set the SUBSCRIBE_DATE
     */
    public void setSubscribeDate(Date value) {
        setAttributeInternal(SUBSCRIBEDATE, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link Sasr002A2ServicePackages.
     */
    public Row getSasr002A2ServicePackages() {
        return (Row)getAttributeInternal(SASR002A2SERVICEPACKAGES);
    }

    /**
     * Sets the master-detail link Sasr002A2ServicePackages between this object and <code>value</code>.
     */
    public void setSasr002A2ServicePackages(Row value) {
        setAttributeInternal(SASR002A2SERVICEPACKAGES, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VbisUsersView.
     */
    public RowIterator getVbisUsersView() {
        return (RowIterator)getAttributeInternal(VBISUSERSVIEW);
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