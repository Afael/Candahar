/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.SyCity;
import java.util.List;
import interfaces.ISyCity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author 4f43L
 */
public class ModSyCity implements ISyCity{
    
    Session session;
    Transaction transaction;

    @Override
    public void save(SyCity city) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(city);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(SyCity city) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(city);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(SyCity city) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(city);
        transaction.commit();
        session.close();
    }

    @Override
    public List<SyCity> read() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM SyCity");
        List<SyCity> list = query.list();
        return list;
    }

    @Override
    public List<SyCity> findById(String key) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM SyCity WHERE CityName LIKE :CityName");
        query.setString("key", "%"+key+"%");
        List<SyCity> list = query.list();
        return list;
    }
    
}
