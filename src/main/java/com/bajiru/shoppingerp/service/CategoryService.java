package com.bajiru.shoppingerp.service;

import com.bajiru.shoppingerp.domain.ProductCategory;

import java.util.List;

/**
 * @Description create category service
 * @AuthorName StevenWu
 * @CreateDateTime 2020-02-23-7:22 下午
 */
public interface CategoryService {
    ProductCategory findOne(Long categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
