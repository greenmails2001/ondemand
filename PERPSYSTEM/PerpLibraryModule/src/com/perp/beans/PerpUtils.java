package com.perp.beans;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.regex.Pattern;

public class PerpUtils {
    private static final String FAIL = "FAIL";

    public PerpUtils() {
        super();
    }

    public static String EncryptPassword(String pass) {
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(pass.getBytes("UTF-8"));

            digest = new String(hash, "US-ASCII");
        } catch (UnsupportedEncodingException ex) {
            return FAIL;
        } catch (NoSuchAlgorithmException ex) {
            return FAIL;
        }
        return digest;
    }

    public static Boolean isValidPwd(String password) {
        Pattern pattern;
        final String pwdRegex =
            "^.*(?=.{6,})(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*$";
        if (password == null) {
            return false;
        }
        pattern = Pattern.compile(pwdRegex);

        return pattern.matcher(password).matches();
    }

    public static Boolean isEmailAddress(String emailAddress) {
        Pattern pattern;
        if (emailAddress == null) {
            return false;
        }
        String regex =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$";

        pattern = Pattern.compile(regex);

        return pattern.matcher(emailAddress).matches();
    }
}
