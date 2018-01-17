package com.revature.ims.controllers;

import com.revature.ims.dao.SupplierService;
import com.revature.ims.domain.Supplier;
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
public class SupplierController {

    @Autowired
    SupplierService service;

    @RequestMapping(value ="/viewSupplier", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Supplier>> getSupplier(){
        List<Supplier> list = service.findAll();
        return new ResponseEntity<List<Supplier>>(list, HttpStatus.OK);
    }
}
