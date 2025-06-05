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
 * 咨询回复：(ConsultationResponse)表实体类
 *
 */
@TableName("`consultation_response`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ConsultationResponse implements Serializable {

    // ConsultationResponse编号
    @TableId(value = "consultation_response_id", type = IdType.AUTO)
    private Integer consultation_response_id;

    // 会员账号
    @TableField(value = "`member_account`")
    private Integer member_account;
    // 会员姓名
    @TableField(value = "`member_name`")
    private String member_name;
    // 会员性别
    @TableField(value = "`member_gender`")
    private String member_gender;
    // 医生账号
    @TableField(value = "`doctor_account`")
    private Integer doctor_account;
    // 医生编号
    @TableField(value = "`doctor_no`")
    private String doctor_no;
    // 医生姓名
    @TableField(value = "`doctors_name`")
    private String doctors_name;
    // 咨询主题
    @TableField(value = "`consultation_topic`")
    private String consultation_topic;
    // 内容
    @TableField(value = "`content`")
    private String content;
    // 回复时间
    @TableField(value = "`reply_time`")
    private Timestamp reply_time;
    // 回复
    @TableField(value = "`reply`")
    private String reply;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
