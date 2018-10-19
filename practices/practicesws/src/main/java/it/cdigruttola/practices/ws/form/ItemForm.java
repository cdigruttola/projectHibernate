package it.cdigruttola.practices.ws.form;

import it.cdigruttola.practices.ws.constraint.TaxCode;
import it.cdigruttola.practices.ws.constraint.VatCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ItemForm {

    private String pk;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }
}
