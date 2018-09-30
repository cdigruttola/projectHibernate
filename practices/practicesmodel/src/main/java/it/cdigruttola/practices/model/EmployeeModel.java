package it.cdigruttola.practices.model;

import java.util.Set;

public class EmployeeModel {

    private String pk;
    private String name;
    private String surname;
    private String mail;
    private boolean admin;
    private Set<PracticeModel> practices;
    private Set<ActivityModel> activities;
    private Set<CommentModel> comments;
    private Set<FileModel> files;

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

    public Set<PracticeModel> getPractices() {
        return practices;
    }

    public void setPractices(Set<PracticeModel> practices) {
        this.practices = practices;
    }

    public Set<ActivityModel> getActivities() {
        return activities;
    }

    public void setActivities(Set<ActivityModel> activities) {
        this.activities = activities;
    }

    public Set<CommentModel> getComments() {
        return comments;
    }

    public void setComments(Set<CommentModel> comments) {
        this.comments = comments;
    }

    public Set<FileModel> getFiles() {
        return files;
    }

    public void setFiles(Set<FileModel> files) {
        this.files = files;
    }
}
