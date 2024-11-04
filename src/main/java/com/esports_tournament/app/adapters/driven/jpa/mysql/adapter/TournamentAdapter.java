package com.esports_tournament.app.adapters.driven.jpa.mysql.adapter;

import com.esports_tournament.app.adapters.driven.jpa.mysql.mapper.ITournamentMapperEntity;
import com.esports_tournament.app.adapters.driven.jpa.mysql.repository.ITournamentRepository;
import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.spi.ITournamentPersistencePort;
import com.esports_tournament.app.domain.utils.ResponsePage;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TournamentAdapter implements ITournamentPersistencePort {

    private final ITournamentRepository tournamentRepository;
    private final ITournamentMapperEntity tournamentMapperEntity;


    @Override
    public void createTournament(Tournament tournament) {
        tournamentRepository.save(tournamentMapperEntity.toTournamentEntity(tournament));
    }

    @Override
    public Tournament getTournament(Long tournamentId) {
        return null;
    }

    @Override
    public ResponsePage getAllTournaments(Integer size, Integer page, String sort, String order) {
        return null;
    }

    @Override
    public void updateTournament(Tournament tournament) {

    }

    @Override
    public void deleteTournament(Tournament tournament) {

    }
}
