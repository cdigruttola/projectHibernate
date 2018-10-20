package it.cdigruttola.practices.facade.impl;

import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.facade.dto.CustomerDTO;
import it.cdigruttola.practices.facade.CustomerFacade;
import it.cdigruttola.practices.model.CustomerModel;
import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;

@Component(value = "customerFacade")
public class CustomerFacadeImpl implements CustomerFacade {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private ModelMapper modelMapper;

    public List<CustomerDTO> getAllCustomers() {
        Type targetListType = new TypeToken<List<CustomerDTO>>() {
        }.getType();
        List<CustomerModel> customers = customerService.getAllCustomers();
        if (CollectionUtils.isNotEmpty(customers)) {
            return modelMapper.map(customers, targetListType);
        }
        return null;
    }

    public CustomerDTO getCustomerByMail(String mail) {
        CustomerModel customer = customerService.getCustomerByMail(mail);
        if (customer != null) {
            return modelMapper.map(customer, CustomerDTO.class);
        }
        return null;
    }

    public boolean createOrUpdateCustomer(CustomerDTO customer) {
        if (customer != null) {
            CustomerModel customerModel = modelMapper.map(customer, CustomerModel.class);
            customerService.save(customerModel);
            return true;
        }
        return false;
    }

    @Override
    public void delete(String pk) {
        customerService.deleteByPk(pk);
    }
}
