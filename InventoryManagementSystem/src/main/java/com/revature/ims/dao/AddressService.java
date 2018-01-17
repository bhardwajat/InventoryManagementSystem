package com.revature.ims.dao;

import com.revature.ims.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by socce on 7/6/2017.
 */
@Service
@Transactional
public class AddressService {
    @Autowired
    AddressDao dao;

    public List<Address> findAll(){
        return (List<Address>) dao.findAll();
    }


}
