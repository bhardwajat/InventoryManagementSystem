package com.revature.ims.ProductsTest;

import com.revature.ims.dao.ProductsService;

import com.revature.ims.domain.Products;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by akshat on 6/28/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsServiceTest {

    private static ProductsService mockedProducts;
    private static Products product1;
    private static Products product2;

@BeforeClass
    public static void setup(){
    mockedProducts = mock(ProductsService.class);
    product1 = new Products(2, "lamp", "12", "14");
    product2 = new Products(4, "chair", "10", "13");

    when(mockedProducts.findAll()).thenReturn(Arrays.asList(product1, product2));
    }

    @Test
    public void testFindAllProductServices() throws Exception{
        List<Products> allProducts = mockedProducts.findAll();
        Assert.assertEquals(2, allProducts.size());
    }
}