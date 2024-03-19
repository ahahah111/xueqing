package com.xueqing.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 设备直播表
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Device implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer deviceId;

    private String deviceName;

    private LocalDateTime deviceBeginTime;

    private LocalDateTime deviceEndTime;

    private LocalDateTime deviceCreateTime;

    private String state;


}
