package com.bajiru.shoppingerp.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.*;

/**
 * @Description create production class
 * @AuthorName StevenWu
 * @CreateDateTime 2020-01-24-11:34 下午
 */
@Entity
@Table
@DynamicUpdate
@Data
public class ProductInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private Long productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    //0:上架 1:下架
    private Integer productStatus;

//    @OneToOne(mappedBy = "productInfo")//被維護方
//    private OrderDetail orderDetail;
//    @ManyToMany(mappedBy = "productInfos")
//    private Set<OrderMaster> orderMasters=new HashSet<>();

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    @ManyToOne
    private ProductCategory productCategory;

    public ProductInfo() {
    }


}
