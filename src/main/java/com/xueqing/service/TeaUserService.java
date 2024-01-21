package com.xueqing.service;

import com.xueqing.entity.TeaUser;
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
public interface TeaUserService extends IService<TeaUser> {

    public ResultVO login(LoginForm loginForm);
}
