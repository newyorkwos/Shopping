package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.OrderMaster;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-18-3:50 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    private final String OPENID="110133";

    @Test
    public void saveTest(){
        OrderMaster orderMaster=new OrderMaster();

        orderMaster.setBuyerName("Vincent3");
        orderMaster.setBuyerPhone("123456789");
        //orderMaster.setBuyerOpenId("1001");
        orderMaster.setBuyerAddress("Hualien");
        orderMaster.setBuyerOpenId(OPENID);
        orderMaster.setOrderAmount(new Float(2.4));

        OrderMaster result=orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);

    }
    @Test
    public void findByBuyerOpenId() throws Exception {
        PageRequest request= PageRequest.of(0,3);
        Page<OrderMaster> result= orderMasterRepository.findByBuyerOpenId(OPENID, request);
        System.out.println(result.getTotalElements());
    }
}
