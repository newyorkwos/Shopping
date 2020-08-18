package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.OrderDetail;
import com.bajiru.shoppingerp.domain.OrderMaster;
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
 * @CreateDateTime 2020-04-18-10:50 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail=new OrderDetail();
        OrderMaster orderMaster=new OrderMaster();
        orderMaster=orderMasterRepository.findById(1L).orElse(null);
        //orderMaster.setOrderId(11111123L);
        //orderDetail.setOrderMaster(orderMasterRepository.getOne(2L));
        orderDetail.setOrderMaster(orderMaster);
        ProductInfo productInfo=new ProductInfo();
        productInfo=productInfoRepository.findById(3L).orElse(null);
//        productInfo.setProductIcon("http://xxx.jpg");
//        productInfo.setProductName("皮蛋粥");
//        productInfo.setProductPrice(22L);
//        productInfo.setProductQuantity(2);
        orderDetail.setProductInfo(productInfo);
        OrderDetail result=orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    void findByOrderMasterByOrderId() {
    }
}
