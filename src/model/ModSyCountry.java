/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.SyCountry;
import interfaces.ISyCountry;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author 4f43L
 */
public class ModSyCountry implements ISyCountry {

    Session session;
    Transaction transaction;

    @Override
    public void save(SyCountry country) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(country);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(SyCountry country) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(country);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(SyCountry country) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(country);
        transaction.commit();
        session.close();
    }

    @Override
    public List<SyCountry> read() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM SyCountry");
        List<SyCountry> list = query.list();
        return list;
    }

    @Override
    public List<SyCountry> findById(String key) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM SyCountry WHERE CountryName LIKE :CountryName");
        query.setString("key", "%"+key+"%");
        List<SyCountry> list = query.list();
        return list;
    }

}
