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
    public class Class implements Serializable {
    @TableId(type = IdType.AUTO)
    private static final long serialVersionUID=1L;

    @TableId(value = "class_id")
    private Integer classId;

    private String className;

    private String classIntroduce;

    private String classTeacher;


}
