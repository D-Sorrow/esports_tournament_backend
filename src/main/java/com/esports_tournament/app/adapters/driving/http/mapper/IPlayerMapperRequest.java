package com.esports_tournament.app.adapters.driving.http.mapper;

import com.esports_tournament.app.adapters.driving.http.dto.PlayerRequest;
import com.esports_tournament.app.domain.models.Player;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPlayerMapperRequest {

    Player toPlayer(PlayerRequest playerRequest);
}
