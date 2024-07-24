package org.iqkv.boot.build;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ApplicationBuildInfoProperties.class, ClientApplicationProperties.class})
public class BuildInfoConfig {

}
