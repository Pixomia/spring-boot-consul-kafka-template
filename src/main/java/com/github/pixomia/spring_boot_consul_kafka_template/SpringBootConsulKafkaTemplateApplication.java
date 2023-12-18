package com.github.pixomia.spring_boot_consul_kafka_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableScheduling
@EnableKafka
public class SpringBootConsulKafkaTemplateApplication {

    public static void main(final String[] args) {
	SpringApplication.run(SpringBootConsulKafkaTemplateApplication.class, args);
    }

}
