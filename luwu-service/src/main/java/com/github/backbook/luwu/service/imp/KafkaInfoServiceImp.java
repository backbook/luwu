package com.github.backbook.luwu.service.imp;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.backbook.luwu.dao.mapper.KafkaMapper;
import com.github.backbook.luwu.model.pojo.KafkaInfo;
import com.github.backbook.luwu.model.req.KafkaInfoReq;
import com.github.backbook.luwu.service.KafkaInfoService;
import com.github.backbook.luwu.service.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KafkaInfoServiceImp implements KafkaInfoService {


    @Resource
    KafkaMapper kafkaMapper;


    @Override
    public List<KafkaInfo> list() {
        return kafkaMapper.selectList(null);
    }



    public void insert(KafkaInfoReq KafkaInfoReq) {
        KafkaInfo kafkaInfo = CopyUtil.copy(KafkaInfoReq, KafkaInfo.class);
        kafkaMapper.insert(kafkaInfo);
    }


    public List<KafkaInfo> listPage(){
        Page<KafkaInfo> kafkaInfoPage = new Page<>(1, 2);
        kafkaInfoPage = kafkaMapper.selectPage(kafkaInfoPage, null);
        return kafkaInfoPage.getRecords();
    }
}
