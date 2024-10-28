package com.esports_tournament.app.domain.models;

import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.GameType;
import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.TournamentStatus;

import java.time.LocalDate;

public class Tournament {

    private Long tournamentId;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private String description;

    private Integer minTeamSize;

    private Integer minParticipants;

    private Integer maxParticipants;

    private String gameType;

    private String status;

    public Tournament(Long tournamentId, String name, LocalDate startDate, LocalDate endDate, String description,
                      Integer minTeamSize, Integer minParticipants, Integer maxParticipants, String gameType,
                      String status) {
        this.tournamentId = tournamentId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.minTeamSize = minTeamSize;
        this.minParticipants = minParticipants;
        this.maxParticipants = maxParticipants;
        this.gameType = gameType;
        this.status = status;
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinTeamSize() {
        return minTeamSize;
    }

    public void setMinTeamSize(Integer minTeamSize) {
        this.minTeamSize = minTeamSize;
    }

    public Integer getMinParticipants() {
        return minParticipants;
    }

    public void setMinParticipants(Integer minParticipants) {
        this.minParticipants = minParticipants;
    }

    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
