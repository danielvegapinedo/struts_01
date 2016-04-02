package ca.danielvega.hibernatestruts.model.entities;
// Generated 29-Mar-2016 2:41:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PEmailTypes generated by hbm2java
 */
public class PEmailTypes  implements java.io.Serializable {


     private String emailType;
     private String description;
     private Set PEmailses = new HashSet(0);

    public PEmailTypes() {
    }

	
    public PEmailTypes(String emailType, String description) {
        this.emailType = emailType;
        this.description = description;
    }
    public PEmailTypes(String emailType, String description, Set PEmailses) {
       this.emailType = emailType;
       this.description = description;
       this.PEmailses = PEmailses;
    }
   
    public String getEmailType() {
        return this.emailType;
    }
    
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getPEmailses() {
        return this.PEmailses;
    }
    
    public void setPEmailses(Set PEmailses) {
        this.PEmailses = PEmailses;
    }




}


