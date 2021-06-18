package com.github.backbook.luwu.dao.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;


@Component
public class MybatisHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 创建时间和更新时间都插入
        Object created = getFieldValByName("createTime", metaObject);
        if (null == created) {
            // 字段为空，可以进行填充
            setFieldValByName("createTime", System.currentTimeMillis(), metaObject);
        }
        Object updated = getFieldValByName("updateTime", metaObject);
        if (null == updated) {
            // 字段为空，可以进行填充
            setFieldValByName("updateTime", System.currentTimeMillis(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 如果不更新创建时间，那么传过来的创建时间为null
        this.setFieldValByName("updateTime", System.currentTimeMillis(), metaObject);
    }
}
