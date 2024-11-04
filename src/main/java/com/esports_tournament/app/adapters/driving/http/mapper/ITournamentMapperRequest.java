package com.esports_tournament.app.adapters.driving.http.mapper;

import com.esports_tournament.app.adapters.driving.http.dto.TournamentRequest;
import com.esports_tournament.app.domain.models.Tournament;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITournamentMapperRequest {

    Tournament toTournament(TournamentRequest tournamentRequest);

}
