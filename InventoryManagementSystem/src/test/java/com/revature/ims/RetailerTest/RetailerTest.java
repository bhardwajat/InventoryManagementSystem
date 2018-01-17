package com.revature.ims.RetailerTest;

import com.revature.ims.dao.RetailerService;

import com.revature.ims.domain.Address;
import com.revature.ims.domain.Retailer;
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
public class RetailerTest {

    private static RetailerService mockedRetailers;
    private static Retailer retailer1;
    private static Retailer retailer2;
    private static Address address1(){return address1();}
    private static Address address2(){return address1();}

    @BeforeClass
    public static void setup() {
        mockedRetailers = mock(RetailerService.class);
        retailer1 = new Retailer(2, "Walmart", address1());
        retailer2 = new Retailer(4, "BestBuy", address2());

        when(mockedRetailers.findAll()).thenReturn(Arrays.asList(retailer1, retailer2));
    }

    @Test
    public void testFindAllRetailers() throws Exception{
        List<Retailer> allRetailers = mockedRetailers.findAll();
        Assert.assertEquals(2, allRetailers.size());
    }

}
