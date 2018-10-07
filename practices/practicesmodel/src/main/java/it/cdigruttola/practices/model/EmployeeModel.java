package it.cdigruttola.practices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "employees")
public class EmployeeModel extends ItemModel {

    @Column
    private String name;
    @Column
    private String surname;
    @Column(unique = true, nullable = true)
    private String mail;
    @Column
    private boolean admin;
    @OneToMany(mappedBy = "employee")
    private Set<PracticeModel> practices;

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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Set<PracticeModel> getPractices() {
        return practices;
    }

    public void setPractices(Set<PracticeModel> practices) {
        this.practices = practices;
    }

}
