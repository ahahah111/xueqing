package com.xueqing.mapper;

import com.xueqing.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 视频评论表 Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
