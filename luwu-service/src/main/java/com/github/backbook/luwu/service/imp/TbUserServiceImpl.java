package com.github.backbook.luwu.service.imp;

import com.github.backbook.luwu.dao.mapper.TbUserMapper;
import com.github.backbook.luwu.model.pojo.TbUser;
import com.github.backbook.luwu.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> list() {
        return tbUserMapper.getAll();
    }
}
