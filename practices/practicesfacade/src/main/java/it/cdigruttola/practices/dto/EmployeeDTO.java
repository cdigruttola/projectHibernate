package it.cdigruttola.practices.dto;

import java.util.Set;

public class EmployeeDTO {

    private String pk;
    private String name;
    private String surname;
    private String mail;
    private boolean admin;
    private Set<PracticeDTO> practices;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Set<PracticeDTO> getPractices() {
        return practices;
    }

    public void setPractices(Set<PracticeDTO> practices) {
        this.practices = practices;
    }

}
