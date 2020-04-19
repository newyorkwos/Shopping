package com.bajiru.shoppingerp.enums;

import lombok.Getter;

/**
 * @Description create paystatus enum
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-18-11:55 上午
 */
@Getter
public enum  PayStatusEnum implements CodeEnum {
   WAIT(0,"等待支付"),
    success(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
