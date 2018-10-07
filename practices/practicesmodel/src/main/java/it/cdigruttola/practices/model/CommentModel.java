package it.cdigruttola.practices.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comments")
public class CommentModel extends ItemModel {

    @Column
    private Date date;
    @Column
    private String text;
    @ManyToOne
    @JoinColumn(nullable = false)
    private ActivityModel activity;
    @ManyToOne
    @JoinColumn(nullable = false)
    private EmployeeModel employee;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ActivityModel getActivity() {
        return activity;
    }

    public void setActivity(ActivityModel activity) {
        this.activity = activity;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }
}
