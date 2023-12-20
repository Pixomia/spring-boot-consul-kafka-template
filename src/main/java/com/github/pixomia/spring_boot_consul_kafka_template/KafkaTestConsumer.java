package com.github.pixomia.spring_boot_consul_kafka_template;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.github.pixomia.util.PixomiaIdUtils;

@Service
public class KafkaTestConsumer {
    @KafkaListener(groupId = "pixomia", id = "bingo.bongo", topics = "bingo.bongo", autoStartup = "false")
    public void test(final String msg) {
	System.out.println("FETCHED WOPPER  " + PixomiaIdUtils.genHumandReadableId() + " " + msg);
    }

}
