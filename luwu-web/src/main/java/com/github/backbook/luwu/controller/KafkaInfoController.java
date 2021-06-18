package com.github.backbook.luwu.controller;

import com.github.backbook.luwu.model.pojo.KafkaInfo;
import com.github.backbook.luwu.model.req.KafkaInfoReq;
import com.github.backbook.luwu.service.KafkaInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/mng/metadata/")
public class KafkaInfoController {


    @Resource
    KafkaInfoService kafkaInfoService;

    @GetMapping("/getKafakInfoList")
    public List<KafkaInfo> getKafkaInfoList(){
        return kafkaInfoService.list();
    }

    @PostMapping("/insertKafkaInfo")
    public void insertKafkaInfo(@RequestBody KafkaInfoReq kafkaInfoReq){
        kafkaInfoService.insert(kafkaInfoReq);
    }



}
