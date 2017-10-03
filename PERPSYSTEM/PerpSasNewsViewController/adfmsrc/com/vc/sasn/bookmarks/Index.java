package com.vc.sasn.bookmarks;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.Testting;

import java.util.Map;
import java.util.TreeMap;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.context.AdfFacesContext;

/**
 * Tham so truyen den trang nay co dang:
 * <pre>
 *  http://127.0.0.1:7101/sasn/faces/index.jspx?bookmark=indextab.customer.view.default.subtab.statistic;catId=123.id=
 *      indextab : customer
 *      view : default
 *      subTab : statistic
 *
 *  http://127.0.0.1:7101/sasn/faces/index.jspx?bookmark=introduction.default.role
 * </pre>
 */
public class Index {

    public static final String INDEX_TAB = "indextab";
    public static final String VIEW = "view";
    public static final String SUB_TAB = "subtab";
    public static final String SEPARATOR = ".";

    private IndexTabEnum indexTabObj;


    private SubPageBookmark subBookmark;

    private Map<String, String> bookmarkInfo = new TreeMap<String, String>();

    private RichPanelTabbed indexTabPanel;
    private RichRegion introductionRegion;


    public Index() {
    }

    public synchronized void setBookmark(String bookmark) {
        String indexTab = null;


        if (bookmark != null) {
            int i = 0;
            int j = 0;
            int k = 0;
            String key;
            String value;

            while (true) {
                i = bookmark.indexOf(SEPARATOR, j);
                if (i > -1) {
                    key = bookmark.substring(j, i);
                    j = bookmark.indexOf(SEPARATOR, i + 1);
                    if (j > -1) {
                        value = bookmark.substring(i + 1, j);
                        j++;
                    } else {
                        value = bookmark.substring(i + 1);
                        j = i + 1;
                    }
                    System.out.println("Key =" + key + "/ value=" + value);
                    this.bookmarkInfo.put(key, value);
                } else {
                    break;
                }
            }
        }
        indexTab = this.bookmarkInfo.get(INDEX_TAB);
        this.indexTabObj = IndexTabEnum.getInstance(indexTab);
        this.dispatch();
    }

    private void dispatch() {
        if (this.indexTabObj == IndexTabEnum.TAB_CONSULTANT) {
            this.subBookmark = new ConsultantBookmark(this.bookmarkInfo);
        } else if (this.indexTabObj == IndexTabEnum.TAB_CUSTOMER) {
            this.subBookmark = new CustomerBookmark(this.bookmarkInfo);
        } else if (this.indexTabObj == IndexTabEnum.TAB_INTRODUCTION) {
            System.out.println("Introduction");
            this.subBookmark = new IntroductionBookmark(this.bookmarkInfo);
        } else if (this.indexTabObj == IndexTabEnum.TAB_NEWS) {
            this.subBookmark = new NewsBookmark(this.bookmarkInfo);
        } else if (this.indexTabObj == IndexTabEnum.TAB_PARTNER) {
            this.subBookmark = new PartnerBookmark(this.bookmarkInfo);
        } else if (this.indexTabObj == IndexTabEnum.TAB_PRODUCT) {
            this.subBookmark = new ProductBookmark(this.bookmarkInfo);
        } else if (this.indexTabObj == IndexTabEnum.TAB_SERVICE) {
            this.subBookmark = new ServiceBookmark(this.bookmarkInfo);
        } else if (this.indexTabObj == IndexTabEnum.TAB_SYSTEM) {
            this.subBookmark = new SystemBookmark(this.bookmarkInfo);
        }
    }


    public String getIndexTab() {
        return indexTabObj == null ? null : indexTabObj.code;
    }

    public void setIndexTabPanel(RichPanelTabbed indexTabPanel) {
        this.indexTabPanel = indexTabPanel;
    }

    public RichPanelTabbed getIndexTabPanel() {
        return indexTabPanel;
    }

    public SubPageBookmark getSubBookmark() {
        return subBookmark;
    }

    // Nguoi dung click vao cac hinh anh Vai tro tren trang Index

    public void showRoleVideoDemoActionListener(ActionEvent e) {
        String bookmark =
            INDEX_TAB + SEPARATOR + IndexTabEnum.TAB_INTRODUCTION.code +
            SEPARATOR + VIEW + SEPARATOR + "default" + SEPARATOR + SUB_TAB +
            SEPARATOR + IntroductionBookmark.TAB_ROLE;
        this.setBookmark(bookmark);
        System.out.println("Show Role :" + bookmark);
        //  FacesUtils.addPartialTarget(this.indexTabPanel);
        

        this.introductionRegion.getRegionModel().refresh(FacesContext.getCurrentInstance());
        // this.introductionRegion.refresh(FacesContext.getCurrentInstance());
        //  FacesUtils.addPartialTarget(this.introductionRegion);
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.introductionRegion);
        
        
        
       AdfFacesContext.getCurrentInstance().addPartialTarget(this.indexTabPanel);
    }

    public void setIntroductionRegion(RichRegion introductionRegion) {
        this.introductionRegion = introductionRegion;
    }

    public RichRegion getIntroductionRegion() {
        return introductionRegion;
    }


    enum IndexTabEnum {
        TAB_INTRODUCTION("introduction"),
        TAB_PRODUCT("product"),
        TAB_SERVICE("service"),
        TAB_PARTNER("partner"),
        TAB_CUSTOMER("customer"),
        TAB_NEWS("news"),
        TAB_CONSULTANT("consultant"),
        TAB_SYSTEM("system");

        private String code;

        IndexTabEnum(String code) {
            this.code = code;
        }

        public static IndexTabEnum getInstance(String code) {
            for (IndexTabEnum cat : IndexTabEnum.values()) {
                if (cat.code.equalsIgnoreCase(code)) {
                    return cat;
                }
            }
            return null;
        }
    }

}
