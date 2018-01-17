package com.revature.ims.SupplierTest;

import com.revature.ims.dao.SupplierService;

import com.revature.ims.domain.Address;
import com.revature.ims.domain.Supplier;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by akshat on 6/28/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SupplierTest {

    private static SupplierService mockedSuppliers;
    private static Supplier supplier1;
    private static Supplier supplier2;
    private static Address address1(){return address1();}
    private static Address address2(){return address1();}

    @BeforeClass
    public static void setup() {
        mockedSuppliers = mock(SupplierService.class);
        supplier1 = new Supplier(5, "Apple", address1());
        supplier2 = new Supplier(7, "Samsung", address2());

        when(mockedSuppliers.findAll()).thenReturn(Arrays.asList(supplier1, supplier2));
    }

    @Test
    public void testFindAllSuppliers() throws Exception{
        List<Supplier> allSuppliers = mockedSuppliers.findAll();
        Assert.assertEquals(2, allSuppliers.size());
    }
}
