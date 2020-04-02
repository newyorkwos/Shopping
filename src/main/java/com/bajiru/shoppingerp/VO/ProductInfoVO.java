package com.bajiru.shoppingerp.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Description create ProductInfo VO
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-02-10:19 下午
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private Long productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private Long productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
