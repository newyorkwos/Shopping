package com.bajiru.shoppingerp.service.impl;

import com.bajiru.shoppingerp.domain.OrderMaster;
import com.bajiru.shoppingerp.repository.OrderMasterRepository;
import com.bajiru.shoppingerp.repository.ProductInfoRepository;
import com.bajiru.shoppingerp.service.OrderService;
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
    private OrderMasterRepository orderMasterRepository;

    private ProductInfoRepository productInfoRepository;

    @Override
    public OrderMaster create(OrderMaster orderMaster) {
//        查詢商品(數量，價格)
//        for(OrderDetail orderDetail: orderMaster.{
//            ProductInfo productInfo=productService.findOne(orderDetail.getProductInfo().getProductId());
//        }
//        計算總價
//        寫入訂單數據庫
//        扣庫存
        return null;
    }

    @Override
    public OrderMaster findOne(Long orderId) {
        OrderMaster orderMaster=orderMasterRepository.getOne(orderId);
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
