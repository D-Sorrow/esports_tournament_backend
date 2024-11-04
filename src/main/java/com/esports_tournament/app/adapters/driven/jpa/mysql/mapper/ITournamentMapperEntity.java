package com.esports_tournament.app.adapters.driven.jpa.mysql.mapper;

import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.TournamentEntity;
import com.esports_tournament.app.domain.models.Tournament;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITournamentMapperEntity {

    TournamentEntity toTournamentEntity(Tournament tournament);

    Tournament toTournament(TournamentEntity tournamentEntity);
}
