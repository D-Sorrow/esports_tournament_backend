package com.esports_tournament.app.adapters.driven.jpa.mysql.mapper;

import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.TournamentEntity;
import com.esports_tournament.app.domain.models.Tournament;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITournamentMapperEntity {

    TournamentEntity toTournamentEntity(Tournament tournament);

    List<Tournament> toTournaments(List<TournamentEntity> tournaments);

    Tournament toTournament(TournamentEntity tournamentEntity);
}
