package com.github.pixomia.spring_boot_consul_kafka_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.github.pixomia.kafka_util_services.KafkaConsulUtilService;
import com.github.pixomia.util.PixomiaIdUtils;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Getter
@RefreshScope
@ConfigurationProperties
public class TopicSwitchConfigFromConsul {
    @Autowired
    private KafkaConsulUtilService kafkaConsulUtilService;
    @Value(value = "${switch.topic.bingo.bongo}")
    private String switchTopicBingoBongo;

    @PostConstruct
    public void refresh() {
	System.out.println("Value Changed   " + PixomiaIdUtils.genHumandReadableId());
	TopicSwitchConfigFromConsul.log.atDebug().log("START KafakConsulSwitcherService");
	kafkaConsulUtilService.switchKafkaConsumer("bingo.bongo", getSwitchTopicBingoBongo());
	TopicSwitchConfigFromConsul.log.atDebug().log("END KafakConsulSwitcherService");
    }
}
