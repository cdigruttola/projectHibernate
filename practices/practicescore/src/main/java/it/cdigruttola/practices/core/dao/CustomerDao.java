package it.cdigruttola.practices.core.dao;

import it.cdigruttola.practices.model.CustomerModel;

public interface CustomerDao extends GenericDao<CustomerModel> {

    public CustomerModel findByPk(String pk);
}
