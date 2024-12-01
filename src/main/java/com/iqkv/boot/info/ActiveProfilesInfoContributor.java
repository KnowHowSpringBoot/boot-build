package com.iqkv.boot.info;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * An {@link org.springframework.boot.actuate.info.InfoContributor} that exposes the list of active spring profiles.
 */
public class ActiveProfilesInfoContributor implements InfoContributor {

  private static final String ACTIVE_PROFILES = "activeProfiles";
  private final List<String> profiles;

  /**
   * <p>Constructor for ActiveProfilesInfoContributor.</p>
   *
   * @param environment a {@link org.springframework.core.env.ConfigurableEnvironment} object.
   */
  public ActiveProfilesInfoContributor(ConfigurableEnvironment environment) {
    profiles = Arrays.asList(
        environment.getActiveProfiles().length == 0 ? environment.getDefaultProfiles() : environment.getActiveProfiles()
    );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void contribute(Info.Builder builder) {
    builder.withDetail(ACTIVE_PROFILES, profiles);
  }
}
