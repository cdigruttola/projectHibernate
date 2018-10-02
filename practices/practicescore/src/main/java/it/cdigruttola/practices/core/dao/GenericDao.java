package it.cdigruttola.practices.core.dao;

import it.cdigruttola.practices.model.ItemModel;

import java.util.List;

public interface GenericDao<T extends ItemModel> {

    public T findByPk(Class<T> clazz, String pk);

    public List<T> findAllInstance(Class<T> clazz);
}
