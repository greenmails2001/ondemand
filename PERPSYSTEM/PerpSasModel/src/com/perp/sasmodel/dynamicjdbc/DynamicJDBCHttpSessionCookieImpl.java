package com.perp.sasmodel.dynamicjdbc;

import java.security.Principal;

import oracle.jbo.common.ampool.ApplicationPool;
import oracle.jbo.common.ampool.EnvInfoProvider;
import oracle.jbo.http.HttpSessionCookieImpl;


public class DynamicJDBCHttpSessionCookieImpl extends HttpSessionCookieImpl {
    public DynamicJDBCHttpSessionCookieImpl(java.lang.String applicationId,
                                            java.lang.String sessionId,
                                            ApplicationPool pool) {
        super(applicationId, sessionId, pool);
    }

    public DynamicJDBCHttpSessionCookieImpl(String applicationId,
                                            String sessionId,
                                            ApplicationPool pool,
                                            Principal userPrincipal) {
        super(applicationId, sessionId, pool, userPrincipal);
    }

    public void setEnvInfoProvider(EnvInfoProvider envInfoProvider) {
        if (envInfoProvider != null) {
            super.setEnvInfoProvider(envInfoProvider);
        }
    }
}
