package com.xueqing.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author admin
 * @since 2024-01-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class StuUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String userName;

    private String userPass;

    private LocalDateTime userRegisterDay;

    private String userMail;


}
