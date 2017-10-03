package com.vc.sasn.admin.beans;

import com.oracle.adffwkextensions.faces.FacesUtils;

import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.jbo.server.ViewRowImpl;

public class ValueHolder {
    private boolean enableEditing = false;
    private ViewRowImpl selectedRow;

    private boolean createAction = false;
    private boolean editAction = false;
    private boolean deleteAction = false;

    public ValueHolder() {
    }

    public void setEnableEditing(boolean enableEditing) {
        this.enableEditing = enableEditing;
    }

    public boolean isEnableEditing() {
        return enableEditing;
    }

    public void setSelectedRow(ViewRowImpl newSelectedRow) {
        this.selectedRow = newSelectedRow;
        if (this.selectedRow != null) {
            this.editAction = true;
        } else {
            this.editAction = false;
            this.createAction = false;
            this.deleteAction = false;
        }
    }

    public ViewRowImpl getSelectedRow() {
        return selectedRow;
    }

    public void setCreateAction(boolean createAction) {
        this.createAction = createAction;
        if (this.createAction) {
            this.enableEditing = true;
        } else {
            this.enableEditing = false;
        }
    }

    public boolean isCreateAction() {
        return createAction;
    }

    public void setEditAction(boolean editAction) {
        this.editAction = editAction;
    }

    public boolean isEditAction() {
        return editAction;
    }

    public void setDeleteAction(boolean deleteAction) {
        this.deleteAction = deleteAction;
        if (this.deleteAction) {
            this.enableEditing = true;
        } else {
            this.enableEditing = false;
        }
    }

    public boolean isDeleteAction() {
        return deleteAction;
    }

    public void setEnableEditingActionListener(ActionEvent actionEvent) {
        DCBindingContainer dcBindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        if (dcBindingContainer.getDataControl().isTransactionModified()) {
            this.editAction = true;
        } else {
            this.editAction = false;
        }
        if (this.editAction) {
            this.enableEditing = true;
        } else {
            this.enableEditing = false;
            FacesUtils.addMessage(null, "No change to apply!");
        }
    }
}
