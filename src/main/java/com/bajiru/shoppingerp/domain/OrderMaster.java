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
 * @Description create Order Master domain
 * @AuthorName StevenWu
 * @CreateDateTime 2020-01-25-11:03 上午
 */
@Entity
@Table
@DynamicUpdate
@Data
public class OrderMaster {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenId;
    private Float orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    @OneToMany(mappedBy = "orderMaster")
    private List<OrderDetail> orderDetails=new ArrayList<>();

    public OrderMaster() {
    }


}
