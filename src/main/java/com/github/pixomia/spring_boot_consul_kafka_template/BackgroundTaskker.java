package com.github.pixomia.spring_boot_consul_kafka_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.github.pixomia.util.PixomiaTimeUtils;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class BackgroundTaskker {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private TopicSwitchConfigFromConsul topicSwitchConfigFromConsul;

    @Scheduled(fixedDelay = 1000)
    public void backGroundTassker() {
	BackgroundTaskker.log.atDebug().log("Start background Task");
	kafkaTemplate.send("bingo.bongo", "" + PixomiaTimeUtils.getCurrTimeString());
	System.out.println("backGroundTassker " + topicSwitchConfigFromConsul.getSwitchTopicBingoBongo());
	BackgroundTaskker.log.atDebug().log("End background Task");
    }

}
