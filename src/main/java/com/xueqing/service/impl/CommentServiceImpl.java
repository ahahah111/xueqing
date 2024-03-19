package com.xueqing.service.impl;

import com.xueqing.entity.Comment;
import com.xueqing.mapper.CommentMapper;
import com.xueqing.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频评论表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
