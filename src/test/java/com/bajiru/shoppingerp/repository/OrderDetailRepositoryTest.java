package com.bajiru.shoppingerp.repository;

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
//        OrderDetail orderDetail=new OrderDetail();
//        orderDetail.setOrderMaster(orderMasterRepository.getOne(2L));
//        List<Long> list= Arrays.asList(3L,4L);
//        //orderDetail.setProductInfos(productInfoRepository.findAllById(list));
//        OrderDetail result=orderDetailRepository.save(orderDetail);
//        Assert.assertNotNull(result);
    }

    @Test
    void findByOrderMasterByOrderId() {
    }
}
