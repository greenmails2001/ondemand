package com.perp.sasmodel.dynamicjdbc;


import com.perp.beans.PerpEnvChecking;

import javax.servlet.http.HttpSession;

public class PerpSasLoginHelper {
    public static final String SESSION_ATTRIBUTE_SUBSCRIPTION_CHECKING =
        "SubscriptionCheckingInfo";

    private PerpSasLoginHelper() {
    }


    public static boolean envInfoFound(HttpSession session) {
         PerpEnvChecking checkingInfo =
            (PerpEnvChecking)session.getAttribute(SESSION_ATTRIBUTE_SUBSCRIPTION_CHECKING);
        //System.out.println("PerpSasLoginHelper.envInfoFound checkingInfo=" + checkingInfo);
        if (checkingInfo == null || !checkingInfo.isEnvFound()) {
            //System.out.println("PerpSasLoginHelper.envInfoFound =false");
            return false;
        }
        return true;
    }
}
