package com.github.backbook.luwu.controller;


import com.github.backbook.luwu.model.pojo.User;
import com.github.backbook.luwu.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/userList")
    public  List<User> userList(){
        List<User> list = userService.list();
        return list;
    }


}
