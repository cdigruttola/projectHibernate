package it.cdigruttola.practices.core.dao.impl;

import it.cdigruttola.practices.core.dao.EmployeeDao;
import it.cdigruttola.practices.model.EmployeeModel;

import java.util.List;

public class EmployeeDaoImpl extends GenericDaoImpl<EmployeeModel> implements EmployeeDao {

    public EmployeeModel findByPk(String pk) {
        return super.findByPk(EmployeeModel.class, pk);
    }

    public List<EmployeeModel> getAllEmployees() {
        return super.getAllInstance(EmployeeModel.class);
    }
}
