package com.xueqing.service;

import com.xueqing.entity.StuUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xueqing.form.LoginForm;
import com.xueqing.vo.ResultVO;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author admin
 * @since 2024-01-21
 */
public interface StuUserService extends IService<StuUser> {

    public ResultVO login(LoginForm loginForm);
}
