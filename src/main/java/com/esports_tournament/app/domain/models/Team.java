package com.esports_tournament.app.domain.models;



import java.util.ArrayList;
import java.util.List;

public class Team {

    private Long teamId;
    private String teamName;

    private List<Player> players;
    private List<Tournament> tournamentList;

    public Team(List<Player> players, Long teamId, String teamName, List<Tournament> tournamentList) {
        this.players = players;
        this.teamId = teamId;
        this.teamName = teamName;
        this.tournamentList = tournamentList;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Tournament> getTournamentList() {
        return tournamentList;
    }

    public void setTournamentList(List<Tournament> tournamentList) {
        this.tournamentList = tournamentList;
    }
}
