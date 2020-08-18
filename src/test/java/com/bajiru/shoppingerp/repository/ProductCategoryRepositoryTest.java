package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @AuthorName StevenWu
 * @CreateDateTime 2020-01-29-10:31 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;


    @Test
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("Three");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
    @Test
    public void findOneTest() {
        Long id=1L;
        ProductCategory productCategory=repository.findById(id).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    public void updateTest(){
        Long id=1L;
        ProductCategory productCategory=repository.findById(id).orElse(null);
        productCategory.setCategoryName("One");
        productCategory.setCategoryType(1);
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotNull(result);
        //repository.save(productCategory);
    }
    @Test
    public void findCategoriesByTypeIn(){
        List<Integer> list= Arrays.asList(2,3,4);
        List<ProductCategory> result=repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}
