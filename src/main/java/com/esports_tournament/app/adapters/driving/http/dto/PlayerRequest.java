package com.esports_tournament.app.adapters.driving.http.dto;

import jakarta.validation.constraints.NotNull;

public class PlayerRequest {

    @NotNull
    private String playerName;

    @NotNull
    private String email;

}
