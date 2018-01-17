package com.revature.ims.dao;

import com.revature.ims.domain.Categorys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

/**
 * Created by socce on 6/28/2017.
 */
@Service
@Transactional
public class CategorysService {
    @Autowired
    CategorysDao dao;

    public List<Categorys> findAll(){
        return (List<Categorys>) dao.findAll();
    }

}
