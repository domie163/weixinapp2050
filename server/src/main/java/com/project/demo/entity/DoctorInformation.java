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
 * 医生信息：(DoctorInformation)表实体类
 *
 */
@TableName("`doctor_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class DoctorInformation implements Serializable {

    // DoctorInformation编号
    @TableId(value = "doctor_information_id", type = IdType.AUTO)
    private Integer doctor_information_id;

    // 医生账号
    @TableField(value = "`doctor_account`")
    private Integer doctor_account;
    // 医生编号
    @TableField(value = "`doctor_no`")
    private String doctor_no;
    // 医生姓名
    @TableField(value = "`doctors_name`")
    private String doctors_name;
    // 医生照片
    @TableField(value = "`doctors_photo`")
    private String doctors_photo;
    // 医生性别
    @TableField(value = "`doctors_gender`")
    private String doctors_gender;
    // 从业时间
    @TableField(value = "`employment_time`")
    private String employment_time;
    // 医生简介
    @TableField(value = "`doctor_introduction`")
    private String doctor_introduction;

    // 点击数
    @TableField(value = "hits")
    private Integer hits;

    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
