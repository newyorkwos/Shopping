package com.bajiru.shoppingerp;

import lombok.Getter;

/**
 * @Description create Product category enum
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-22-8:47 上午
 */
@Getter
public enum ProductCategoryEnum {
    food(1,"食"),
    grocery(2,"雜貨"),
    bento(3,"便當"),
    stationery(4,"文具");


    private Integer code;
    private String message;
    ProductCategoryEnum(Integer code, String message) {
        this.code=code;
        this.message=message;
    }
}
