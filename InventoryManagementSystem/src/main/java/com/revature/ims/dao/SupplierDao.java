package com.revature.ims.dao;

import com.revature.ims.domain.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by David Griffith on 6/28/2017.
 */
@Repository
public interface SupplierDao extends CrudRepository<Supplier, Long> {
}
