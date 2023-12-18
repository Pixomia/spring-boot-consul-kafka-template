package com.github.pixomia.spring_boot_consul_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pixomia.util.PixomiaIdUtils;

@Service
public class ConfigedService {

    @Autowired
    private ConfigFromConsul configFromConsul;

    public String fetchConfigedValue() {
	final StringBuilder sb = new StringBuilder();
	sb.append(PixomiaIdUtils.genHumandReadableId());
	sb.append(" ");
	sb.append(configFromConsul.getValueFromConfig());
	return sb.toString();
    }
}
