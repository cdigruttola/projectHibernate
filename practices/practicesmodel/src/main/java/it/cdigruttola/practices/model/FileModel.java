package it.cdigruttola.practices.model;

public class FileModel {

    private String pk;
    private String name;
    private String url;
    private PracticeModel practice;
    private EmployeeModel employee;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PracticeModel getPractice() {
        return practice;
    }

    public void setPractice(PracticeModel practice) {
        this.practice = practice;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }
}
