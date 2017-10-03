package com.perp.sasmodel.views.sas;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Feb 17 21:47:38 GMT+07:00 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppLoginsRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        AloId {
            public Object get(AppLoginsRowImpl obj) {
                return obj.getAloId();
            }

            public void put(AppLoginsRowImpl obj, Object value) {
                obj.setAloId((Number)value);
            }
        }
        ,
        Browser {
            public Object get(AppLoginsRowImpl obj) {
                return obj.getBrowser();
            }

            public void put(AppLoginsRowImpl obj, Object value) {
                obj.setBrowser((String)value);
            }
        }
        ,
        Country {
            public Object get(AppLoginsRowImpl obj) {
                return obj.getCountry();
            }

            public void put(AppLoginsRowImpl obj, Object value) {
                obj.setCountry((String)value);
            }
        }
        ,
        EnvId {
            public Object get(AppLoginsRowImpl obj) {
                return obj.getEnvId();
            }

            public void put(AppLoginsRowImpl obj, Object value) {
                obj.setEnvId((String)value);
            }
        }
        ,
        IpAddress {
            public Object get(AppLoginsRowImpl obj) {
                return obj.getIpAddress();
            }

            public void put(AppLoginsRowImpl obj, Object value) {
                obj.setIpAddress((String)value);
            }
        }
        ,
        LoginAt {
            public Object get(AppLoginsRowImpl obj) {
                return obj.getLoginAt();
            }

            public void put(AppLoginsRowImpl obj, Object value) {
                obj.setLoginAt((Date)value);
            }
        }
        ,
        UserName {
            public Object get(AppLoginsRowImpl obj) {
                return obj.getUserName();
            }

            public void put(AppLoginsRowImpl obj, Object value) {
                obj.setUserName((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AppLoginsRowImpl object);

        public abstract void put(AppLoginsRowImpl object, Object value);

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
    public static final int ALOID = AttributesEnum.AloId.index();
    public static final int BROWSER = AttributesEnum.Browser.index();
    public static final int COUNTRY = AttributesEnum.Country.index();
    public static final int ENVID = AttributesEnum.EnvId.index();
    public static final int IPADDRESS = AttributesEnum.IpAddress.index();
    public static final int LOGINAT = AttributesEnum.LoginAt.index();
    public static final int USERNAME = AttributesEnum.UserName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppLoginsRowImpl() {
    }

    /**
     * Gets AppLogins entity object.
     * @return the AppLogins
     */
    public EntityImpl getAppLogins() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ALO_ID using the alias name AloId.
     * @return the ALO_ID
     */
    public Number getAloId() {
        return (Number) getAttributeInternal(ALOID);
    }

    /**
     * Sets <code>value</code> as attribute value for ALO_ID using the alias name AloId.
     * @param value value to set the ALO_ID
     */
    public void setAloId(Number value) {
        setAttributeInternal(ALOID, value);
    }

    /**
     * Gets the attribute value for BROWSER using the alias name Browser.
     * @return the BROWSER
     */
    public String getBrowser() {
        return (String) getAttributeInternal(BROWSER);
    }

    /**
     * Sets <code>value</code> as attribute value for BROWSER using the alias name Browser.
     * @param value value to set the BROWSER
     */
    public void setBrowser(String value) {
        setAttributeInternal(BROWSER, value);
    }

    /**
     * Gets the attribute value for COUNTRY using the alias name Country.
     * @return the COUNTRY
     */
    public String getCountry() {
        return (String) getAttributeInternal(COUNTRY);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY using the alias name Country.
     * @param value value to set the COUNTRY
     */
    public void setCountry(String value) {
        setAttributeInternal(COUNTRY, value);
    }

    /**
     * Gets the attribute value for ENV_ID using the alias name EnvId.
     * @return the ENV_ID
     */
    public String getEnvId() {
        return (String) getAttributeInternal(ENVID);
    }

    /**
     * Sets <code>value</code> as attribute value for ENV_ID using the alias name EnvId.
     * @param value value to set the ENV_ID
     */
    public void setEnvId(String value) {
        setAttributeInternal(ENVID, value);
    }

    /**
     * Gets the attribute value for IP_ADDRESS using the alias name IpAddress.
     * @return the IP_ADDRESS
     */
    public String getIpAddress() {
        return (String) getAttributeInternal(IPADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for IP_ADDRESS using the alias name IpAddress.
     * @param value value to set the IP_ADDRESS
     */
    public void setIpAddress(String value) {
        setAttributeInternal(IPADDRESS, value);
    }

    /**
     * Gets the attribute value for LOGIN_AT using the alias name LoginAt.
     * @return the LOGIN_AT
     */
    public Date getLoginAt() {
        return (Date) getAttributeInternal(LOGINAT);
    }

    /**
     * Sets <code>value</code> as attribute value for LOGIN_AT using the alias name LoginAt.
     * @param value value to set the LOGIN_AT
     */
    public void setLoginAt(Date value) {
        setAttributeInternal(LOGINAT, value);
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