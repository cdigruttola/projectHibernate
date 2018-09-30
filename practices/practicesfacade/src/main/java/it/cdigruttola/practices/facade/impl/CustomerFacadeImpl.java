package it.cdigruttola.practices.facade.impl;

import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.dto.CustomerDTO;
import it.cdigruttola.practices.facade.CustomerFacade;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Required;

public class CustomerFacadeImpl implements CustomerFacade {

    private CustomerService customerService;
    private ModelMapper modelMapper;

    public CustomerDTO getCustomerById(String id) {
        return modelMapper.map(customerService.getCustomerByPk(id), CustomerDTO.class);
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    @Required
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public ModelMapper getModelMapper() {
        return modelMapper;
    }

    @Required
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
