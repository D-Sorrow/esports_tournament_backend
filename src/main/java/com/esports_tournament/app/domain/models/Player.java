package com.esports_tournament.app.domain.models;


public class Player {

    private Long playerId;
    private String playerName;
    private String email;

    public Player(String email, Long playerId, String playerName) {
        this.email = email;
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
