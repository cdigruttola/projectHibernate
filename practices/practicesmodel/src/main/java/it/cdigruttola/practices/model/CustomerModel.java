package it.cdigruttola.practices.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class CustomerModel extends ItemModel {

    @Column(name = "id", unique = true, nullable = false)
    private long code;
    @Column
    private String name;
    @Column
    private String surname;
    @Column(unique = true, nullable = false)
    private String mail;
    @Column(name = "tax_code", unique = true, nullable = false)
    private String taxCode;
    @Column(name = "vat_code", unique = true)
    private String vatCode;
    @OneToMany(mappedBy = "customer")
    private Set<PracticeModel> practices;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
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
