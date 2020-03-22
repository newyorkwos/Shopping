package com.bajiru.shoppingerp.service.impl;

import com.bajiru.shoppingerp.ProductCategoryEnum;
import com.bajiru.shoppingerp.ProductStatusEnum;
import com.bajiru.shoppingerp.domain.ProductInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-21-10:13 下午
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    void findOne() {
        ProductInfo productInfo=productService.findOne(10L);
        Assert.assertEquals(new Long(10L), productInfo.getProductId());
    }

    @Test
    void findUpAll() {
        List<ProductInfo> productInfoList=productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
   void findAll() {
        PageRequest request=PageRequest.of(0,2);
        Page<ProductInfo> productInfoPage=productService.findAll(request);
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());


    }

    @Test
    void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductName("抓餅蛋");
        productInfo.setProductPrice(35L);
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃");
        productInfo.setProductIcon("https://res.klook.com/image/upload/fl_lossy.progressive/q_auto/f_auto/blogtw/%E9%BE%8D%E8%B2%93%E5%9C%96%E7%89%87.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setProductCategory(categoryService.findByCategoryType(ProductCategoryEnum.food.getCode()));
        ProductInfo result=productService.save(productInfo);
        Assert.assertNotNull(result);

    }
}
