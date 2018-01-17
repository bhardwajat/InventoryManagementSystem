package com.revature.ims.dao;

import com.revature.ims.domain.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by socce on 6/28/2017.
 */
@Service
@Transactional
public class SupplierService {
    @Autowired
    SupplierDao dao;

    public List<Supplier> findAll(){
        return (List<Supplier>) dao.findAll();
    }
}
