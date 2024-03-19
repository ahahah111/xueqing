package com.xueqing.service.impl;

import com.xueqing.entity.Video;
import com.xueqing.mapper.VideoMapper;
import com.xueqing.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 回放视频表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
