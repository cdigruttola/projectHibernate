package it.cdigruttola.practices.facade.impl;

import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.core.service.ModelService;
import it.cdigruttola.practices.dto.CustomerDTO;
import it.cdigruttola.practices.facade.CustomerFacade;
import it.cdigruttola.practices.model.CustomerModel;
import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Required;

import java.lang.reflect.Type;
import java.util.List;

public class CustomerFacadeImpl implements CustomerFacade {

    private CustomerService customerService;
    private ModelMapper modelMapper;
    private ModelService modelService;

    public CustomerDTO getCustomerById(String id) {
        CustomerModel customer = customerService.getCustomerByPk(id);
        if (customer != null) {
            return modelMapper.map(customer, CustomerDTO.class);
        }
        return null;
    }

    public List<CustomerDTO> getAllCustomers() {
        Type targetListType = new TypeToken<List<CustomerDTO>>() {
        }.getType();
        List<CustomerModel> customers = customerService.getAllCustomers();
        if (CollectionUtils.isNotEmpty(customers)) {
            return modelMapper.map(customers, targetListType);
        }
        return null;
    }

    public boolean createCustomer(CustomerDTO customer) {
        if (customer != null) {
            CustomerModel customerModel = modelMapper.map(customer, CustomerModel.class);
            modelService.save(customerModel);
            return true;
        }
        return false;
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

    public ModelService getModelService() {
        return modelService;
    }

    @Required
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
