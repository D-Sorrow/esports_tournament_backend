package com.esports_tournament.app.domain.spi;

import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.utils.ResponsePage;

public interface ITournamentPersistencePort {

    void createTournament(Tournament tournament);
    Tournament getTournament(Long tournamentId);
    ResponsePage<Tournament> getAllTournaments(Integer size, Integer page, String sort);
    void updateTournament(Tournament tournament);
    void deleteTournament(Tournament tournament);
}
