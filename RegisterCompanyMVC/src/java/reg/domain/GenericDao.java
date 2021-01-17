/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg.domain;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author duncan
 */
public class GenericDao<X> {
    
    public Class<X> type;
    
    public GenericDao(Class<X> type ){
        this.type = type;
    }
    
    public X create(X obj){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(obj);
        ss.getTransaction().commit();
        ss.close();
        return obj;
    }
     public List<X> findAll(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query qry = ss.createQuery("from "+ type.getName());
        List <X> list = qry.list();
        ss.close();
        return list;
    }
     public X findOneById(String id){
         Session ss = HibernateUtil.getSessionFactory().openSession();
         X obj = (X) ss.get(type, id);
         ss.close();
         return obj;
     }
}
