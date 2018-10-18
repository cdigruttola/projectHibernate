package it.cdigruttola.practices.model;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDHexGenerator")
    private String pk;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }
}
