package com.xueqing.util;

import com.xueqing.vo.ResultVO;

//统一的返回工具类
public class ResultVOUtil {
    //成功的话，需要返回code以及返回的数据对象
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(object);
        resultVO.setMess("success");
        return resultVO;
    }

    //失败的话，只需要返回code为-1就行
    public static ResultVO fail(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(-1);
        resultVO.setData(null);
        resultVO.setMess("fail");
        return resultVO;
    }
}
