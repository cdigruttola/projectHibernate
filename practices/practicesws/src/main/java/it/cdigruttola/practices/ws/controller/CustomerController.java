package it.cdigruttola.practices.ws.controller;

import it.cdigruttola.practices.dto.CustomerDTO;
import it.cdigruttola.practices.facade.CustomerFacade;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "customers")
public class CustomerController {

    @Resource(name = "customerFacade")
    private CustomerFacade customerFacade;

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable String id) {
        return customerFacade.getCustomerById(id);
    }
}