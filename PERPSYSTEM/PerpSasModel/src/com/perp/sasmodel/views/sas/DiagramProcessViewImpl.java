package com.perp.sasmodel.views.sas;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 26 13:13:00 ICT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DiagramProcessViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DiagramProcessViewImpl() {
    }

    /**
     * Returns the bind variable value for p_App_Code.
     * @return bind variable value for p_App_Code
     */
    public String getp_App_Code() {
        return (String)getNamedWhereClauseParam("p_App_Code");
    }

    /**
     * Sets <code>value</code> for bind variable p_App_Code.
     * @param value value to bind as p_App_Code
     */
    public void setp_App_Code(String value) {
        setNamedWhereClauseParam("p_App_Code", value);
    }
}