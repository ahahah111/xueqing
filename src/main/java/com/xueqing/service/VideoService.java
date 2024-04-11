package com.xueqing.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xueqing.entity.Video;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xueqing.form.SearchForm;
import com.xueqing.vo.PageVO;

/**
 * <p>
 * 回放视频表 服务类
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
public interface VideoService extends IService<Video> {


    public PageVO list(Integer page, Integer size);

    public PageVO search(SearchForm searchForm);

}
