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
 * 健康档案：(HealthRecords)表实体类
 *
 */
@TableName("`health_records`")
@Data
@EqualsAndHashCode(callSuper = false)
public class HealthRecords implements Serializable {

    // HealthRecords编号
    @TableId(value = "health_records_id", type = IdType.AUTO)
    private Integer health_records_id;

    // 会员账号
    @TableField(value = "`member_account`")
    private Integer member_account;
    // 会员姓名
    @TableField(value = "`member_name`")
    private String member_name;
    // 会员性别
    @TableField(value = "`member_gender`")
    private String member_gender;
    // 报告名称
    @TableField(value = "`report_name`")
    private String report_name;
    // 体检时间
    @TableField(value = "`physical_examination_time`")
    private Timestamp physical_examination_time;
    // 身高/cm
    @TableField(value = "`height_cm`")
    private String height_cm;
    // 体重/kg
    @TableField(value = "`body_weightkg`")
    private String body_weightkg;
    // 血压数据
    @TableField(value = "`blood_pressure_data`")
    private String blood_pressure_data;
    // 血常规
    @TableField(value = "`routine_blood_test`")
    private String routine_blood_test;
    // 尿常规
    @TableField(value = "`urinalysis`")
    private String urinalysis;
    // 肝功能
    @TableField(value = "`liver_function`")
    private String liver_function;
    // 肾功能
    @TableField(value = "`renal_function`")
    private String renal_function;
    // 心电图
    @TableField(value = "`electrocardiogram`")
    private String electrocardiogram;
    // 超声影像
    @TableField(value = "`ultrasound_imaging`")
    private String ultrasound_imaging;
    // CT检查
    @TableField(value = "`ct_examination`")
    private String ct_examination;
    // 其他检查
    @TableField(value = "`other_inspections`")
    private String other_inspections;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
