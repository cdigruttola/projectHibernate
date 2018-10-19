package it.cdigruttola.practices.ws.controller;

import it.cdigruttola.practices.facade.dto.CustomerDTO;
import it.cdigruttola.practices.facade.CustomerFacade;
import it.cdigruttola.practices.facade.dto.ErrorDTO;
import it.cdigruttola.practices.ws.form.CustomerForm;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping(value = "customers")
public class CustomerController {

    @Autowired
    private CustomerFacade customerFacade;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getAllCustomers() {
        return customerFacade.getAllCustomers();
    }

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable String id) {
        return customerFacade.getCustomerById(id);
    }

    @RequestMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createCustomer(@RequestBody @Valid CustomerForm customerForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Type targetListType = new TypeToken<List<ErrorDTO>>() {
            }.getType();
            List<ErrorDTO> errors = modelMapper.map(bindingResult.getFieldErrors(), targetListType);
            return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
        }
        CustomerDTO customerDTO = modelMapper.map(customerForm, CustomerDTO.class);
        if (customerFacade.createOrUpdateCustomer(customerDTO)) {
            return null;
        }
        return null;
    }

    @RequestMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> updateCustomer(@RequestBody @Valid CustomerForm customerForm, BindingResult bindingResult) {
        return createCustomer(customerForm, bindingResult);
    }

}