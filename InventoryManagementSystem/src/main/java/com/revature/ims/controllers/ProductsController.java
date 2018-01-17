package com.revature.ims.controllers;

import com.revature.ims.dao.ProductsService;
import com.revature.ims.domain.Products;
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
public class ProductsController {

    @Autowired
    ProductsService service;

    @RequestMapping(value ="/viewProducts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Products>> getProducts(){
        List<Products> list = service.findAll();
        return new ResponseEntity<List<Products>>(list, HttpStatus.OK);
    }
}
