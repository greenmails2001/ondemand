package com.perp.beans;

import java.io.Serializable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils implements Serializable {
    public DBUtils() {
    }

    public static void close(PreparedStatement pstm) {
        try {
            pstm.close();
        } catch (Exception e) {
        }
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (Exception e) {
        }
    }

    public static void close(Statement sttm) {
        try {
            sttm.close();
        } catch (Exception e) {
        }
    }
}
