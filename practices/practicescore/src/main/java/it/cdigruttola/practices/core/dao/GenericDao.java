package it.cdigruttola.practices.core.dao;

public interface GenericDao<T> {

    public void save(T model);

    public void update(T model);

    public void delete(T model);

    public void refresh(T model);

    public T findByPk(Class<T> clazz, String pk);
}
