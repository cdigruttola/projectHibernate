package it.cdigruttola.practices.core.service;

import it.cdigruttola.practices.model.CustomerModel;

public interface CustomerService {

    public CustomerModel getCustomerByPk(String pk);
}
