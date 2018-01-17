package com.revature.ims.RetailerSalesTest;

import com.revature.ims.dao.RetailerSalesService;

import com.revature.ims.domain.RetailerSales;
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
public class RetailerSalesTest {

    private static RetailerSalesService mockedRetailerSales;
    private static RetailerSales retailerSales1;
    private static RetailerSales retailerSales2;

    @BeforeClass
    public static void setup() {
//        Date d = new Date(System.currentTimeMillis());
//        mockedRetailerSales = mock(RetailerSalesService.class);
//        retailerSales1 = new RetailerSales(2, 4, 6, 7, 90, d);
//        retailerSales2 = new RetailerSales(3, 5, 7, 8, 30, d);
//
//        when(mockedRetailerSales.findAll()).thenReturn(Arrays.asList(retailerSales1, retailerSales2));
    }

    @Test
    public void testFindAllRetailerSales() throws Exception{
        List<RetailerSales> allRetailerSales = mockedRetailerSales.findAll();
        Assert.assertEquals(2, allRetailerSales.size());
    }
}
