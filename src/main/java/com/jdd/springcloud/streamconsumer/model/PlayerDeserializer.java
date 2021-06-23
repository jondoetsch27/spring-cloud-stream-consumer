package com.jdd.springcloud.streamconsumer.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.util.SerializationUtils;

public class PlayerDeserializer implements Deserializer<Player> {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
    return;
  }

  @Override
  public Player deserialize(String s, byte[] bytes) {
    try {
      String jsonData = new String(bytes, StandardCharsets.UTF_8);
      return objectMapper.readValue(jsonData, Player.class);
    } catch (Exception exception) {
      throw new RuntimeException("Exception: " + exception);
    }
  }

  @Override
  public Player deserialize(String topic, Headers headers, byte[] data) {
    try {
      String jsonData = new String(data, StandardCharsets.UTF_8);
      return objectMapper.readValue(jsonData, Player.class);
    } catch (Exception exception) {
      throw new RuntimeException("Exception: " + exception);
    }
  }

  @Override
  public void close() {
    return;
  }
}
