package com.bajiru.shoppingerp.service;

import com.bajiru.shoppingerp.domain.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Description create Order service
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-29-10:00 下午
 */
public interface OrderService {

    /**創建訂單 */
    OrderMaster create(OrderMaster orderMaster);
//    查詢訂單
    OrderMaster findOne(Long orderId);
//    查詢訂單列表
    Page<OrderMaster> findList(Long buyerid, Pageable pageable);
//    取消訂單
    OrderMaster cancel(OrderMaster orderMaster);
//完結訂單
    OrderMaster finish(OrderMaster orderMaster);
//    支付訂單
    OrderMaster paid(OrderMaster orderMaster);

}
