package it.cdigruttola.practices.core.service;

import it.cdigruttola.practices.model.ItemModel;

public interface ModelService<T extends ItemModel> {

    public void save(T model);

    public void update(T model);

    public void delete(T model);

    public void refresh(T model);

    public void persist(T model);
}
