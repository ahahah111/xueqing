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
    public class Behave implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer behaveId;

    private Integer videoId;

    private Float induct;

    private Float focus;

    private Float nothing;

    private Float induct10;

    private Float focus10;

    private Float nothing10;

    private Float induct30;

    private Float focus30;

    private Float nothing30;

    private Float induct40;

    private Float focus40;

    private Float nothing40;


}
