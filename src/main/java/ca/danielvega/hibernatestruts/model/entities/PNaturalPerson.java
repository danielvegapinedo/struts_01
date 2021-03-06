package ca.danielvega.hibernatestruts.model.entities;
// Generated 29-Mar-2016 2:41:01 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PNaturalPerson generated by hbm2java
 */
public class PNaturalPerson  implements java.io.Serializable {


     private long naturalPersonId;
     private GLocations GLocations;
     private String firstName;
     private String lastName;
     private String middleName;
     private Date birthday;
     private Boolean gender;
     private Set PPhoneses = new HashSet(0);
     private Set PEmailses = new HashSet(0);

    public PNaturalPerson() {
    }

	
    public PNaturalPerson(long naturalPersonId, GLocations GLocations, String firstName, String lastName) {
        this.naturalPersonId = naturalPersonId;
        this.GLocations = GLocations;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public PNaturalPerson(long naturalPersonId, GLocations GLocations, String firstName, String lastName, String middleName, Date birthday, Boolean gender, Set PPhoneses, Set PEmailses) {
       this.naturalPersonId = naturalPersonId;
       this.GLocations = GLocations;
       this.firstName = firstName;
       this.lastName = lastName;
       this.middleName = middleName;
       this.birthday = birthday;
       this.gender = gender;
       this.PPhoneses = PPhoneses;
       this.PEmailses = PEmailses;
    }
   
    public long getNaturalPersonId() {
        return this.naturalPersonId;
    }
    
    public void setNaturalPersonId(long naturalPersonId) {
        this.naturalPersonId = naturalPersonId;
    }
    public GLocations getGLocations() {
        return this.GLocations;
    }
    
    public void setGLocations(GLocations GLocations) {
        this.GLocations = GLocations;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Boolean getGender() {
        return this.gender;
    }
    
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public Set getPPhoneses() {
        return this.PPhoneses;
    }
    
    public void setPPhoneses(Set PPhoneses) {
        this.PPhoneses = PPhoneses;
    }
    public Set getPEmailses() {
        return this.PEmailses;
    }
    
    public void setPEmailses(Set PEmailses) {
        this.PEmailses = PEmailses;
    }




}


