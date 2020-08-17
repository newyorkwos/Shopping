package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.OrderDetail;
import com.bajiru.shoppingerp.domain.OrderMaster;
import com.bajiru.shoppingerp.domain.ProductInfo;
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
        orderMaster.setOrderId(11111123L);
        //orderDetail.setOrderMaster(orderMasterRepository.getOne(2L));
        orderDetail.setOrderMaster(orderMaster);
        ProductInfo productInfo=new ProductInfo();

    }

    @Test
    void findByOrderMasterByOrderId() {
    }
}
