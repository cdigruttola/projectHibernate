package it.cdigruttola.practices.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "activities")
public class ActivityModel extends ItemModel {

    @Column
    private String description;
    @ManyToOne
    @JoinColumn(nullable = false)
    private PracticeModel practice;
    @OneToOne
    private EmployeeModel employee;
    @Column(name = "due_date")
    private Date dueDate;
    @Column(name = "open_date")
    private Date openDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "closure_date")
    private Date closureDate;
    @Column(name = "working_hours")
    private long workingHours;
    @Column
    private long km;
    @OneToMany(mappedBy = "activity")
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
