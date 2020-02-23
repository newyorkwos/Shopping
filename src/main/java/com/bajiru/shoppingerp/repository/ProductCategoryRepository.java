package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description create Product Category interface
 * @AuthorName StevenWu
 * @CreateDateTime 2020-01-29-10:29 下午
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
