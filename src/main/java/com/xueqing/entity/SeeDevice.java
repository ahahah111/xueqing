package com.xueqing.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户观看直播记录表						

 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class SeeDevice implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "seeDevice_id", type = IdType.AUTO)
    private Integer seeDeviceId;

    private Integer userId;

    private Integer deviceId;

    private LocalDateTime seeBeginTime;

    private LocalDateTime seeEndTime;


}
