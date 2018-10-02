package it.cdigruttola.practices.core.service.impl;

import it.cdigruttola.practices.core.dao.CustomerDao;
import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.model.CustomerModel;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public CustomerModel getCustomerByPk(String pk) {
        return customerDao.findByPk(pk);
    }

    public List<CustomerModel> getAllCustomers() {
        return customerDao.findAllCustomers();
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    @Required
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
