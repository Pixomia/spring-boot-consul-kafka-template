package com.github.pixomia.spring_boot_consul_template;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Getter
@RefreshScope
@Configuration
public class ConfigFromConsul {
    @Value(value = "${value.from.config}")
    String valueFromConfig;
}
