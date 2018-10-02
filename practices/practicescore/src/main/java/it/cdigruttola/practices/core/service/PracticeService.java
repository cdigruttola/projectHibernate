package it.cdigruttola.practices.core.service;

import it.cdigruttola.practices.model.PracticeModel;

import java.util.List;

public interface PracticeService {

    public PracticeModel getPracticeByPk(String pk);

    public List<PracticeModel> getAllPractices();
}
