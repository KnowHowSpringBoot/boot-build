package org.iqkv.boot.build;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationBuildInfoProperties.class)
public class BuildInfoConfig {

}
