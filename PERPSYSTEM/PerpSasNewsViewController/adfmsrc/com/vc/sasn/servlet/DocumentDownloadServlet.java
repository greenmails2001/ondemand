package com.vc.sasn.servlet;


import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;
import com.vc.sasnmodel.views.customize.common.C01DocumentDownloadsRow;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jbo.domain.BlobDomain;


/**
 * // Set the headers.
 * res.setContentType("application/x-download");
 * res.setHeader("Content-Disposition", "attachment; filename=" + filename);
 *
 * // Send the file.
 * OutputStream out = res.getOutputStream(  );
 * returnFile(filename, out);  // Shown earlier in the chapter
 */
public class DocumentDownloadServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "application/x-download";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    /**
     * Tham so ddoId . Chinh la cot DDO_ID trong bang DOCUMENT_DOWNLOADS.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        String ddoIdParam = request.getParameter("ddoId");
        oracle.jbo.domain.Number ddoId = null;
        try {
            Long ddoId2 = Long.parseLong(ddoIdParam.trim());
            ddoId = new oracle.jbo.domain.Number(ddoId2);
        } catch (Exception e) {
            return;
        }


        PerpSasNewsAppModule module =
            SasnFacesUtils.getLocalPerpSasNewsAppModule();


        C01DocumentDownloadsRow row = module.getDocumentDownloadById(ddoId);
        if (row == null) {
            return;
        }

        BlobDomain data = row.getDownloadData();
        if (data != null) {
            response.setContentType(CONTENT_TYPE);
            String filename =
                ((row.getFileName() == null) ? "Document" : row.getFileName()) +
                ((row.getFileType() == null) ? "" : "." + row.getFileType());
            response.setHeader("Content-Disposition",
                               "attachment; filename=" + filename);
            ServletOutputStream out = response.getOutputStream();
            InputStream in = data.getBinaryStream();
            byte[] bytes = new byte[1024];
            int i = 0;
            while ((i = in.read(bytes)) > 0) {
                System.out.println("Byte "+i);
                out.write(bytes, 0, i);
            }
            in.close();
            out.close();
            // Download thanh cong .. tang downloadCount ..
            module.increaseDocumentDownloadCount(ddoId);
        }
    }
}
