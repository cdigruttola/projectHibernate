package it.cdigruttola.practices.model;

import it.cdigruttola.practices.enumeration.State;
import it.cdigruttola.practices.enumeration.Type;

import java.sql.Date;
import java.util.Set;

public class PracticeModel extends ItemModel {

    private String id;
    private String object;
    private Date dueDate;
    private Date openDate;
    private Date closureDate;
    private String sospension;
    private CustomerModel customer;
    private EmployeeModel employee;
    private State state;
    private Type type;
    private Set<ActivityModel> activities;
    private Set<FileModel> files;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
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

    public Date getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(Date closureDate) {
        this.closureDate = closureDate;
    }

    public String getSospension() {
        return sospension;
    }

    public void setSospension(String sospension) {
        this.sospension = sospension;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<ActivityModel> getActivities() {
        return activities;
    }

    public void setActivities(Set<ActivityModel> activities) {
        this.activities = activities;
    }

    public Set<FileModel> getFiles() {
        return files;
    }

    public void setFiles(Set<FileModel> files) {
        this.files = files;
    }
}
