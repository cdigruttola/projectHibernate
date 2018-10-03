package it.cdigruttola.practices.model;

import java.util.Set;

public class CustomerModel extends ItemModel {

    private long id;
    private String name;
    private String surname;
    private String mail;
    private String taxCode;
    private String vatCode;
    private Set<PracticeModel> practices;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public Set<PracticeModel> getPractices() {
        return practices;
    }

    public void setPractices(Set<PracticeModel> practices) {
        this.practices = practices;
    }
}
