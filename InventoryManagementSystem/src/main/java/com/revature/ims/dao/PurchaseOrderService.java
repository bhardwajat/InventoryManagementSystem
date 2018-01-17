package com.revature.ims.dao;

import com.revature.ims.domain.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by socce on 6/28/2017.
 */
@Service
@Transactional
public class PurchaseOrderService {
    @Autowired
    PurchaseOrderDao dao;

    public List<PurchaseOrder> findAll(){
        return (List<PurchaseOrder>) dao.findAll();
    }

    public void save(PurchaseOrder po){dao.save(po);}
}
