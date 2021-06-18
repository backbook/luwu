package com.github.backbook.luwu.service;

import com.github.backbook.luwu.model.pojo.KafkaInfo;

import java.util.List;


public interface KafkaInfoService {

    List<KafkaInfo> list();

    void insert(KafkaInfo KafkaInfo);

}
