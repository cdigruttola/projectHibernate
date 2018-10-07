package it.cdigruttola.practices.model;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class FileModel extends ItemModel {

    @Column
    private String name;
    @Column
    private String url;
    @OneToOne
    @MapsId
    private PracticeModel practice;
    @OneToOne
    @MapsId
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
