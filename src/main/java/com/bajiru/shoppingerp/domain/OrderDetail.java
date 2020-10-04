package com.bajiru.shoppingerp.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

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
    // Order id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long detailId;

    //product quantity
    //private Integer productQuantity;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;


    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    @ManyToOne
    private OrderMaster orderMaster;

    //@OneToMany(mappedBy = "orderDetail", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    //private List<ProductInfo> productInfos=new ArrayList<>();
    //(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) //當儲存oredrdetail時，productInfo也要被保存,Merge=集聯更新
    //若只是查詢後儲存就不需要用casecade
    @OneToOne
    private ProductInfo productInfo;

    public OrderDetail() {
    }


}
