package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.OrderMaster;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Test
    public void saveTest(){
        OrderMaster orderMaster=new OrderMaster();

        orderMaster.setBuyerName("Vincent");
        orderMaster.setBuyerPhone("123456789");
        orderMaster.setBuyerOpenId("1001");
        orderMaster.setBuyerAddress("Hualien");
        orderMaster.setOrderAmount(new Float(2.3));

        OrderMaster result=orderMasterRepository.save(orderMaster);
    }
    @Test
    void findByBuyerOpenId() {
    }
}
