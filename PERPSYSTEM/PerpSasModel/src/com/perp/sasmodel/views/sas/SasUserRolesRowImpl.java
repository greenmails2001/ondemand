package com.perp.sasmodel.views.sas;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 04 11:00:25 ICT 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SasUserRolesRowImpl extends ViewRowImpl {
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
   */
  public enum AttributesEnum {
        GusId {
            public Object get(SasUserRolesRowImpl obj) {
                return obj.getGusId();
            }

            public void put(SasUserRolesRowImpl obj, Object value) {
                obj.setGusId((Number)value);
            }
        }
        ,
        AusId {
            public Object get(SasUserRolesRowImpl obj) {
                return obj.getAusId();
            }

            public void put(SasUserRolesRowImpl obj, Object value) {
                obj.setAusId((Number)value);
            }
        }
        ,
        Name {
            public Object get(SasUserRolesRowImpl obj) {
                return obj.getName();
            }

            public void put(SasUserRolesRowImpl obj, Object value) {
                obj.setName((String)value);
            }
        }
        ,
        Description {
            public Object get(SasUserRolesRowImpl obj) {
                return obj.getDescription();
            }

            public void put(SasUserRolesRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        AppCode {
            public Object get(SasUserRolesRowImpl obj) {
                return obj.getAppCode();
            }

            public void put(SasUserRolesRowImpl obj, Object value) {
                obj.setAppCode((String)value);
            }
        }
        ,
        SasMenusRoot {
            public Object get(SasUserRolesRowImpl obj) {
                return obj.getSasMenusRoot();
            }

            public void put(SasUserRolesRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

    public abstract Object get(SasUserRolesRowImpl object);

    public abstract void put(SasUserRolesRowImpl object, Object value);

    public int index() {
      return SasUserRolesRowImpl.AttributesEnum.firstIndex() + ordinal();
    }

    public static int firstIndex() {
      return firstIndex;
    }

    public static int count() {
      return SasUserRolesRowImpl.AttributesEnum.firstIndex() + SasUserRolesRowImpl.AttributesEnum.staticValues().length;
    }

    public static AttributesEnum[] staticValues() {
      if (vals == null) {
        vals = SasUserRolesRowImpl.AttributesEnum.values();
      }
      return vals;
    }
  }


    public static final int SAS001A0MENUS = SasUserRolesRowImpl.AttributesEnum.SasMenusRoot.index();

    public static final int GUSID = AttributesEnum.GusId.index();
    public static final int AUSID = AttributesEnum.AusId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int APPCODE = AttributesEnum.AppCode.index();
    public static final int SASMENUSROOT = AttributesEnum.SasMenusRoot.index();

    /**
     * This is the default constructor (do not remove).
     */
  public SasUserRolesRowImpl() {
  }

  /**
   * Gets UserRoles entity object.
   * @return the UserRoles
   */
  public EntityImpl getUserRoles() {
    return (EntityImpl)getEntity(0);
  }

  /**
   * Gets the attribute value for GUS_ID using the alias name GusId.
   * @return the GUS_ID
   */
  public Number getGusId() {
    return (Number) getAttributeInternal(GUSID);
  }

  /**
   * Sets <code>value</code> as attribute value for GUS_ID using the alias name GusId.
   * @param value value to set the GUS_ID
   */
  public void setGusId(Number value) {
    setAttributeInternal(GUSID, value);
  }

  /**
   * Gets the attribute value for AUS_ID using the alias name AusId.
   * @return the AUS_ID
   */
  public Number getAusId() {
    return (Number) getAttributeInternal(AUSID);
  }

  /**
   * Sets <code>value</code> as attribute value for AUS_ID using the alias name AusId.
   * @param value value to set the AUS_ID
   */
  public void setAusId(Number value) {
    setAttributeInternal(AUSID, value);
  }

  /**
   * Gets the attribute value for the calculated attribute Name.
   * @return the Name
   */
  public String getName() {
    return (String) getAttributeInternal(NAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute Name.
   * @param value value to set the  Name
   */
  public void setName(String value) {
    setAttributeInternal(NAME, value);
  }

  /**
   * Gets the attribute value for DESCRIPTION using the alias name Description.
   * @return the DESCRIPTION
   */
  public String getDescription() {
    return (String) getAttributeInternal(DESCRIPTION);
  }

  /**
   * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
   * @param value value to set the DESCRIPTION
   */
  public void setDescription(String value) {
    setAttributeInternal(DESCRIPTION, value);
  }

  /**
   * Gets the attribute value for the calculated attribute AppCode.
   * @return the AppCode
   */
  public String getAppCode() {
    return (String) getAttributeInternal(APPCODE);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute AppCode.
   * @param value value to set the  AppCode
   */
  public void setAppCode(String value) {
    setAttributeInternal(APPCODE, value);
  }


  /**
   * Gets the associated <code>RowIterator</code> using master-detail link SasMenusRoot.
   */
  public RowIterator getSasMenusRoot() {
    return (RowIterator)getAttributeInternal(SAS001A0MENUS);
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
   * Sample exportable method.
   */
  public void sampleSasUserRolesRowImplExportable() {
  }

  /**
   * Sample exportable method.
   */
  public void sampleSasUserRolesRowImplExportable2(String testParam1) {
  }
}