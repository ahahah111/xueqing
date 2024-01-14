package com.xueqing.vo;

import lombok.Data;

@Data
public class ResultVO <T>{

    private Integer code;//0表示成功
    private T data;      //泛型
    private String mess;

}
