package com.revature.ims.controllers;

import com.revature.ims.dao.RetailerSalesService;
import com.revature.ims.domain.RetailerSales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by socce on 6/28/2017.
 */
@RestController
public class RetailerSalesController {

    @Autowired
    RetailerSalesService service;

    @RequestMapping(value ="/viewRetailerSales", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RetailerSales>> getRetailerSales(){
        List<RetailerSales> list = service.findAll();
        return new ResponseEntity<List<RetailerSales>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/getSalesByRetailer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RetailerSales>> getRetailerSalesByRetailer(@PathVariable int id){
        List<RetailerSales> list = service.findByRetailer(id);
        return new ResponseEntity<List<RetailerSales>>(list, HttpStatus.OK);
    }
}
