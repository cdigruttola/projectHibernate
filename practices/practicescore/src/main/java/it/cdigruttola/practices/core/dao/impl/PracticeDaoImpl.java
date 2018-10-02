package it.cdigruttola.practices.core.dao.impl;

import it.cdigruttola.practices.core.dao.PracticeDao;
import it.cdigruttola.practices.model.PracticeModel;

import java.util.List;

public class PracticeDaoImpl extends GenericDaoImpl<PracticeModel> implements PracticeDao {

    public PracticeModel findByPk(String pk) {
        return super.findByPk(PracticeModel.class, pk);
    }

    public List<PracticeModel> findAllPractices() {
        return super.findAllInstance(PracticeModel.class);
    }
}
