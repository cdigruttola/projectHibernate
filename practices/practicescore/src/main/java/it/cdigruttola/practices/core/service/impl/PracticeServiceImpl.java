package it.cdigruttola.practices.core.service.impl;

import it.cdigruttola.practices.core.dao.PracticeDao;
import it.cdigruttola.practices.core.service.PracticeService;
import it.cdigruttola.practices.model.PracticeModel;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class PracticeServiceImpl implements PracticeService {

    private PracticeDao practiceDao;

    public PracticeModel getPracticeByPk(String pk) {
        return practiceDao.findByPk(pk);
    }

    public List<PracticeModel> getAllPractices() {
        return practiceDao.findAllPractices();
    }

    public PracticeDao getPracticeDao() {
        return practiceDao;
    }

    @Required
    public void setPracticeDao(PracticeDao practiceDao) {
        this.practiceDao = practiceDao;
    }
}
