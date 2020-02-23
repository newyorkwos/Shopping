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
 * @CreateDateTime 2020-01-25-2:23 下午
 */
@Entity
@Table
@DynamicUpdate
@Data
public class SellerInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long sellerId;
    private String userName;
    private String password;
    private String openid;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    public SellerInfo() {
    }


}
