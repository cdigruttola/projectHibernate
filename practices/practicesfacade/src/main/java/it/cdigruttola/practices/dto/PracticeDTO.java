package it.cdigruttola.practices.dto;

import it.cdigruttola.practices.enumeration.State;
import it.cdigruttola.practices.enumeration.Type;

import java.sql.Date;
import java.util.Set;

public class PracticeDTO {

    private String pk;
    private String id;
    private String object;
    private Date dueDate;
    private Date openDate;
    private Date closureDate;
    private String sospension;
    private CustomerDTO customer;
    private EmployeeDTO employee;
    private State state;
    private Type type;
    private Set<ActivityDTO> activities;
    private Set<FileDTO> files;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

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

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
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

    public Set<ActivityDTO> getActivities() {
        return activities;
    }

    public void setActivities(Set<ActivityDTO> activities) {
        this.activities = activities;
    }

    public Set<FileDTO> getFiles() {
        return files;
    }

    public void setFiles(Set<FileDTO> files) {
        this.files = files;
    }
}
