package com.vc.sasn;

public class Testting2 {
    public Testting2() {
        super();
        String bookmark = "indextab.customer+view.default+subtab.statistic";
        System.out.println("S=" + bookmark);
        int i = 0;
        int j = 0;
        int k = 0;
        String key;
        String value;
        String kv;
        while (true) {
            j = bookmark.indexOf('+', i);
            System.out.println("j=" + j);
            if (j > -1) {
                kv = bookmark.substring(i, j);
            } else {
                kv = bookmark.substring(i);
            }
            k = kv.indexOf('.');
            if (k > -1) {
                key = kv.substring(0, k);
                value = kv.substring(k + 1);
            } else {
                key = kv;
                value = null;
            }
            System.out.println("key=" + key + " / value=" + value);
            if (j < 0) {
                break;
            }
            i = j + 1;
        }
    }

    public static void main(String[] args) {
        Testting2 testting2 = new Testting2();
    }
}
