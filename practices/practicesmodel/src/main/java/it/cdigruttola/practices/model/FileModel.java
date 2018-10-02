package it.cdigruttola.practices.model;

public class FileModel extends ItemModel {

    private String name;
    private String url;
    private PracticeModel practice;
    private EmployeeModel employee;

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
