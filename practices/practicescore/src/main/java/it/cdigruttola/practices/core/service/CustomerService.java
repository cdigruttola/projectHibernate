package it.cdigruttola.practices.core.service;

import it.cdigruttola.practices.model.CustomerModel;

import java.util.List;

public interface CustomerService {

    List<CustomerModel> getAllCustomers();

    CustomerModel getCustomerByMail(String mail);

    CustomerModel save(CustomerModel customer);

    void deleteByPk(String pk);
}
