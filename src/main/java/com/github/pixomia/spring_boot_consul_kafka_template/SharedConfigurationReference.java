package com.github.pixomia.spring_boot_consul_kafka_template;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.pixomia.kafka_util_services")
public class SharedConfigurationReference {

}
