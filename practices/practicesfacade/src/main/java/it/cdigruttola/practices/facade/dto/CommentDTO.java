package it.cdigruttola.practices.facade.dto;

import java.sql.Date;

public class CommentDTO extends ItemDTO {

    private Date date;
    private String text;
    private EmployeeDTO employee;

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

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }
}
