package ca.danielvega.hibernatestruts.model.entities;
// Generated 29-Mar-2016 2:41:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * GLocations generated by hbm2java
 */
public class GLocations  implements java.io.Serializable {


     private long locationId;
     private GZones GZones;
     private String streetNumber;
     private String streetName;
     private String appartmentNumber;
     private String otherInformation;
     private String zip;
     private Float latitude;
     private Float longitude;
     private Set PNaturalPersons = new HashSet(0);
     private Set PJuridicalPersons = new HashSet(0);

    public GLocations() {
    }

	
    public GLocations(long locationId) {
        this.locationId = locationId;
    }
    public GLocations(long locationId, GZones GZones, String streetNumber, String streetName, String appartmentNumber, String otherInformation, String zip, Float latitude, Float longitude, Set PNaturalPersons, Set PJuridicalPersons) {
       this.locationId = locationId;
       this.GZones = GZones;
       this.streetNumber = streetNumber;
       this.streetName = streetName;
       this.appartmentNumber = appartmentNumber;
       this.otherInformation = otherInformation;
       this.zip = zip;
       this.latitude = latitude;
       this.longitude = longitude;
       this.PNaturalPersons = PNaturalPersons;
       this.PJuridicalPersons = PJuridicalPersons;
    }
   
    public long getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }
    public GZones getGZones() {
        return this.GZones;
    }
    
    public void setGZones(GZones GZones) {
        this.GZones = GZones;
    }
    public String getStreetNumber() {
        return this.streetNumber;
    }
    
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    public String getStreetName() {
        return this.streetName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getAppartmentNumber() {
        return this.appartmentNumber;
    }
    
    public void setAppartmentNumber(String appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }
    public String getOtherInformation() {
        return this.otherInformation;
    }
    
    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
    public Float getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
    public Float getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }
    public Set getPNaturalPersons() {
        return this.PNaturalPersons;
    }
    
    public void setPNaturalPersons(Set PNaturalPersons) {
        this.PNaturalPersons = PNaturalPersons;
    }
    public Set getPJuridicalPersons() {
        return this.PJuridicalPersons;
    }
    
    public void setPJuridicalPersons(Set PJuridicalPersons) {
        this.PJuridicalPersons = PJuridicalPersons;
    }




}


