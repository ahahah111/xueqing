package com.xueqing.service;

import com.xueqing.entity.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xueqing.form.LoginForm;
import com.xueqing.form.SearchForm;
import com.xueqing.vo.PageVO;
import com.xueqing.vo.ResultVO;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
public interface TbUserService extends IService<TbUser> {

   public ResultVO login(LoginForm loginForm);

   public PageVO list(Integer page, Integer size);

   public PageVO search(SearchForm searchForm);
}
