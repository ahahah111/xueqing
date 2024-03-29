package com.xueqing.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.xueqing.form.LoginForm;
import com.xueqing.service.StuUserService;
import com.xueqing.util.ResultVOUtil;
import com.xueqing.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author admin
 * @since 2024-01-21
 */
@RestController
@RequestMapping("/stuUser")
public class StuUserController {
    @Autowired
    private StuUserService stuUserService;

    @GetMapping("/login")
    public ResultVO login(LoginForm loginForm){
        ResultVO resultVO = this.stuUserService.login(loginForm);
        return resultVO;
    }

    @PostMapping("/logout")
    public ResultVO logout (HttpServletRequest request){
        //清理Session中的保存的当前员工的id
        request.getSession().removeAttribute("StuUser");
        return ResultVOUtil.success("退出成功");
    }

}

