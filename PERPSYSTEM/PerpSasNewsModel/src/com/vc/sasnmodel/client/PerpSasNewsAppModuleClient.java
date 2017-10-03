package com.vc.sasnmodel.client;

import com.vc.sasnmodel.beans.NewsOthersBean;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import com.vc.sasnmodel.views.customize.common.C01DocumentDownloadsRow;
import com.vc.sasnmodel.views.customize.common.C01NewsOthersRow;
import com.vc.sasnmodel.views.sasn001.common.Sasn001CustomersRow;

import java.util.List;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 12 22:14:34 ICT 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PerpSasNewsAppModuleClient extends ApplicationModuleImpl implements PerpSasNewsAppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public PerpSasNewsAppModuleClient() {
    }


    public void generateImageFromBlobDatas(String realPath) {
        Object _ret =
            this.riInvokeExportedMethod(this,"generateImageFromBlobDatas",new String [] {"java.lang.String"},new Object[] {realPath});
        return;
    }

    public void prepareToShowNewsOthers(String notNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"prepareToShowNewsOthers",new String [] {"java.lang.String"},new Object[] {notNumber});
        return;
    }

    public void createGuestQuestion(String title, String content, Number agrId,
                                    String guestEmail, String guestPhone) {
        Object _ret =
            this.riInvokeExportedMethod(this,"createGuestQuestion",new String [] {"java.lang.String","java.lang.String","oracle.jbo.domain.Number","java.lang.String","java.lang.String"},new Object[] {title, content, agrId, guestEmail, guestPhone});
        return;
    }

    public C01DocumentDownloadsRow getDocumentDownloadById(Number ddoId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getDocumentDownloadById",new String [] {"oracle.jbo.domain.Number"},new Object[] {ddoId});
        return (C01DocumentDownloadsRow)_ret;
    }

    public void increaseDocumentDownloadCount(Number ddoId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"increaseDocumentDownloadCount",new String [] {"oracle.jbo.domain.Number"},new Object[] {ddoId});
        return;
    }

    public List<C01NewsOthersRow> getC01NewsOthers(String notNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getC01NewsOthers",new String [] {"java.lang.String"},new Object[] {notNumber});
        return (List<C01NewsOthersRow>)_ret;
    }

    public C01NewsOthersRow getC01NewsOthersByCode(String notNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getC01NewsOthersByCode",new String [] {"java.lang.String"},new Object[] {notNumber});
        return (C01NewsOthersRow)_ret;
    }

    public void saveNewsOthersBean(NewsOthersBean newsOthers) {
        Object _ret =
            this.riInvokeExportedMethod(this,"saveNewsOthersBean",new String [] {"com.vc.sasnmodel.beans.NewsOthersBean"},new Object[] {newsOthers});
        return;
    }

    public boolean insertContactInfo(String contactName, String companyName,
                                     String address, String phoneNumber,
                                     String email, String content,
                                     String confirmCode, String createBy) {
        Object _ret =
            this.riInvokeExportedMethod(this,"insertContactInfo",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {contactName, companyName, address, phoneNumber, email, content, confirmCode, createBy});
        return ((Boolean)_ret).booleanValue();
    }

    public void prepareToShowConsultantByCcaId(Number CcaId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"prepareToShowConsultantByCcaId",new String [] {"oracle.jbo.domain.Number"},new Object[] {CcaId});
        return;
    }

    public void prepareToShowDocumentDownloadByDcaId(Number DcaId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"prepareToShowDocumentDownloadByDcaId",new String [] {"oracle.jbo.domain.Number"},new Object[] {DcaId});
        return;
    }

    public void prepareToShowServiceBySerId(Number SerId) {
      Object _ret =
          this.riInvokeExportedMethod(this,"prepareToShowServiceBySerId",new String [] {"oracle.jbo.domain.Number"},new Object[] {SerId});
      return;
    }
}