package com.github.pixomia.spring_boot_consul_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
public class SpringBootConsulTemplateApplication {

    public static void main(final String[] args) {
	SpringApplication.run(SpringBootConsulTemplateApplication.class, args);
    }

}
