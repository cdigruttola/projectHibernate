package it.cdigruttola.practices.core.dao.impl;

import it.cdigruttola.practices.core.dao.GenericDao;
import it.cdigruttola.practices.model.ItemModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericDaoImpl<T extends ItemModel> implements GenericDao<T> {

    private SessionFactory sessionFactory;

    public T findByPk(Class<T> clazz, String pk) {
        Session session = getSession();
        T model = (T) session.get(clazz, pk);
        closeSession(session);
        return model;
    }

    public List<T> findAllInstance(Class<T> clazz) {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(clazz);
        Root<T> root = query.from(clazz);
        query.select(root);
        List<T> list = session.createQuery(query).getResultList();
        closeSession(session);
        return list;
    }

    Session getSession() {
        return sessionFactory.openSession();
    }

    void closeSession(Session session) {
        session.close();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Required
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
