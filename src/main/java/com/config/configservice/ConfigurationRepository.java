package com.config.configservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {

    Configuration findByConfigKey(String configKey);

    List<Configuration> findAll();

    Configuration save(Configuration configuration);

    @Transactional
    void deleteByConfigKey(String configKey);

}
