package it.cdigruttola.practices.core.dao.impl;

import it.cdigruttola.practices.core.dao.CustomerDao;
import it.cdigruttola.practices.model.CustomerModel;

public class CustomerDaoImpl extends GenericDaoImpl<CustomerModel> implements CustomerDao {

    public CustomerModel findByPk(String pk) {
        return super.findByPk(CustomerModel.class, pk);
    }

}
