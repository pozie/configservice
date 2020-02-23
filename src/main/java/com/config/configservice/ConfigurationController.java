package com.config.configservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {
    @Autowired
    private ConfigurationService configurationService;

    @GetMapping("/config/{configKey}")
    public Configuration getConfiguration(@PathVariable(name = "configKey") String configKey) {

        return configurationService.getConfiguration(configKey);
    }
}
