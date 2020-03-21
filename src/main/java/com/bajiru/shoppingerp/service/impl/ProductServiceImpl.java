package com.bajiru.shoppingerp.service.impl;

import com.bajiru.shoppingerp.ProductStatusEnum;
import com.bajiru.shoppingerp.domain.ProductInfo;
import com.bajiru.shoppingerp.repository.ProductInfoRepository;
import com.bajiru.shoppingerp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description create ProductService implements
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-14-6:57 下午
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo findOne(Long productId) {
        return productInfoRepository.getOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }
}
