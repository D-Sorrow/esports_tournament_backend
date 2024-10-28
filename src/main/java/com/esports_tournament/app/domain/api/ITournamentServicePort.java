package com.esports_tournament.app.domain.api;

import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.utils.ResponsePage;

public interface ITournamentServicePort {

    void createTournament(Tournament tournament);
    Tournament getTournament(Long tournamentId);
    ResponsePage getAllTournaments(Integer size, Integer page, String sort, String order);
    void updateTournament(Tournament tournament);
    void deleteTournament(Tournament tournament);
}