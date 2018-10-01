package it.cdigruttola.practices.core.dao;

import it.cdigruttola.practices.model.CustomerModel;

import java.util.List;

public interface CustomerDao extends GenericDao<CustomerModel> {

    public CustomerModel findByPk(String pk);

    List<CustomerModel> getAllCustomers();
}
