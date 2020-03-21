package com.bajiru.shoppingerp;

import lombok.Getter;

/**
 * @Description create ProductStatus enum
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-21-9:55 下午
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message){
        this.code=code;
        this.message=message;
    }
}
