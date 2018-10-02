package it.cdigruttola.practices.core.dao;

import it.cdigruttola.practices.model.PracticeModel;

import java.util.List;

public interface PracticeDao extends GenericDao<PracticeModel> {

    public PracticeModel findByPk(String pk);

    List<PracticeModel> findAllPractices();
}
