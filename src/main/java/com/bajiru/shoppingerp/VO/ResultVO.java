package com.bajiru.shoppingerp.VO;

import lombok.Data;

/**
 * @Description create result VO
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-31-10:36 下午
 */
@Data
public class ResultVO<T> {

    /**錯誤碼**/
    private Integer code;

    /**提示信息**/
    private String msg;

    /**具體內容*/
    private  T Data;

}
