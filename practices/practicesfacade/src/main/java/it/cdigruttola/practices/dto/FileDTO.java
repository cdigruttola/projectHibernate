package it.cdigruttola.practices.dto;

public class FileDTO extends ItemDTO {

    private String name;
    private String url;
    private PracticeDTO practice;
    private EmployeeDTO employee;

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

    public PracticeDTO getPractice() {
        return practice;
    }

    public void setPractice(PracticeDTO practice) {
        this.practice = practice;
    }

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }
}
