package pages.cust;

import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.ItemBean;
import com.vc.sasnmodel.SasnImgConstants;

import com.vc.sasnmodel.views.sasn.common.CustomersRow;
import com.vc.sasnmodel.views.sasn001.common.Sasn001CustomersRow;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpServletRequest;


import oracle.adf.view.rich.component.rich.input.RichInputFile;


import oracle.jbo.ViewObject;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.uicli.binding.JUIteratorBinding;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class CustBean extends ItemBean {
    public static final String CUSTOMER_ITERATOR =
        "Sasn07CustomersListInIndustriesIterator";

    private RichInputFile afInputFile;


    public CustBean() {
        super();
    }


    public void setAfInputFile(RichInputFile afInputFile) {
        this.afInputFile = afInputFile;
    }

    public RichInputFile getAfInputFile() {
        return afInputFile;
    }


    public void uploadFileValueChangeListener(ValueChangeEvent valueChangeEvent) {
        UploadedFile file = (UploadedFile)valueChangeEvent.getNewValue();
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
        if (ext.equals("gif") || ext.equals("png") || ext.equals("jpg") ||
            ext.equals("jpge")) {
            try {
                InputStream is = file.getInputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] bytes = new byte[1024];
                int i = -1;
                while ((i = is.read(bytes)) > 0) {
                    baos.write(bytes, 0, i);
                }
                byte[] data = baos.toByteArray();
                is.close();
                baos.close();
                // get current Customer object .
                JUIteratorBinding ib =
                    FacesUtils.getIteratorBinding(CUSTOMER_ITERATOR);
                Sasn001CustomersRow row =
                    (Sasn001CustomersRow)ib.getCurrentRow();
                BlobDomain blob = new BlobDomain();
                blob.setBytes(data);
                row.setImage(blob);
                // Ghi xuong server .
                if (row.getCusId() != null) {
                    String imgFileName = row.getCusId() + ".jpg";
                    HttpServletRequest request =
                        (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
                    this.writeBlobImageToFile(request, blob,
                                              SasnImgConstants.RELATIVE_IMG_CUSTOMER_DIR,
                                              imgFileName);
                }
            } catch (Exception e) {
                System.err.print("Error Upload Image 1 :" + e);
            }
        }

    }

    /**
     *
     * @param blob
     * @param relativePath : ex relativePath = "images/generated/customers";
     * @param fileName : ex fileName = "abc.jpg";
     */
    private void writeBlobImageToFile(HttpServletRequest request,
                                      BlobDomain blob, String relativePath,
                                      String fileName) throws IOException {
        // Duong dan den Project duoc trien khai tren server (Weblogic)
        // Vi du : D:/Weblogic/.../PERPSYSTEM/PerpSasNewsViewControllerWebApp.war
        String realPath =
            request.getSession().getServletContext().getRealPath("");
        // Duong dan den thu muc chua file Image .
        // Vi du : D:/Weblogic/.../PERPSYSTEM/PerpSasNewsViewControllerWebApp.war/images/generated/customers
        String genImgPath = realPath + "/" + relativePath;
        File dir = new File(genImgPath);
        dir.mkdirs();
        String imgFile = genImgPath + "/" + fileName;
        FileOutputStream fos = new FileOutputStream(imgFile);
        InputStream is = blob.getInputStream();
        byte[] bytes = new byte[1024];
        int i = -1;
        while ((i = is.read(bytes)) > 0) {
            fos.write(bytes, 0, i);
        }
        is.close();
        fos.close();
    }

    @Override
    public void createItemActionListener(ActionEvent actionEvent) {
        JUIteratorBinding ib =
            FacesUtils.getIteratorBinding(CUSTOMER_ITERATOR);
        ViewObject view = ib.getViewObject();
        CustomersRow row = (CustomersRow)view.createRow();
        row.setCreatedBy("hatv");
        view.insertRow(row);
        view.setCurrentRow(row);
        FacesUtils.showPopup(this.itemPopup);
    }

    @Override
    public String getIteratorName() {
        return CUSTOMER_ITERATOR;
    }
}
