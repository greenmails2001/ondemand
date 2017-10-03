package com.vc.sasn.beans;

import com.oracle.adffwkextensions.faces.FacesUtils;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.jbo.domain.Number;

import oracle.adf.view.rich.component.rich.fragment.RichRegion;

public class ConsulTaskFlowBean {
    private String taskFlow = "consult";
    private RichRegion region;

    private Number ccaId;

    public ConsulTaskFlowBean() {
        super();
    }

    public void setTaskFlowActionListener(ActionEvent actionEvent) {
        UIComponent component = (UIComponent)actionEvent.getSource();
        Map<String, Object> map = component.getAttributes();
        this.taskFlow = (String)map.get("taskFlow");
        this.ccaId = (Number)map.get("ccaId");
        this.setTaskFlow(this.taskFlow);
    }

    public void setTaskFlow(String taskFlow) {
        this.taskFlow = taskFlow;
        this.region.getRegionModel().refresh(FacesContext.getCurrentInstance());
        FacesUtils.addPartialTarget(this.region);
    }

    public String getTaskFlow() {
        return taskFlow;
    }

    public void setRegion(RichRegion region) {
        this.region = region;
    }

    public RichRegion getRegion() {
        return region;
    }

    public void setCcaId(Number ccaId) {
        this.ccaId = ccaId;
    }

    public Number getCcaId() {
        return ccaId;
    }
}
