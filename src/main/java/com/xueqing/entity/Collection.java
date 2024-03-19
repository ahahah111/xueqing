package com.xueqing.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户收藏表
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Collection implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer collectionId;

    private Integer videoId;

    private Integer userId;

    private LocalDateTime collectionTime;


}
