package com.github.backbook.luwu.model.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

public class BaseModel extends Model implements Serializable {

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Long createTime;

    @TableField(value = "update_time",fill = FieldFill.INSERT)
    private Long updateTime;


}
