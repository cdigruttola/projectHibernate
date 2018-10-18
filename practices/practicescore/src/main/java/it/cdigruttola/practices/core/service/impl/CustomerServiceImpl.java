package it.cdigruttola.practices.core.service.impl;

import it.cdigruttola.practices.core.repository.CustomerRepository;
import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerModel getCustomerByPk(String pk) {
        return customerRepository.findById(pk).get();
    }

    public List<CustomerModel> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerModel save(CustomerModel customer) {
        return customerRepository.save(customer);
    }
}
