package com.iqkv.boot.info;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties({ApplicationBuildInfoProperties.class, ClientApplicationProperties.class})
@Import(ApplicationInfoContributorConfiguration.class)
public class BuildInfoConfig {

}
