package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 意见反馈：(Feedback)表实体类
 *
 */
@TableName("`feedback`")
@Data
@EqualsAndHashCode(callSuper = false)
public class Feedback implements Serializable {

    // Feedback编号
    @TableId(value = "feedback_id", type = IdType.AUTO)
    private Integer feedback_id;

    // 会员账号
    @TableField(value = "`member_account`")
    private Integer member_account;
    // 会员姓名
    @TableField(value = "`member_name`")
    private String member_name;
    // 提交时间
    @TableField(value = "`submission_time`")
    private Timestamp submission_time;
    // 反馈类型
    @TableField(value = "`feedback_type`")
    private String feedback_type;
    // 内容
    @TableField(value = "`feedback_content`")
    private String feedback_content;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;



    // 审核回复
    @TableField(value = "examine_reply")
    private String examine_reply;




    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
