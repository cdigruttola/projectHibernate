package it.cdigruttola.practices.core.service.impl;

import it.cdigruttola.practices.core.repository.CustomerRepository;
import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.model.CustomerModel;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Component(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerModel> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerModel getCustomerByMail(String mail) {
        List<CustomerModel> customers = customerRepository.findByMail(mail);
        if (CollectionUtils.isNotEmpty(customers)) {
            return customers.get(0);
        } else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public CustomerModel save(CustomerModel customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteByPk(String pk) {
        customerRepository.deleteById(pk);
    }
}
