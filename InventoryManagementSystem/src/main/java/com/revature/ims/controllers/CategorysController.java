package com.revature.ims.controllers;

import com.revature.ims.dao.CategorysService;
import com.revature.ims.domain.Categorys;
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
public class CategorysController {

    @Autowired
    CategorysService service;

    @RequestMapping(value ="/viewCategorys", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Categorys>> getCategorys(){
        List<Categorys> list = service.findAll();
        return new ResponseEntity<List<Categorys>>(list, HttpStatus.OK);
    }
}
