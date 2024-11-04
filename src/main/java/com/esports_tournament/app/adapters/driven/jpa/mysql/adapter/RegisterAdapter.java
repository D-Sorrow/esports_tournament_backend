package com.esports_tournament.app.adapters.driven.jpa.mysql.adapter;

import com.esports_tournament.app.adapters.driven.jpa.mysql.mapper.ITeamMapperEntity;
import com.esports_tournament.app.adapters.driven.jpa.mysql.repository.IRegisterRepository;
import com.esports_tournament.app.domain.models.Team;
import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.spi.IRegisterPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegisterAdapter  implements IRegisterPersistencePort {

    private final IRegisterRepository repository;
    private final ITeamMapperEntity teamMapperEntity;

    @Override
    public void registerTeam(Team team) {
        repository.save(teamMapperEntity.toTeamEntity(team));
    }

    @Override
    public Team getTeam(String teamName) {
        return teamMapperEntity.toTeam(repository.findByName(teamName));
    }
}
