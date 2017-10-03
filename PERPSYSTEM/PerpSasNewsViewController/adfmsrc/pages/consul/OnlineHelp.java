package pages.consul;

import com.oracle.adffwkextensions.faces.FacesUtils;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUIteratorBinding;

public class OnlineHelp {
    private static String ITERATOR_NAME = "";
    private RichPopup popup;

    public OnlineHelp() {
    }

    public void setPopup(RichPopup popup) {
        this.popup = popup;
    }

    public RichPopup getPopup() {
        return popup;
    }


}
