package it.cdigruttola.practices.core.service.impl;

import it.cdigruttola.practices.core.service.ModelService;
import it.cdigruttola.practices.model.ItemModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Required;

public class ModelServiceImpl<T extends ItemModel> implements ModelService<T> {

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

    public void persist(T model) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.persist(model);
        tx.commit();
        closeSession(session);
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
