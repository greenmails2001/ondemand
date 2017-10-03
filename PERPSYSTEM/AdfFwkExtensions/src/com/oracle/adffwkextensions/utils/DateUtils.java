package com.oracle.adffwkextensions.utils;

import java.sql.Timestamp;


public class DateUtils {
    public DateUtils() {
        super();
    }

    public static oracle.jbo.domain.Date getOracleSysdate() {
        oracle.jbo.domain.Date date;
        Timestamp time = new Timestamp(new java.util.Date().getTime());
        date = new oracle.jbo.domain.Date(time);
        return date;
    }

}
