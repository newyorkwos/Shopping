package com.bajiru.shoppingerp.utils;

import com.bajiru.shoppingerp.VO.ResultVO;

/**
 * @Description create resultVO utility
 * @AuthorName StevenWu
 * @CreateDateTime 2020-04-13-9:24 下午
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO err(Integer code, String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
