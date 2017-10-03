package pages.consul;


import com.oracle.adffwkextensions.faces.FacesUtils;

import com.oracle.adffwkextensions.utils.DateUtils;

import com.vc.sasn.ItemBean;

import com.vc.sasnmodel.views.sasn.common.ConsultantsRow;
import com.vc.sasnmodel.views.sasn.common.NewsRow;

import java.util.Map;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUIteratorBinding;

import org.apache.myfaces.trinidad.event.DisclosureEvent;


public class ConsulBean extends ItemBean {
    public static final String CONSULTANT_ITERATOR =
        "Sasn03ConsultantsListInConsultantCategoriesIterator";


    public void createItemActionListener(ActionEvent actionEvent) {
        JUIteratorBinding ib =
            FacesUtils.getIteratorBinding(CONSULTANT_ITERATOR);
        ViewObject view = ib.getViewObject();
        ConsultantsRow row = (ConsultantsRow)view.createRow();
        row.setCreatedBy("hatv");
        view.insertRow(row);
        view.setCurrentRow(row);
        FacesUtils.showPopup(this.itemPopup);
    }

    public String getIteratorName() {
        return CONSULTANT_ITERATOR;
    }

    public void consulDisclosureListener(DisclosureEvent disclosureEvent) {
        // Add event code here...
    }
}
