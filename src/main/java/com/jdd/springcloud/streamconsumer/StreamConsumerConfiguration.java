package com.jdd.springcloud.streamconsumer;

import com.jdd.springcloud.streamconsumer.model.Player;
import java.util.Arrays;
import java.util.function.Consumer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StreamConsumerConfiguration {

  @Bean
  @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
  public Consumer<Player> consumer() {
    return payload -> System.out.println("Data Received: " + payload.getPlayerId());
  }
}
