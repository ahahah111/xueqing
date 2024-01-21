package com.xueqing.controller;


import com.xueqing.form.LoginForm;
import com.xueqing.service.TbUserService;
import com.xueqing.service.TeaUserService;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author admin
 * @since 2024-01-21
 */
@RestController
@RequestMapping("/teaUser")
public class TeaUserController {

    @Autowired
    private TeaUserService teaUserService;

    @GetMapping("/login")
    public ResultVO login(LoginForm loginForm){
        ResultVO resultVO = this.teaUserService.login(loginForm);
        return resultVO;
    }
}

