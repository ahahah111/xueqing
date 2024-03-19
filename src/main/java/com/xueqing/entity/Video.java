package com.xueqing.entity;

import java.time.LocalTime;
import java.sql.Blob;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 回放视频表
 * </p>
 *
 * @author admin
 * @since 2024-03-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Video implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "video_id", type = IdType.AUTO)
    private Integer videoId;

    private String videoName;

    private LocalTime videoDuration;

    private String videoPathf;

    private Integer videoLikeNum;

    private Float videoScore;

    private String videoKeyword;

    private Integer teacherId;

    private Blob videoResource;


}
