package com.xueqing.service;

import com.xueqing.entity.classclass;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xueqing.form.SearchForm;
import com.xueqing.vo.PageVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
public interface ClassService extends IService<classclass> {

    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
}
