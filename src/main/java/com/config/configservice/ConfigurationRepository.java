package com.config.configservice;

import org.springframework.data.repository.CrudRepository;

public interface ConfigurationRepository extends CrudRepository<Configuration,Long> {

    Configuration findByConfigKey(String configKey);
}
