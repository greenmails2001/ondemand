package pages.news;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import com.vc.sasnmodel.views.sasn.common.NewsRow;
import com.vc.sasnmodel.views.sasn.common.ServicesRow;

import com.oracle.adffwkextensions.utils.DateUtils;

import com.vc.sasn.ItemBean;

import java.util.Date;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUIteratorBinding;

public class NewsBean extends ItemBean {

    public static final String NEWS_CATEGORIES_ITERATOR =
        "Sasn04NewsCategoriesIterator";

    public static final String NEWS_ITERATOR =
        "Sasn04NewsListInNewsCategoriesIterator";


    public NewsBean() {
    }


    @Override
    public void createItemActionListener(ActionEvent actionEvent) {
        JUIteratorBinding ib = FacesUtils.getIteratorBinding(NEWS_ITERATOR);
        ViewObject view = ib.getViewObject();
        NewsRow row = (NewsRow)view.createRow();
        row.setCreatedBy("hatv");
        row.setNewsDate(DateUtils.getOracleSysdate());
        view.insertRow(row);
        view.setCurrentRow(row);
        FacesUtils.showPopup(this.itemPopup);
    }

    @Override
    public String getIteratorName() {
        return NEWS_ITERATOR;
    }
}
