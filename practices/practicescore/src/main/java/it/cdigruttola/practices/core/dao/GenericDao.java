package it.cdigruttola.practices.core.dao;

import java.util.List;

public interface GenericDao<T> {

    public void save(T model);

    public void update(T model);

    public void delete(T model);

    public void refresh(T model);

    public T findByPk(Class<T> clazz, String pk);

    public List<T> getAllInstance(Class<T> clazz);
}
