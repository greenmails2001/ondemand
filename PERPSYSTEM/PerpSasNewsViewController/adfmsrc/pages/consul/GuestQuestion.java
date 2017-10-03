package pages.consul;


import com.oracle.adffwkextensions.faces.FacesUtils;

import com.vc.sasn.utils.SasnFacesUtils;
import com.vc.sasnmodel.common.PerpSasNewsAppModule;

import java.io.Serializable;

import java.sql.SQLException;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;

import oracle.jbo.domain.Number;


public class GuestQuestion implements Serializable {

    private String title;
    private String content;
    private String guestEmail;
    private String guestTelephone;
    private oracle.jbo.domain.Number agrId;

    private RichPanelFormLayout questionForm;

    public GuestQuestion() {
        super();
    }

    private String trimString(String s) {
        s = (s == null) ? null : s.trim();
        if (s == null || s.equals("")) {
            return null;
        }
        return s;
    }

    public void setTitle(String title) {
        this.title = trimString(title);
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = trimString(content);
    }

    public String getContent() {
        return content;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = trimString(guestEmail);
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestTelephone(String guestTelephone) {
        this.guestTelephone = trimString(guestTelephone);
    }

    public String getGuestTelephone() {
        return guestTelephone;
    }

    public Number getAgrId() {
        return agrId;
    }

    public void setQuestionForm(RichPanelFormLayout questionForm) {
        this.questionForm = questionForm;
    }

    public RichPanelFormLayout getQuestionForm() {
        return questionForm;
    }

    private void reset() {
        this.title = null;
        this.content = null;
        this.agrId = null;
        this.guestEmail = null;
        this.guestTelephone = null;
    }


    public void createGuestQuestionActionListener(ActionEvent e) {
        this.agrId = (Number)FacesUtils.resolveExpression("${bindings.agrId}");
        // Kiem tra cac gia tri bat buoc.
        if (this.title == null || this.content == null || this.agrId == null ||
            this.guestEmail == null || this.guestTelephone == null) {
            FacesUtils.addError("Error", "Cac thong tin co dau * la bat buoc");
            return;
        }
        PerpSasNewsAppModule module = SasnFacesUtils.getPerpSasNewsAppModule();
        
        module.createGuestQuestion(title, content, agrId, guestEmail,
                                   guestTelephone);
        FacesUtils.addMessage("Message",
                              "Cau hoi cua ban da duoc gui thanh cong");
        // Reset form .
        this.reset();
        FacesUtils.addPartialTarget(this.questionForm);

    }


}
