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
 * 健康评估：(HealthAssessment)表实体类
 *
 */
@TableName("`health_assessment`")
@Data
@EqualsAndHashCode(callSuper = false)
public class HealthAssessment implements Serializable {

    // HealthAssessment编号
    @TableId(value = "health_assessment_id", type = IdType.AUTO)
    private Integer health_assessment_id;

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
    // 报告名称
    @TableField(value = "`report_name`")
    private String report_name;
    // 评估日期
    @TableField(value = "`evaluation_date`")
    private Timestamp evaluation_date;
    // 体质评估
    @TableField(value = "`physical_assessment`")
    private String physical_assessment;
    // 心理评估
    @TableField(value = "`psychological_assessment`")
    private String psychological_assessment;
    // 医生建议
    @TableField(value = "`doctors_advice`")
    private String doctors_advice;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
