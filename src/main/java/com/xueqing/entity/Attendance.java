package com.xueqing.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 学生考勤表

 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Attendance implements Serializable {

    private static final long serialVersionUID=1L;

  @TableId(value = "attendance_id", type = IdType.AUTO)
      private Integer attendanceId;

    private Integer stuId;

    private LocalDate attendanceTime;


}
