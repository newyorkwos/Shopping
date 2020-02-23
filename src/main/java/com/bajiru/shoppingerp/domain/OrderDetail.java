package com.bajiru.shoppingerp.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description create order detail domain
 * @AuthorName StevenWu
 * @CreateDateTime 2020-01-25-2:19 下午
 */
@Entity
@Table
@DynamicUpdate
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long detailId;
    private Integer productQuantity;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    @ManyToOne
    private OrderMaster orderMaster;

    @OneToMany(mappedBy = "orderDetail")
    private List<ProductInfo> productInfos=new ArrayList<>();

    public OrderDetail() {
    }


}
