package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description create ProductInfo Repository
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-01-12:17 下午
 */
public interface ProductInfoRepository extends JpaRepository <ProductInfo, Long> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
