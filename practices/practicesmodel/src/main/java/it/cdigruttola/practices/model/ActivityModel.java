package it.cdigruttola.practices.model;

import java.sql.Date;
import java.util.Set;

public class ActivityModel extends ItemModel {

    private String description;
    private PracticeModel practice;
    private EmployeeModel employee;
    private Date dueDate;
    private Date openDate;
    private Date endDate;
    private Date closureDate;
    private long workingHours;
    private long km;
    private Set<CommentModel> comments;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(Date closureDate) {
        this.closureDate = closureDate;
    }

    public long getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(long workingHours) {
        this.workingHours = workingHours;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public Set<CommentModel> getComments() {
        return comments;
    }

    public void setComments(Set<CommentModel> comments) {
        this.comments = comments;
    }
}
