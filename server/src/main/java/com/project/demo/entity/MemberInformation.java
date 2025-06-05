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
 * 会员信息：(MemberInformation)表实体类
 *
 */
@TableName("`member_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class MemberInformation implements Serializable {

    // MemberInformation编号
    @TableId(value = "member_information_id", type = IdType.AUTO)
    private Integer member_information_id;

    // 会员账号
    @TableField(value = "`member_account`")
    private Integer member_account;
    // 会员姓名
    @TableField(value = "`member_name`")
    private String member_name;
    // 会员性别
    @TableField(value = "`member_gender`")
    private String member_gender;
    // 上次体检
    @TableField(value = "`last_physical_examination`")
    private Timestamp last_physical_examination;
    // 证件号码
    @TableField(value = "`identification_number`")
    private String identification_number;
    // 联系方式
    @TableField(value = "`contact_information`")
    private String contact_information;
    // 居住地址
    @TableField(value = "`residential_address`")
    private String residential_address;
    // 会员备注
    @TableField(value = "`member_notes`")
    private String member_notes;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
