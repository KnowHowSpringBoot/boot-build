package org.iqkv.boot.build;

import jakarta.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("iqkv.clientApp")
public record ClientApplicationProperties(@NotNull String name) {

  public String getName() {
    return name();
  }
}
