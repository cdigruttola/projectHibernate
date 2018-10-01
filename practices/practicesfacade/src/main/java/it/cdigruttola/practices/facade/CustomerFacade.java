package it.cdigruttola.practices.facade;

import it.cdigruttola.practices.dto.CustomerDTO;

import java.util.List;

public interface CustomerFacade {

    public CustomerDTO getCustomerById(String id);

    public List<CustomerDTO> getAllCustomers();
}
