package it.cdigruttola.practices.facade;

import it.cdigruttola.practices.facade.dto.CustomerDTO;

import java.util.List;

public interface CustomerFacade {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerByMail(String mail);

    CustomerDTO getCustomerByCode(String code);

    List<CustomerDTO> getCustomersBySurnameOrName(String surname, String name);

    boolean createOrUpdateCustomer(CustomerDTO customer);

    void delete(String pk);
}
