package com.github.backbook.luwu.mapper;


import com.github.backbook.luwu.TestLuwuApplication;
import com.github.backbook.luwu.dao.mapper.TbUserMapper;
import com.github.backbook.luwu.model.pojo.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestLuwuApplication.class})
public class TbUserMapperTest {


    @Resource
    TbUserMapper tbUserMapper;


    @Test
    public void insertUser(){
        TbUser tbUser = new TbUser();
        tbUser.setName("zhangsan");
        tbUser.setUserName("bada");
        tbUser.setAge(11);
        tbUser.setPassword("q2312323");
        tbUser.setEmail("123131!11");
        int insert = tbUserMapper.insert(tbUser);
        System.out.println(insert);

    }



}
