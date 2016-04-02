package ca.danielvega.hibernatestruts.email.controller;

import ca.danielvega.hibernatestruts.model.entities.PEmailTypes;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import ca.danielvega.hibernatestruts.model.dao.EmailDao;
import ca.danielvega.hibernatestruts.model.dao.EmailDaoImpl;

public class EmailTypesController extends ActionSupport {

    private static final long serialVersionUID = -6239703166715154765L;
    private List<PEmailTypes> emailTypesList = new ArrayList<>();

    private EmailDao ed = new EmailDaoImpl();
    private PEmailTypes et = new PEmailTypes();

    public String listEmailTypes() throws Exception {
        this.emailTypesList = this.ed.listTypes();
        return SUCCESS;
    }

    public String createEmailTypes() {

        this.ed.saveType(this.et);
        this.emailTypesList = this.ed.listTypes();
        this.et = new PEmailTypes();

        return SUCCESS;
    }
    


    public String updateEmailTypes() {

        this.ed.updateType(this.et);
        this.emailTypesList = this.ed.listTypes();
        this.et = new PEmailTypes();

        return SUCCESS;
    }

    public String deleteEmailTypes() {

        this.ed.deleteType(et.getEmailType());
        this.emailTypesList = this.ed.listTypes();
        this.et = new PEmailTypes();

        return SUCCESS;
    }

//    public EmailDao getEd() {
//        return ed;
//    }
//
//    public void setEd(EmailDao ed) {
//        this.ed = ed;
//    }

    public PEmailTypes getEt() {
        return et;
    }

    public void setEt(PEmailTypes et) {
        this.et = et;
    }

    public List<PEmailTypes> getEmailTypesList() {
        return emailTypesList;
    }

    public void setEmailTypesList(List<PEmailTypes> emailTypesList) {
        this.emailTypesList = emailTypesList;
    }



}
