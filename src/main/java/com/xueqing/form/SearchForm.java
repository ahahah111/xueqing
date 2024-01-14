package com.xueqing.form;

import lombok.Data;

//接受，条件查询的信息
@Data
public class SearchForm {
    private String key;//必选
    private String value;
    private Integer page;
    private Integer size;
}
