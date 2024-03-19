package com.xueqing.entity;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户观看视频历史表
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class SeeVideo implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer seeVideoId;

    private Integer videoId;

    private Integer userId;

    private LocalTime seeHistory;

    private LocalDateTime seeLastTime;


}
