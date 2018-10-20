package it.cdigruttola.practices.ws.controller;

import it.cdigruttola.practices.facade.CustomerFacade;
import it.cdigruttola.practices.facade.dto.CustomerDTO;
import it.cdigruttola.practices.facade.dto.ErrorDTO;
import it.cdigruttola.practices.ws.form.CustomerForm;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getAllCustomers() {
        return customerFacade.getAllCustomers();
    }

    @GetMapping(value = "/{mail}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomerByMail(@PathVariable String mail) {
        return customerFacade.getCustomerByMail(mail);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends Object> createCustomer(@RequestBody @Valid CustomerForm customerForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Type targetListType = new TypeToken<List<ErrorDTO>>() {
            }.getType();
            List<ErrorDTO> errors = modelMapper.map(bindingResult.getFieldErrors(), targetListType);
            return new ResponseEntity<List<ErrorDTO>>(errors, HttpStatus.BAD_REQUEST);
        }
        CustomerDTO customerDTO = modelMapper.map(customerForm, CustomerDTO.class);
        if (customerFacade.createOrUpdateCustomer(customerDTO)) {
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends Object> updateCustomer(@RequestBody @Valid CustomerForm customerForm, BindingResult bindingResult) {
        return createCustomer(customerForm, bindingResult);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends Object> deleteCustomer(@PathVariable String id) {
        customerFacade.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}