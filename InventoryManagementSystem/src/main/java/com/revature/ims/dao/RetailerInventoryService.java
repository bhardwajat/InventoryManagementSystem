package com.revature.ims.dao;

import com.revature.ims.domain.RetailerInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by socce on 7/6/2017.
 */
@Service
@Transactional
public class RetailerInventoryService {
    @Autowired
    RetailerInventoryDao dao;

    public List<RetailerInventory> findAll(){
        return (List<RetailerInventory>) dao.findAll();
    }
}

