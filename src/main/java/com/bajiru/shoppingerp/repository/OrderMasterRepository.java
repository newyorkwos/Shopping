package com.bajiru.shoppingerp.repository;

import com.bajiru.shoppingerp.domain.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description create Order Master Repository
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-18-2:11 下午
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, Long> {
    Page<OrderMaster> findByBuyerOpenId(String buyerOpenid, Pageable pageable);
}
