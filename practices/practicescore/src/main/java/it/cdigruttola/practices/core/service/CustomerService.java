package it.cdigruttola.practices.core.service;

import it.cdigruttola.practices.model.CustomerModel;

import java.util.List;

public interface CustomerService {

    List<CustomerModel> getAllCustomers();

    CustomerModel getCustomerByMail(String mail);

    CustomerModel getCustomerByCode(String code);

    List<CustomerModel> getCustomersBySurnameOrName(String surname, String name);

    CustomerModel save(CustomerModel customer);

    void deleteByPk(String pk);
}
