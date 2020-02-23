package com.config.configservice;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String configKey;
    private String configType;
    private String configValue;
    private String configDescription;


    Configuration(String configKey, String configType, String configValue, String configDescription) {
        this.configKey = configKey;
        this.configType = configType;
        this.configValue = configValue;
        this.configDescription = configDescription;
    }

    public Configuration() {
    }
}
