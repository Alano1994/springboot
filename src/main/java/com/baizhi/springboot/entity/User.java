package com.baizhi.springboot.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("user")
public class User implements Serializable {
    @TableId("id")
    @JSONField(serialize = false)
    private Integer id;
    private String name;
    private String pwd;
    private Integer age;
    private Integer isDelete;
}
