package com.xueqing.vo;

import lombok.Data;

//这里定义的是，分页信息的返回
@Data
public class PageVO {

    private Object data;
    private Long Total;
}
