package com.jdd.springcloud.streamconsumer.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.util.SerializationUtils;

public class PlayerDeserializer implements Deserializer<Player> {

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
    return;
  }

  @Override
  public Player deserialize(String s, byte[] bytes) {
    System.out.println("Raw Data: " + Arrays.toString(bytes));
    return new Player("JoshAllen17", "Josh","Allen", "17");
  }

  @Override
  public Player deserialize(String topic, Headers headers, byte[] data) {
    System.out.println("Raw Data: " + Arrays.toString(data));
    return new Player("JoshAllen17", "Josh","Allen", "17");
  }

  @Override
  public void close() {
    return;
  }
}
