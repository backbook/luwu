package com.github.backbook.luwu.service.imp;


import com.github.backbook.luwu.dao.mapper.UserMapper;
import com.github.backbook.luwu.model.pojo.User;
import com.github.backbook.luwu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService  {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User> users = userMapper.selectAll();
        return users;
    }
}
