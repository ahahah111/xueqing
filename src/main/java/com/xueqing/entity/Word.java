package com.xueqing.entity;

import java.io.Serializable;
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

      private String wordId;

    private String wordTime;

    private String wordContent;

    private Integer wordEncode;

    private Integer wordVideoId;


}
