package com.github.backbook.luwu.model.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

public class BaseModel implements Serializable {

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Long createTime;

    @TableField(value = "update_time",fill = FieldFill.INSERT)
    private Long updateTime;


}
