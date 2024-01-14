package com.xueqing.form;

import lombok.Data;

//接受登录信息
@Data
public class LoginForm {
    private String username;
    private String passwd;
}
