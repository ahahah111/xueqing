package com.xueqing.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Course implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "course_id", type = IdType.AUTO)
    private Integer courseId;

    private String courseName;

    private String courseTime;

    private String courseTeacher;


}
