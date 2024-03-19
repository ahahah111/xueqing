package com.xueqing.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author admin
 * @since 2024-01-13
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class TbUser implements Serializable {

    private static final long serialVersionUID= 6165072481836715062L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "user_pass")
    private String userPass;

    @TableField(value = "user_register_day")
    private LocalDateTime userRegisterDay;
    @TableField(value = "user_mail")
    private String userMail;

//    @TableField(value = "user_type")
//    private String userType;


}
