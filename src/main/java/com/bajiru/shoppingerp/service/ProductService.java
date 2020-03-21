package com.bajiru.shoppingerp.service;

import com.bajiru.shoppingerp.domain.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Description create ProductService
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-14-6:50 下午
 */
public interface ProductService {

    ProductInfo findOne(Long productId);

    /**
     * find all product in stock
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加庫存

    //減庫存

}
