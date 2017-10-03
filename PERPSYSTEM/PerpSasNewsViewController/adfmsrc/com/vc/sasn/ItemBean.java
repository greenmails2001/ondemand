package com.vc.sasn;

import com.oracle.adffwkextensions.faces.FacesUtils;
import com.oracle.adffwkextensions.utils.DateUtils;

import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;
import com.vc.sasnmodel.views.sasn.common.NewsRow;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUIteratorBinding;

public abstract class ItemBean {

    protected RichPopup itemPopup;
    protected RichPopup confirmDelItemPopup;

    public ItemBean() {
        super();
    }

    public void setItemPopup(RichPopup itemPopup) {
        this.itemPopup = itemPopup;
    }

    public RichPopup getItemPopup() {
        return itemPopup;
    }

    public void setConfirmDelItemPopup(RichPopup confirmDelItemPopup) {
        this.confirmDelItemPopup = confirmDelItemPopup;
    }

    public RichPopup getConfirmDelItemPopup() {
        return confirmDelItemPopup;
    }

    public void editItemActionListener(ActionEvent actionEvent) {
        UIComponent link = (UIComponent)actionEvent.getSource();
        Map<String, Object> map = link.getAttributes();
        oracle.jbo.domain.Number itemId =
            (oracle.jbo.domain.Number)map.get("itemId");
        System.out.println("ItemID Edit=" + itemId);
        if (itemId != null) {
            JUIteratorBinding ib =
                FacesUtils.getIteratorBinding(this.getIteratorName());
            Key key = new Key(new Object[] { itemId });
            ViewObject view = ib.getViewObject();
            Row row = view.getRow(key);
            view.setCurrentRow(row);
        }
        FacesUtils.showPopup(itemPopup);
    }

    public void cancelSaveItemActionListener(ActionEvent actionEvent) {
        PerpSasNewsAppModule module = SasnFacesUtils.getPerpSasNewsAppModule();
        module.getTransaction().rollback();
        FacesUtils.hidePopup(this.itemPopup);
    }

    public void saveItemActionListener(ActionEvent actionEvent) {
        PerpSasNewsAppModule module = SasnFacesUtils.getPerpSasNewsAppModule();
        module.getTransaction().commit();
        FacesUtils.hidePopup(this.itemPopup);
    }


    public void showConfirmDelItemActionListener(ActionEvent actionEvent) {
        UIComponent link = (UIComponent)actionEvent.getSource();
        Map<String, Object> map = link.getAttributes();
        oracle.jbo.domain.Number itemId =
            (oracle.jbo.domain.Number)map.get("itemId");
        if (itemId != null) {
            JUIteratorBinding ib =
                FacesUtils.getIteratorBinding(this.getIteratorName());
            Key key = new Key(new Object[] { itemId });
            ViewObject view = ib.getViewObject();
            Row row = view.getRow(key);
            view.setCurrentRow(row);
        }
        FacesUtils.showPopup(this.confirmDelItemPopup);
    }

    public void cancelDelItemActionListener(ActionEvent actionEvent) {
        FacesUtils.hidePopup(this.confirmDelItemPopup);
    }

    /**
     * Chap nhan xoa . Method nay se duoc goi
     * @param actionEvent
     */
    public void deleteItemActionListener(ActionEvent actionEvent) {
        JUIteratorBinding ib =
            FacesUtils.getIteratorBinding(this.getIteratorName());
        ib.removeCurrentRow();
        PerpSasNewsAppModule module = SasnFacesUtils.getPerpSasNewsAppModule();
        module.getTransaction().commit();
        FacesUtils.hidePopup(this.confirmDelItemPopup);
    }


    public abstract void createItemActionListener(ActionEvent actionEvent);

    public abstract String getIteratorName();
}
