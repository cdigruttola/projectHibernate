package it.cdigruttola.practices.ws.form;

import it.cdigruttola.practices.ws.constraint.TaxCode;
import it.cdigruttola.practices.ws.constraint.VatCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerForm {

    private String pk;

    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    @Email
    private String mail;

    @NotBlank
    @Size(min = 16, max = 16)
    @Pattern(regexp = "^[A-Za-z]{6}[0-9]{2}[A-Za-z][0-9]{2}[A-Za-z][0-9]{3}[A-Za-z]$")
    @TaxCode
    private String taxCode;

    @Size(min = 11, max = 11)
    @Pattern(regexp = "^[0-9]{11}$")
    @VatCode
    private String vatCode;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

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
}
