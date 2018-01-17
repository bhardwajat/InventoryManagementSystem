package com.revature.ims.dao;

import com.revature.ims.domain.PurchaseOrderLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by socce on 7/6/2017.
 */
@Repository
public interface PurchaseOrderLineDao extends CrudRepository<PurchaseOrderLine, Long> {
}
