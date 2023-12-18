package com.github.pixomia.spring_boot_consul_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class BackgroundTaskker {
    @Autowired
    private ConfigedService configedService;

    @Scheduled(fixedDelay = 1000)
    public void backGroundTassker() {
	BackgroundTaskker.log.atDebug().log("Start background Task");
	System.out.println(configedService.fetchConfigedValue());
	BackgroundTaskker.log.atDebug().log("End background Task");
    }
}
