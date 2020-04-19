package com.bajiru.shoppingerp.domain;

import com.bajiru.shoppingerp.enums.OrderStatusEnum;
import com.bajiru.shoppingerp.enums.PayStatusEnum;
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
    /**訂單id*/
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long orderId;
    //買家姓名
    private String buyerName;

    //買機手機號碼
    private String buyerPhone;

    //buyer's address
    private String buyerAddress;

    //buyer Open id
    private String buyerOpenId;

    //total money
    private Float orderAmount;

    // Order status 0 new order
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();

    //pay status 0:yet
    private Integer payStatus= PayStatusEnum.WAIT.getCode();

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
