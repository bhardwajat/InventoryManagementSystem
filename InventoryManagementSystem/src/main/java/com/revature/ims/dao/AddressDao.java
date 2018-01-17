package com.revature.ims.dao;

import com.revature.ims.domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by socce on 7/6/2017.
 */
@Repository
public interface AddressDao extends CrudRepository<Address, Long> {
}
