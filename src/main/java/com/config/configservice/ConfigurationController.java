package com.config.configservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConfigurationController {
    @Autowired
    private ConfigurationService configurationService;

    @GetMapping("/config/{configKey}")
    public Configuration getConfiguration(@PathVariable(name = "configKey") String configKey) {

        return configurationService.getConfiguration(configKey);
    }

    @GetMapping("/config")
    public List<Configuration> getAllConfigurations() {
        return configurationService.getAllConfigurations();
    }

    @PostMapping("/config")
    public Configuration createOrUpdateConfiguraion(Configuration configuration) {
        return configurationService.createOrUpdateConfiguration(configuration);
    }

    @DeleteMapping("config/{configKey}")
    @Transactional
    public void deleteConfiguration(@PathVariable(name = "configKey") String configKey) {
        configurationService.deleteConfiguration(configKey);
    }
}
