/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.SyState;
import interfaces.ISyState;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author 4f43L
 */
public class ModSyState implements ISyState {

    Session session;
    Transaction transaction;

    @Override
    public void save(SyState state) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(state);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(SyState state) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(state);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(SyState state) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(state);
        transaction.commit();
        session.close();
    }

    @Override
    public List<SyState> read() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM SyState");
        List<SyState> list = query.list();
        return list;
    }

    @Override
    public List<SyState> findById(String key) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM SyState WHERE StateName LIKE :StateName");
        query.setString("key", "%"+key+"%");
        List<SyState> list = query.list();
        return list;
    }

}
