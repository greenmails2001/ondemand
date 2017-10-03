package pages.prod;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUIteratorBinding;

public class ProdBean {

    public static final String PRODUCT_ITERATOR = "Sasn02C01ProductsIterator";
    private RichPopup prodPopup;

    public ProdBean() {
        super();
    }

    public void setProdPopup(RichPopup prodPopup) {
        this.prodPopup = prodPopup;
    }

    public RichPopup getProdPopup() {
        return prodPopup;
    }


    public void editProductActionListener(ActionEvent actionEvent) {
        UIComponent link = (UIComponent)actionEvent.getSource();
        Map<String, Object> map = link.getAttributes();
        oracle.jbo.domain.Number prodId =
            (oracle.jbo.domain.Number)map.get("prodId");
        JUIteratorBinding ib = FacesUtils.getIteratorBinding(PRODUCT_ITERATOR);
        Key key = new Key(new Object[] { prodId });
        ViewObject view = ib.getViewObject();
        Row row = view.getRow(key);
        view.setCurrentRow(row);
        FacesUtils.showPopup(prodPopup);
    }

    public void saveProdActionListener(ActionEvent actionEvent) {
        PerpSasNewsAppModule module = SasnFacesUtils.getPerpSasNewsAppModule();
        module.getTransaction().commit();
        FacesUtils.hidePopup(this.prodPopup);
    }

    public void cancelProdActionListener(ActionEvent actionEvent) {
        PerpSasNewsAppModule module = SasnFacesUtils.getPerpSasNewsAppModule();
        module.getTransaction().rollback();
        FacesUtils.hidePopup(this.prodPopup);
    }


}
