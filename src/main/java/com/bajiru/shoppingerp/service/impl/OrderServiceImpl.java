package com.bajiru.shoppingerp.service.impl;

import com.bajiru.shoppingerp.domain.OrderDetail;
import com.bajiru.shoppingerp.domain.OrderMaster;
import com.bajiru.shoppingerp.domain.ProductInfo;
import com.bajiru.shoppingerp.service.OrderService;
import com.bajiru.shoppingerp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @Description OrderMaster implements
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-29-10:27 下午
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Override
    public OrderMaster create(OrderMaster orderMaster) {
//        查詢商品(數量，價格)
        for(OrderDetail orderDetail: orderMaster.getOrderDetails()){
            ProductInfo productInfo=productService.findOne(orderDetail.getProductInfo().getProductId());
        }
//        計算總價
//        寫入訂單數據庫
//        扣庫存
        return null;
    }

    @Override
    public OrderMaster findOne(Long orderId) {
        return null;
    }

    @Override
    public Page<OrderMaster> findList(Long buyerid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderMaster cancel(OrderMaster orderMaster) {
        return null;
    }

    @Override
    public OrderMaster finish(OrderMaster orderMaster) {
        return null;
    }

    @Override
    public OrderMaster paid(OrderMaster orderMaster) {
        return null;
    }
}
