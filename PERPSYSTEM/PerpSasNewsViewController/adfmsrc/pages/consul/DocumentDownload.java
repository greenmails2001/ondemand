package pages.consul;


import com.oracle.adffwkextensions.faces.FacesUtils;
import com.oracle.adffwkextensions.utils.DateUtils;

import com.vc.sasn.ItemBean;
import com.vc.sasnmodel.views.sasn.common.DocumentDownloadsRow;
import com.vc.sasnmodel.views.sasn.common.NewsRow;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.jbo.ViewObject;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.uicli.binding.JUIteratorBinding;

import org.apache.myfaces.trinidad.model.UploadedFile;


public class DocumentDownload extends ItemBean {

    public static final String DOWNLOAD_ITERATOR =
        "Sasn09DocumentDownloadsListInDocumentCategoriesIterator";
    private RichInputText afFileName;
    private RichInputText afFileType;
    private RichInputText afDataSize;

    public DocumentDownload() {

    }

    @Override
    public void createItemActionListener(ActionEvent actionEvent) {
        JUIteratorBinding ib =
            FacesUtils.getIteratorBinding(DOWNLOAD_ITERATOR);
        ViewObject view = ib.getViewObject();
        DocumentDownloadsRow row = (DocumentDownloadsRow)view.createRow();
        row.setPublicDate(DateUtils.getOracleSysdate());
        view.insertRow(row);
        view.setCurrentRow(row);
        FacesUtils.showPopup(this.itemPopup);
    }

    @Override
    public String getIteratorName() {
        return DOWNLOAD_ITERATOR;
    }

    public void fileDownloadValueChangeListener(ValueChangeEvent ev) {
        UploadedFile file = (UploadedFile)ev.getNewValue();

        String fileName = file.getFilename();
        if (fileName == null) {
            return;
        }

        fileName = fileName.trim().toLowerCase();
        int idx = fileName.lastIndexOf(".");
        if (idx == -1) {
            return;
        }
        String ext = fileName.substring(idx + 1);
        fileName = fileName.substring(0, idx);

        try {
            InputStream is = file.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int total = 0;
            int i = -1;
            while ((i = is.read(bytes)) > 0) {
                baos.write(bytes, 0, i);
                total += i;
            }
            byte[] data = baos.toByteArray();

            is.close();
            baos.close();
            // get current Customer object .
            JUIteratorBinding ib =
                FacesUtils.getIteratorBinding(DOWNLOAD_ITERATOR);
            DocumentDownloadsRow row =
                (DocumentDownloadsRow)ib.getCurrentRow();
            if (row != null) {
                BlobDomain blob = new BlobDomain();
                blob.setBytes(data);
                row.setDownloadData(blob);
                row.setDataSize(new Number(total));
                row.setFileName(fileName);
                row.setFileType(ext);
            }
            FacesUtils.addPartialTarget(this.afDataSize);
            FacesUtils.addPartialTarget(this.afFileName);
            FacesUtils.addPartialTarget(this.afFileType);
        } catch (Exception e) {
            System.err.print("Error Upload Image 1 :" + e);
        }

    }

    public void setAfFileName(RichInputText afFileName) {
        this.afFileName = afFileName;
    }

    public RichInputText getAfFileName() {
        return afFileName;
    }

    public void setAfFileType(RichInputText afFileType) {
        this.afFileType = afFileType;
    }

    public RichInputText getAfFileType() {
        return afFileType;
    }

    public void setAfDataSize(RichInputText afDataSize) {
        this.afDataSize = afDataSize;
    }

    public RichInputText getAfDataSize() {
        return afDataSize;
    }
}
