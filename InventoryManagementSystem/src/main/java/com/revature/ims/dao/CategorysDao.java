package com.revature.ims.dao;

import com.revature.ims.domain.Categorys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by David Griffith on 6/28/2017.
 */
@Repository
public interface CategorysDao extends CrudRepository<Categorys, Long> {
}
