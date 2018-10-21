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
        Optional<CustomerModel> customers = customerRepository.findByMail(mail);
        if (customers.isPresent()) {
            return customers.get();
        } else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public CustomerModel getCustomerByCode(String code) {
        long codeLong;
        try {
            codeLong = Long.valueOf(code);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
        Optional<CustomerModel> customers = customerRepository.findByCode(codeLong);
        if (customers.isPresent()) {
            return customers.get();
        } else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public List<CustomerModel> getCustomersBySurnameOrName(String surname, String name) {
        List<CustomerModel> customers = customerRepository.findBySurnameOrName(surname, name);
        if (CollectionUtils.isNotEmpty(customers)) {
            return customers;
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
