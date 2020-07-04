package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description ceate orderDetail repository
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-18-10:46 下午
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

    //List<OrderDetail> findOrderDetailByOrderMaster_BuyerOpenId
}
