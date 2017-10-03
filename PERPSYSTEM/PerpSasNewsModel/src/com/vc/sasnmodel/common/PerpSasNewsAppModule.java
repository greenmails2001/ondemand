package com.vc.sasnmodel.common;

import com.vc.sasnmodel.beans.NewsOthersBean;
import com.vc.sasnmodel.views.customize.common.C01DocumentDownloadsRow;
import com.vc.sasnmodel.views.customize.common.C01NewsOthersRow;
import com.vc.sasnmodel.views.sasn001.common.Sasn001CustomersRow;

import java.util.List;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 12 22:14:34 ICT 2010
// ---------------------------------------------------------------------
public interface PerpSasNewsAppModule extends ApplicationModule {


    void generateImageFromBlobDatas(String realPath);

    void prepareToShowNewsOthers(String notNumber);

    void createGuestQuestion(String title, String content, Number agrId,
                             String guestEmail, String guestPhone);

    C01DocumentDownloadsRow getDocumentDownloadById(Number ddoId);

    void increaseDocumentDownloadCount(Number ddoId);

    List<C01NewsOthersRow> getC01NewsOthers(String notNumber);

    C01NewsOthersRow getC01NewsOthersByCode(String notNumber);

    void saveNewsOthersBean(NewsOthersBean newsOthers);

    boolean insertContactInfo(String contactName, String companyName,
                              String address, String phoneNumber, String email,
                              String content, String confirmCode,
                              String createBy);

    void prepareToShowConsultantByCcaId(Number CcaId);

    void prepareToShowDocumentDownloadByDcaId(Number DcaId);
    
    void prepareToShowServiceBySerId(Number SerId);
}
