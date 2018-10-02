package it.cdigruttola.practices.facade;

import it.cdigruttola.practices.dto.PracticeDTO;

import java.util.List;

public interface PracticeFacade {

    public PracticeDTO getPracticeById(String id);

    public List<PracticeDTO> getAllPractices();

    public boolean createPractice(PracticeDTO practice);
}
