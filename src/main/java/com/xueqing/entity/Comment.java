package com.xueqing.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 视频评论表
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Comment implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer commentId;

    private LocalDateTime commentTime;

    private Integer userId;

    private String commentContent;

    private Integer commentLikeNum;

    private Integer videoId;


}
