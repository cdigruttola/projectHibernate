package it.cdigruttola.practices.core.service.impl;

import it.cdigruttola.practices.core.repository.CustomerRepository;
import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Component(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerModel getCustomerByPk(String pk) {
        Optional<CustomerModel> customers = customerRepository.findById(pk);
        if (customers.isPresent()) {
            return customers.get();
        } else {
            throw new EntityNotFoundException("it.cdigruttola.practices.ws.EntityNotFoundException.message");
        }
    }

    public List<CustomerModel> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerModel save(CustomerModel customer) {
        return customerRepository.save(customer);
    }
}
