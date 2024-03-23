package com.yupi.yuoj.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目提交表
 * @TableName questionsubmit
 */
@TableName(value ="questionsubmit")
@Data
public class Questionsubmit implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 语言类型
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    /**
     * 判题信息(Json)
     */
    private String judgeInfo;

    /**
     * 判题状态（0-待判题 1-判题中 2-成功 3-失败）
     */
    private Integer status;

    /**
     * 帖子 id
     */
    private Long questionId;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}