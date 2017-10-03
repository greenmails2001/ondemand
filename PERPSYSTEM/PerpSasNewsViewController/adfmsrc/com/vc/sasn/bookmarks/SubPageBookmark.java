package com.vc.sasn.bookmarks;

import java.util.Map;

public abstract class SubPageBookmark {

    protected Map<String, String> bookmarkInfo;

    public SubPageBookmark(Map<String, String> bookmarkInfo) {
        this.bookmarkInfo = bookmarkInfo;
    }

    public void setBookmarkInfo(Map<String, String> bookmarkInfo) {
        this.bookmarkInfo = bookmarkInfo;
    }


    public String getSubTab() {
        String subtab= this.bookmarkInfo.get(Index.SUB_TAB);
        System.out.println("Subtab="+subtab);
        return subtab;
    }


}
