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
 * 体检预约：(PhysicalExaminationAppointment)表实体类
 *
 */
@TableName("`physical_examination_appointment`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PhysicalExaminationAppointment implements Serializable {

    // PhysicalExaminationAppointment编号
    @TableId(value = "physical_examination_appointment_id", type = IdType.AUTO)
    private Integer physical_examination_appointment_id;

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
    // 预约时间
    @TableField(value = "`time_of_appointment`")
    private Timestamp time_of_appointment;
    // 联系方式
    @TableField(value = "`contact_information`")
    private String contact_information;
    // 备注
    @TableField(value = "`remarks`")
    private String remarks;



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
