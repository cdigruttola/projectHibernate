package it.cdigruttola.practices.facade;

import it.cdigruttola.practices.dto.CustomerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CustomerFacade {

    public CustomerDTO getCustomerById(String id);

    public List<CustomerDTO> getAllCustomers();

    public boolean createCustomer(CustomerDTO customer);
}
