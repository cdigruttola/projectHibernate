package it.cdigruttola.practices.facade.impl;

import it.cdigruttola.practices.core.service.CustomerService;
import it.cdigruttola.practices.core.service.ModelService;
import it.cdigruttola.practices.core.service.PracticeService;
import it.cdigruttola.practices.dto.CustomerDTO;
import it.cdigruttola.practices.dto.PracticeDTO;
import it.cdigruttola.practices.facade.CustomerFacade;
import it.cdigruttola.practices.facade.PracticeFacade;
import it.cdigruttola.practices.model.CustomerModel;
import it.cdigruttola.practices.model.PracticeModel;
import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Required;

import java.lang.reflect.Type;
import java.util.List;

public class PracticeFacadeImpl implements PracticeFacade {

    private PracticeService practiceService;
    private ModelMapper modelMapper;
    private ModelService modelService;


    public PracticeDTO getPracticeById(String id) {
        PracticeModel practice = practiceService.getPracticeByPk(id);
        if (practice != null) {
            return modelMapper.map(practice, PracticeDTO.class);
        }
        return null;
    }

    public List<PracticeDTO> getAllPractices() {
        Type targetListType = new TypeToken<List<PracticeDTO>>() {
        }.getType();
        List<PracticeModel> practices = practiceService.getAllPractices();
        if (CollectionUtils.isNotEmpty(practices)) {
            return modelMapper.map(practices, targetListType);
        }
        return null;
    }

    public boolean createPractice(PracticeDTO practice) {
        if (practice != null) {
            PracticeModel practiceModel = modelMapper.map(practice, PracticeModel.class);
            modelService.save(practiceModel);
            return true;
        }
        return false;
    }

    public PracticeService getPracticeService() {
        return practiceService;
    }

    @Required
    public void setPracticeService(PracticeService practiceService) {
        this.practiceService = practiceService;
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
