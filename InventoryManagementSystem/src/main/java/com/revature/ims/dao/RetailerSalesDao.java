package com.revature.ims.dao;

import com.revature.ims.domain.RetailerSales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by David Griffith on 6/28/2017.
 */
@Repository
public interface RetailerSalesDao extends CrudRepository<RetailerSales, Long> {
    public List<RetailerSales> getByRetailer(int id);
}
