package com.config.configservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
class ConfigurationService {
    @Autowired
    ConfigurationRepository configurationRepository;

    Configuration getConfiguration(String key) {
        return configurationRepository.findByConfigKey(key);
    }

    List<Configuration> getAllConfigurations() {
        return configurationRepository.findAll();
    }

    @Transactional
    void deleteConfiguration(String key) {
        configurationRepository.deleteByConfigKey(key);
    }

    Configuration createOrUpdateConfiguration(Configuration configuration) {
        return configurationRepository.save(configuration);
    }
}
