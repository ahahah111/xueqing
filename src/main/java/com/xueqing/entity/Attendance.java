package com.xueqing.entity;

import java.time.LocalDate;
import java.io.Serializable;
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

      private Integer attendanceId;

    private Integer stuId;

    private LocalDate attendanceTime;


}
