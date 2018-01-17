package com.revature.ims.dao;

import com.revature.ims.domain.Retailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by David Griffith on 6/28/2017.
 */
@Repository
public interface RetailerDao extends CrudRepository<Retailer, Long> {
}
