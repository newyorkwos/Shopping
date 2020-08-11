package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description ceate orderDetail repository
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-18-10:46 下午
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

    List<OrderDetail> findByOrderMaster_OrderId(Long orderId);
}
