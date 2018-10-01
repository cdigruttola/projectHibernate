package it.cdigruttola.practices.core.dao;

import it.cdigruttola.practices.model.EmployeeModel;

import java.util.List;

public interface EmployeeDao extends GenericDao<EmployeeModel> {

    EmployeeModel findByPk(String pk);

    List<EmployeeModel> getAllEmployees();
}
