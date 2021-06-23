package com.jdd.springcloud.streamconsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player implements Serializable {

  @JsonProperty("player_id")
  private String playerId;

  @JsonProperty("player_first_name")
  private String playerFirstName;

  @JsonProperty("player_last_name")
  private String playerLastName;

  @JsonProperty("player_number")
  private String playerNumber;

  public Player(String playerId, String playerFirstName, String playerLastName,
      String playerNumber) {
    this.playerId = playerId;
    this.playerFirstName = playerFirstName;
    this.playerLastName = playerLastName;
    this.playerNumber = playerNumber;
  }

  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public String getPlayerFirstName() {
    return playerFirstName;
  }

  public void setPlayerFirstName(String playerFirstName) {
    this.playerFirstName = playerFirstName;
  }

  public String getPlayerLastName() {
    return playerLastName;
  }

  public void setPlayerLastName(String playerLastName) {
    this.playerLastName = playerLastName;
  }

  public String getPlayerNumber() {
    return playerNumber;
  }

  public void setPlayerNumber(String playerNumber) {
    this.playerNumber = playerNumber;
  }
}
