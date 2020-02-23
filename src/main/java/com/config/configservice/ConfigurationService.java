package com.config.configservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ConfigurationService {
    @Autowired
    ConfigurationRepository configurationRepository;

    Configuration getConfiguration(String key) {
        return configurationRepository.findByConfigKey(key);
    }
}
