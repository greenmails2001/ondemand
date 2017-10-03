package com.perp.sasmodel.dynamicjdbc;

import java.util.Hashtable;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.client.Configuration;
import oracle.jbo.common.ampool.EnvInfoProvider;


/**
 * This custom EnvInfoProvider implemenation is used by the
 * DynamicJDBCSessionCookieFactory, which constructs an instance of
 * this class, passing in the username/password/connection information
 * to use for the dynamic credentials.
 */
public class DynamicJDBCEnvInfoProvider implements oracle.jbo.common.ampool.EnvInfoProvider {
    private String mJDBCUserName = null;
    private String mJDBCPassword = null;
    private String mJDBCURL = null;

    public DynamicJDBCEnvInfoProvider() {
        super();
    }

    public DynamicJDBCEnvInfoProvider(String jdbcUserName, String jdbcPassword,
                                      String jdbcURL) {
        mJDBCUserName = jdbcUserName;
        mJDBCPassword = jdbcPassword;
        mJDBCURL = jdbcURL;
    }

    public Object getInfo(String info, Object connEnvironment) {
        //if (EnvInfoProvider.INFO_TYPE_JDBC_PROPERTIES.equals(info)) {

        Hashtable envInfo = (Hashtable)connEnvironment;

        if (mJDBCUserName != null) {
            //if (envInfo.containsKey(Configuration.DB_USERNAME_PROPERTY))
            envInfo.put(Configuration.DB_USERNAME_PROPERTY, mJDBCUserName);
        }
        if (mJDBCPassword != null) {
            //if (envInfo.containsKey(Configuration.DB_PASSWORD_PROPERTY))
            envInfo.put(Configuration.DB_PASSWORD_PROPERTY, mJDBCPassword);
        }
        if (mJDBCURL != null) {
            // if (envInfo.containsKey(Configuration.DB_CONNECT_STRING_PROPERTY))
            envInfo.put(Configuration.DB_CONNECT_STRING_PROPERTY, mJDBCURL);
            // if (envInfo.containsKey(Configuration.JDBC_DS_NAME))
            envInfo.put(Configuration.JDBC_DS_NAME, mJDBCURL);
        }
        //}
        System.out.println(envInfo.get(Configuration.DB_USERNAME_PROPERTY));
        System.out.println(envInfo.get(Configuration.DB_PASSWORD_PROPERTY));
        System.out.println(envInfo.get(Configuration.JDBC_DS_NAME));
        System.out.println(envInfo.get(Configuration.DB_CONNECT_STRING_PROPERTY));
        System.out.println(envInfo.get(Configuration.JDBC_CONNECTION_NAME));
        return envInfo;// ??????e k dug toi c
    }

    /**
     * @deprecated {@link #getInfo(String, Object)} should be implemented
     * @since 9.0.2
     */
    @Deprecated
    public void modifyInitialContext(Object initialContext) {
    }

    public int getNumOfRetries() {
        return 0;
    }
}
