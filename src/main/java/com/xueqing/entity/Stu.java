package com.xueqing.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * <p>
 * 学生表
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("stu")
public class Stu implements Serializable {
    private static final long serialVersionUID=1L;

    @TableId(value = "stu_id")
    private Integer stuId;
//    @TableField(value = "stu_name")
    private String stuName;

    private String stuClass;

    private String stuSex;

    private Integer stuAge;

    private Long stuPhone;

    private String stuPathf;

    private String stuPath;



}
