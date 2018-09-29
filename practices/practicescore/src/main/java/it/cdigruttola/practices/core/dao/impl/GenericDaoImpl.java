package it.cdigruttola.practices.core.dao.impl;

import it.cdigruttola.practices.core.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Required;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    private SessionFactory sessionFactory;

    public void save(T model) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(model);
        tx.commit();
        closeSession(session);
    }

    public void update(T model) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.merge(model);
        tx.commit();
        closeSession(session);
    }

    public void delete(T model) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.delete(model);
        tx.commit();
        closeSession(session);
    }

    public void refresh(T model) {
        Session session = getSession();
        session.refresh(model);
        closeSession(session);
    }

    public T findByPk(Class<T> clazz, String pk) {
        Session session = getSession();
        T model = (T) session.get(clazz, pk);
        closeSession(session);
        return model;
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
