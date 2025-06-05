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
 * 医生用户：(DoctorUser)表实体类
 *
 */
@TableName("`doctor_user`")
@Data
@EqualsAndHashCode(callSuper = false)
public class DoctorUser implements Serializable {

    // DoctorUser编号
    @TableId(value = "doctor_user_id", type = IdType.AUTO)
    private Integer doctor_user_id;

    // 医生编号
    @TableField(value = "`doctor_no`")
    private String doctor_no;
    // 医生姓名
    @TableField(value = "`doctors_name`")
    private String doctors_name;
    // 医生性别
    @TableField(value = "`doctors_gender`")
    private String doctors_gender;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;




    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
