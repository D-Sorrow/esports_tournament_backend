package com.esports_tournament.app.adapters.driven.jpa.mysql.adapter;

import com.esports_tournament.app.adapters.driven.jpa.mysql.constants.ConstantsDriven;
import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.TournamentEntity;
import com.esports_tournament.app.adapters.driven.jpa.mysql.mapper.ITournamentMapperEntity;
import com.esports_tournament.app.adapters.driven.jpa.mysql.repository.ITournamentRepository;
import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.spi.ITournamentPersistencePort;
import com.esports_tournament.app.domain.utils.ResponsePage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

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
    public ResponsePage<Tournament> getAllTournaments(Integer size, Integer page, String sort) {

        Sort.Direction direction = Sort.Direction.fromString(sort.toUpperCase());
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction, ConstantsDriven.SORT_NAME_TOURNAMENT));

        return new ResponsePage<>(
                tournamentMapperEntity.toTournaments(tournamentRepository.findAll(pageable).getContent()),
                page,
                size,
                sort
        );
    }

    @Override
    public void updateTournament(Tournament tournament) {

    }

    @Override
    public void deleteTournament(Tournament tournament) {

    }
}
