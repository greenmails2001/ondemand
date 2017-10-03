package pages.serv;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.ItemBean;
import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import com.vc.sasnmodel.views.sasn.common.CustomersRow;

import com.vc.sasnmodel.views.sasn.common.ServicesRow;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUIteratorBinding;

public class ServBean extends ItemBean {
    public static final String SERVICE_ITERATOR = "Sasn05ServicesIterator";


    public void createItemActionListener(ActionEvent actionEvent) {
        throw new RuntimeException("sssssss");
    }

    public String getIteratorName() {
        return SERVICE_ITERATOR;
    }
}
