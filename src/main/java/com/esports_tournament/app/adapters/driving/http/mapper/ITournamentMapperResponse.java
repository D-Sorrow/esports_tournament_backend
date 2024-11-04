package com.esports_tournament.app.adapters.driving.http.mapper;

import com.esports_tournament.app.adapters.driving.http.dto.TournamentResponse;
import com.esports_tournament.app.domain.models.Tournament;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITournamentMapperResponse {

    List<TournamentResponse> toTournamentResponses(List<Tournament> tournaments);
    TournamentResponse toTournamentResponse(Tournament tournament);
}
