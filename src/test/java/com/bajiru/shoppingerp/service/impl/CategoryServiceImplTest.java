package com.bajiru.shoppingerp.service.impl;

import com.bajiru.shoppingerp.domain.ProductCategory;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @AuthorName StevenWu
 * @CreateDateTime 2020-02-23-7:41 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    void findOne() {
        ProductCategory productCategory=categoryService.findOne(1L);
        Assert.assertEquals(new Long(1L), productCategory.getCategoryId());
    }

    @Test
    void findAll() {
       List<ProductCategory> productCategoryList=categoryService.findAll();
       Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList=categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    void save() {
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("女生");
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}
