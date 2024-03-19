package com.xueqing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
    public class UserLogs implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 操作类型, insert/update/delete
     */
      private String operation;

      /**
     * 操作时间
     */
      private LocalDateTime operateTime;

      /**
     * 操作的ID
     */
      private Integer operateId;

      /**
     * 操作参数
     */
      private String operateParams;


}
