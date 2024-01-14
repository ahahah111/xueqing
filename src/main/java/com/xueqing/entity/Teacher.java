package com.xueqing.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 教师表
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Teacher implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "teacher_id")
    private Integer teacherId;

    private String teacherName;

    private String teacherClass;

    private String teacherSubject;


}
