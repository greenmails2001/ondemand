package com.perp.sasviewcontroller;

import com.oracle.adffwkextensions.faces.ADFUtils;

import com.oracle.adffwkextensions.faces.JSFUtils;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlAttrsBinding;

import java.math.BigDecimal;

import java.util.List;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import java.util.Iterator;

import oracle.adf.view.rich.component.rich.data.RichTree;
import oracle.adf.view.rich.component.rich.data.RichTreeTable;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

// import oracle.javatools.ui.treetable.TreeTableModel;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlAttrsBinding;

import oracle.javatools.ui.treetable.TreeTableModel;

import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.TreeModel;

public class MenuTreeSelected {

    public MenuTreeSelected() {
    }

    private Object invokeMethodExpression(String expr, Class returnType, Class[] argTypes, Object[] args) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ELContext elctx = fc.getELContext();
        ExpressionFactory elFactory = fc.getApplication().getExpressionFactory();
        MethodExpression methodExpr = elFactory.createMethodExpression(elctx, expr, returnType, argTypes);
        return methodExpr.invoke(elctx, args);
    }

    // khi chon Tree ==> mac dinh no goi cai nay==>
    // #{bindings.SasMenusRootX1.treeModel.makeCurrent}
    // De thiet lap trang thai Row hien thoi dang duoc chon
    // ===> Xoa no di ==> Goi vao phuong thuc
    // Nhu vay khi tree select ==> Method nay duoc goi.
    // Nhung phai goi ==> #{bindings.SasMenusRootX1.treeModel.makeCurrent}
    // (Goi trong Code).
    public void onPrintSelection(SelectionEvent selectionEvent) {
        // Cho nay muc dich chi la set Trang thai Row vua chon la hien thoi.
        // ==> Xong, chang can lam gi them.
        invokeMethodExpression("#{bindings.SasMenusRootX1.treeModel.makeCurrent}", Object.class,
                               new Class[] { SelectionEvent.class }, new Object[] { selectionEvent });
        // Chay lai di,stop start ? stop di chay lai,may e nó cham nh
        // Lay ra Tree tao ra su kien (Bi Select).
        //// Loi ep kieu, kieu cua minh la RichTreeTable.
        RichTreeTable treeTable = (RichTreeTable) selectionEvent.getSource();
        // Bien nay dau su dung.
        //// TreeTableModel model = (TreeTableModel) treeTable.getValue();
        // Day la danh sach cac Row dang bi lua chon (Co the la 1 hoac nhieu Row).
        RowKeySet rowKeySet = selectionEvent.getAddedSet();
        // Tao bo lap de duyet danh sach cac Row.
        Iterator rksIterator = rowKeySet.iterator();
        // Duyet tung Row
        while (rksIterator.hasNext()) {
            List key = (List) rksIterator.next();
            JUCtrlHierBinding treeBinding = null;
            CollectionModel collectionModel = (CollectionModel) treeTable.getValue();
            treeBinding = (JUCtrlHierBinding) collectionModel.getWrappedData();
            JUCtrlHierNodeBinding nodeBinding = null;
            nodeBinding = treeBinding.findNodeByKeyPath(key);
            // Nhay den 1 Row (Trong danh sach dang dc chon).
            // Lay duoc 1 dong (Row) ==> Con tro dang dung tai dong nay
            Row rw = nodeBinding.getRow();
            // Cai cho nay la lay ra gia tri cua cot: Checklist_Structure_Id

            // Biet truoc la kieu String roi.
            String menuLable = (String) rw.getAttribute("MenuLable");
            // Roi muon gi nua??
            // mu?n nó gán giá tri dc ch?n cho Label2 a
            // 
            // //#{bindings.MenuLable} ==> Day la binding cua Label2
            
            //Chay thu cach 1 truoc. Sau do rao lai chay cach 2.
            // Cach 1:
            FacesCtrlAttrsBinding menuLabelBinding =
                (FacesCtrlAttrsBinding) JSFUtils.resolveExpression("#{bindings.MenuLable}"); 
            menuLabelBinding.setInputValue(menuLable);
            
            // Cach 2:'
            //RichInputText inputText2 =(RichInputText)JSFUtils. findComponentInRoot("it1");
            // inputText2.setValue(menuLable); // Dung roi
            
            
          //  RichInputText inputText2 = (RichInputText) menuLabelBinding.getControl();
            //  RichInputText inputText2 = (RichInputText) JSFUtils.resolveExpression("#{bindings.MenuLable}");
          //  inputText2.setValue(menuLable); // Dung roi
            // Chay di, stop chay lai hay refresh trang. laStop
        }
    }

}
