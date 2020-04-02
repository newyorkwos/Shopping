package com.bajiru.shoppingerp.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Description create productVO
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-02-10:13 下午
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVoList;

}
