package com.esports_tournament.app.adapters.driving.http.mapper;

import com.esports_tournament.app.adapters.driving.http.dto.TeamRequest;
import com.esports_tournament.app.domain.models.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITeamMapperRequest {

    Team toTeam(TeamRequest teamRequest);
}
