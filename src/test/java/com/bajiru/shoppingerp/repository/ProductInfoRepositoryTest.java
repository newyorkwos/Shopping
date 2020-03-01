package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.ProductInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Description
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-01-12:20 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void saveTest(){
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId(123456L);
        productInfo.setProductName("鹹蛋");
        productInfo.setProductPrice(30L);
        productInfo.setProductStock(100);
        productInfo.setProductCategory(productCategoryRepository.findByCategoryType(1));

        ProductInfo result=productInfoRepository.save(productInfo);
        Assert.assertNotNull(result);


    }
    @Test
    void findByProductStatus() {
    }
}
