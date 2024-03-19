package com.xueqing.service;

import com.xueqing.entity.Stu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xueqing.form.LoginForm;
import com.xueqing.form.SearchForm;
import com.xueqing.vo.PageVO;
import com.xueqing.vo.ResultVO;

/**
 * <p>
 * 学生表 服务类
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
public interface StuService extends IService<Stu> {

//   public ResultVO login(LoginForm loginForm);

   public PageVO list(Integer page, Integer size);

   public PageVO search(SearchForm searchForm);

//   public int removeByIds(Integer id);
}
