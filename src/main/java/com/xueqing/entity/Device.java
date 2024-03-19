package com.xueqing.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

  @TableId(value = "device_id", type = IdType.AUTO)
      private Integer deviceId;

    private String deviceName;

    private LocalDateTime deviceBeginTime;

    private LocalDateTime deviceEndTime;

    private LocalDateTime deviceCreateTime;

    private String state;


}
