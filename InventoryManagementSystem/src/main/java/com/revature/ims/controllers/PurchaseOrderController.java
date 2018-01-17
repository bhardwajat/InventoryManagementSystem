package com.revature.ims.controllers;

import com.revature.ims.dao.PurchaseOrderService;
import com.revature.ims.domain.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by socce on 6/28/2017.
 */
@RestController
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderService service;

    @RequestMapping(value ="/viewPurchaseOrder", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PurchaseOrder>> getPurchaseOrder(){
        List<PurchaseOrder> list = service.findAll();
        return new ResponseEntity<List<PurchaseOrder>>(list, HttpStatus.OK);
    }

//    @RequestMapping(value = "/createPurchaseOrder", method = RequestMethod.POST, produces = "text/plain")
//    public void submit(){
//        PurchaseOrder po = null;
//        service.save(po);
//    }
}
