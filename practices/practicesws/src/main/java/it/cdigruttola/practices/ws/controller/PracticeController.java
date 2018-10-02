package it.cdigruttola.practices.ws.controller;

import it.cdigruttola.practices.dto.CustomerDTO;
import it.cdigruttola.practices.dto.PracticeDTO;
import it.cdigruttola.practices.facade.CustomerFacade;
import it.cdigruttola.practices.facade.PracticeFacade;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "practices")
public class PracticeController {

    @Resource(name = "practiceFacade")
    private PracticeFacade practiceFacade;

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PracticeDTO> getAllPractices() {
        return practiceFacade.getAllPractices();
    }

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PracticeDTO getCustomer(@PathVariable String id) {
        return practiceFacade.getPracticeById(id);
    }

    @RequestMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public PracticeDTO createPractice(@RequestBody PracticeDTO practiceDTO) {
        if (practiceFacade.createPractice(practiceDTO)) {
            return practiceDTO;
        }
        return null;
    }
}