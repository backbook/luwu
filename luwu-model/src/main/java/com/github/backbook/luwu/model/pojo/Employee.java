package com.github.backbook.luwu.model.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_employee") // 声明表名称
public class Employee {
    private Long id;
    private String lastName;
    private String email;
    private Integer age;
}
