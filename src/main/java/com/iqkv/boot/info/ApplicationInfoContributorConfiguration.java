package com.iqkv.boot.info;

import org.springframework.boot.actuate.autoconfigure.info.ConditionalOnEnabledInfoContributor;
import org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@AutoConfigureAfter(InfoContributorAutoConfiguration.class)
@ConditionalOnClass(InfoContributor.class)
public class ApplicationInfoContributorConfiguration {

  /**
   * activeProfilesInfoContributor.
   *
   * @param environment a {@link org.springframework.core.env.ConfigurableEnvironment} object.
   * @return a {@link ActiveProfilesInfoContributor} object.
   */
  @Bean
  @ConditionalOnEnabledInfoContributor("active-profiles")
  public ActiveProfilesInfoContributor activeProfilesInfoContributor(ConfigurableEnvironment environment) {
    return new ActiveProfilesInfoContributor(environment);
  }
}
