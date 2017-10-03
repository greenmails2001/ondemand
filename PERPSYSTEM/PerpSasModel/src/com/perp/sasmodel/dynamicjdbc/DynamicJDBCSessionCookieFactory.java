package com.perp.sasmodel.dynamicjdbc;


import com.perp.beans.PerpEnvChecking;
import com.perp.beans.PerpSasEnv;

import java.util.Hashtable;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.adf.share.ADFContext;

import oracle.jbo.client.Configuration;
import oracle.jbo.common.ampool.ApplicationPool;
import oracle.jbo.common.ampool.EnvInfoProvider;
import oracle.jbo.common.ampool.SessionCookie;
import oracle.jbo.http.HttpSessionCookieFactory;


/**
 * This custom session cookie factory class is configured by setting
 * the jbo.ampool.sessioncookiefactoryclass property in the ADFBC
 * configuration environment properties.
 *
 * In this workspace, this property is configured on the "TestModuleLocal"
 * configuration of the TestModule application module.
 */
public class DynamicJDBCSessionCookieFactory extends HttpSessionCookieFactory {
    public DynamicJDBCSessionCookieFactory() {
        super();
    }

    @Override
    public SessionCookie createSessionCookie(String name, String value,
                                             ApplicationPool pool,
                                             Properties properties) {
        SessionCookie cookie =
            super.createSessionCookie(name, value, pool, properties);
      
        if (properties != null) {
            HttpServletRequest request =
                (HttpServletRequest)ADFContext.getCurrent().getEnvironment().getRequest();
            HttpSession session = request.getSession(false);

            if (session != null) {

                Hashtable env = pool.getEnvironment();
                
                //System.out.println(env.get(Configuration.DB_USERNAME_PROPERTY));
                env.remove(Configuration.DB_USERNAME_PROPERTY);
                
                //System.out.println(env.get(Configuration.DB_PASSWORD_PROPERTY));
                env.remove(Configuration.DB_PASSWORD_PROPERTY);
                
                //System.out.println(env.get(Configuration.JDBC_DS_NAME));
                env.remove(Configuration.JDBC_DS_NAME);
                
                //System.out.println(env.get(Configuration.DB_CONNECT_STRING_PROPERTY));
                env.remove(Configuration.DB_CONNECT_STRING_PROPERTY);

                //System.out.println(env.get(Configuration.JDBC_CONNECTION_NAME));
                env.remove(Configuration.JDBC_CONNECTION_NAME);


                PerpEnvChecking checkingInfo =
                    (PerpEnvChecking)session.getAttribute(PerpSasLoginHelper.SESSION_ATTRIBUTE_SUBSCRIPTION_CHECKING);
                PerpSasEnv perpEnv = checkingInfo.getPerpSasEnv();
                String dbUserName = perpEnv.getDbUser();

                String dbPassword = perpEnv.getDbPwd();
                String connectionURL = perpEnv.getConnectionURL();

                EnvInfoProvider provider =
                    new DynamicJDBCEnvInfoProvider(dbUserName, dbPassword,
                                                   connectionURL);
                cookie.setEnvInfoProvider(provider);
            }
        }
        //System.out.println("SessionCookie Created");
        return cookie;
    }

    @Override
    public Class getSessionCookieClass() {
        try {
            return Class.forName(DynamicJDBCHttpSessionCookieImpl.class.getName());
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            return null;
        }
    }
}
