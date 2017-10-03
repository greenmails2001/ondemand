package com.vc.sasn.beans;

import com.oracle.adffwkextensions.faces.FacesUtils;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.fragment.RichRegion;

public class AdminBackingBean {
    public AdminBackingBean() {
    }
    private String outcome;
    private RichRegion region;

    public void setOutcomeActionListener(ActionEvent actionEvent) {
        UIComponent component = (UIComponent)actionEvent.getSource();
        Map<String, Object> map = component.getAttributes();
        this.outcome = (String)map.get("outcome");
        this.setOutcome(this.outcome);
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
        this.region.getRegionModel().refresh(FacesContext.getCurrentInstance());
        FacesUtils.addPartialTarget(this.region);
    }

    public String getOutcome() {
        return outcome;
    }

    public void setRegion(RichRegion region) {
        this.region = region;
    }

    public RichRegion getRegion() {
        return region;
    }
}
