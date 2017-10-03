package com.oracle.adffwkextensions.faces;

import java.util.ResourceBundle;

public class BundleUtils {
    private String bundleName;
    private ResourceBundle bundle;

    public BundleUtils(String _bundleName) {
        this.bundleName = _bundleName;
        this.bundle = ResourceBundle.getBundle(this.bundleName);
    }

    public static String getBundle(String key) {
        return key;
    }

    public String getMessage(String key) {
        if (this.bundle != null) {
            return this.bundle.getString(key);
        }
        return key;
    }

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public ResourceBundle getBundle() {
        return bundle;
    }
}
