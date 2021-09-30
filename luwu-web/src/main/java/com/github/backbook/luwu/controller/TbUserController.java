package com.github.backbook.luwu.controller;


import com.github.backbook.luwu.model.pojo.TbUser;
import com.github.backbook.luwu.service.TbUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/mng/user/")
@CrossOrigin
public class TbUserController {

    @Resource
    TbUserService tbUserService;



    @GetMapping("/getAll")
    public List<TbUser> getUser(){
        return tbUserService.list();
    }


    @GetMapping("/getA2ll")
    public List<TbUser> getUser1(){
        return tbUserService.list();
    }

}
