package com.github.backbook.luwu.service;

import com.github.backbook.luwu.model.pojo.KafkaInfo;
import com.github.backbook.luwu.model.req.KafkaInfoReq;

import java.util.List;


public interface KafkaInfoService {

    List<KafkaInfo> list();

    void insert(KafkaInfoReq kafkaInfoReq);

}
