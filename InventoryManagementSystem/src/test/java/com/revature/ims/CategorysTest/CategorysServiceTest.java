package com.revature.ims.CategorysTest;


import com.revature.ims.domain.Categorys;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.revature.ims.dao.CategorysService;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by akshat on 6/28/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategorysServiceTest {

    private static CategorysService mockedCategorys;
    private static Categorys category1;
    private static Categorys category2;

@BeforeClass
    public static void setup(){
//    mockedCategorys = mock(CategorysService.class);
//    category1 = new Categorys(23, "Swimming tanks");
//    category2 = new Categorys(46, "Fishing Rod");
//
//    when(mockedCategorys.findAll()).thenReturn(Arrays.asList(category1, category2));
}

@Test
    public void testFindAllCategorys() throws Exception{
    List<Categorys> allCategorys = mockedCategorys.findAll();
    Assert.assertEquals(2, allCategorys.size());
}
}
