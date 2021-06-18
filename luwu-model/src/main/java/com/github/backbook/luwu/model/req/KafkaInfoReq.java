package com.github.backbook.luwu.model.req;


import lombok.Data;

@Data
public class KafkaInfoReq {

    private String clusterName;

    private String host;

    private String balanceHost;

    private Long port;

    private String version;

    private String description;

}
