package com.github.backbook.luwu.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.backbook.luwu.model.pojo.TbUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbUserMapper extends BaseMapper<TbUser> {

    @Select("select * from tb_user where name = \"李四\"")
    List<TbUser>  getAll();

}
