package com.xueqing.service;

import com.xueqing.entity.Classclass;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xueqing.form.SearchForm;
import com.xueqing.vo.PageVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2024-03-19
 */
public interface ClassclassService extends IService<Classclass> {

    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
}
