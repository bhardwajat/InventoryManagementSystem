package com.revature.ims.dao;

import com.revature.ims.domain.RetailerSales;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by socce on 6/28/2017.
 */
@Service
@Transactional
public class RetailerSalesService {
    @Autowired
    RetailerSalesDao dao;

    public List<RetailerSales> findAll(){
        return (List<RetailerSales>) dao.findAll();
    }

    public List<RetailerSales> findByRetailer(int id){
        Session s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        String sql = "SELECT * FROM RETAILER_SALE WHERE RS_RETAILER = :id";
        SQLQuery query = s.createSQLQuery(sql);
        query.addEntity(RetailerSales.class);
        query.setParameter("id", id);
        List result = query.list();
        List<RetailerSales> ret = new ArrayList<RetailerSales>();
        for (int i = 0; i < result.size(); i++){
            ret.add((RetailerSales) result.get(i));
        }
        s.close();
        return ret;
    }
}
