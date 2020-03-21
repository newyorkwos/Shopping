package com.bajiru.shoppingerp.repository;


import com.bajiru.shoppingerp.domain.ProductInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


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
        productInfo.setProductDescription("很好吃");
        productInfo.setProductIcon("https://res.klook.com/image/upload/fl_lossy.progressive/q_auto/f_auto/blogtw/%E9%BE%8D%E8%B2%93%E5%9C%96%E7%89%87.jpg");
        productInfo.setProductStatus(0);
        productInfo.setProductCategory(productCategoryRepository.findByCategoryType(1));

        ProductInfo result=productInfoRepository.save(productInfo);
        Assert.assertNotNull(result);


    }
    @Test
    void findByProductStatus() {
        List<ProductInfo> productInfoList=productInfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }
}
