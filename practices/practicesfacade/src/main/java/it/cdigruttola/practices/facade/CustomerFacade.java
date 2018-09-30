package it.cdigruttola.practices.facade;

import it.cdigruttola.practices.dto.CustomerDTO;

public interface CustomerFacade {

    public CustomerDTO getCustomerById(String id);
}
