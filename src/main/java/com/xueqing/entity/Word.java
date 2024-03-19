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
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Word implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "word_id", type = IdType.AUTO)
    private String wordId;

    private String wordTime;

    private String wordContent;

    private Integer wordEncode;

    private Integer wordVideoId;


}
