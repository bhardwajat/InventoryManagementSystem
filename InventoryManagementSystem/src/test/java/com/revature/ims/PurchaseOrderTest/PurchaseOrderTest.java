package com.revature.ims.PurchaseOrderTest;

import com.revature.ims.dao.PurchaseOrderService;

import com.revature.ims.domain.PurchaseOrder;
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
public class PurchaseOrderTest {

    private static PurchaseOrderService mockedPurchaseOrders;
    private static PurchaseOrder purchaseOrder1;
    private static PurchaseOrder purchaseOrder2;

    @BeforeClass
    public static void setup() {
//        Date d = new Date(System.currentTimeMillis());
//        mockedPurchaseOrders = mock(PurchaseOrderService.class);
//        purchaseOrder1 = new PurchaseOrder(2, d, 4, 6, 8.9);
//        purchaseOrder2 = new PurchaseOrder(4, d, 7, 9, 7.8);
//
//        when(mockedPurchaseOrders.findAll()).thenReturn(Arrays.asList(purchaseOrder1, purchaseOrder2));
    }

    @Test
    public void testFindAllPurchaseOrders() throws Exception{
        List<PurchaseOrder> allPurchaseOrders = mockedPurchaseOrders.findAll();
        Assert.assertEquals(2, allPurchaseOrders.size());
    }
}
