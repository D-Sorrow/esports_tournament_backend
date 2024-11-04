package com.esports_tournament.app.adapters.driven.jpa.mysql.mapper;

import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.TeamEntity;
import com.esports_tournament.app.domain.models.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITeamMapperEntity {

    TeamEntity toTeamEntity(Team team);
    Team toTeam(TeamEntity teamEntity);
}
