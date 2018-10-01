package it.cdigruttola.practices.core.service;

import it.cdigruttola.practices.model.CustomerModel;

import java.util.List;

public interface CustomerService {

    public CustomerModel getCustomerByPk(String pk);

    public List<CustomerModel> getAllCustomers();
}
