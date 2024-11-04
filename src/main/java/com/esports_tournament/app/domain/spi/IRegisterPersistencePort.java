package com.esports_tournament.app.domain.spi;

import com.esports_tournament.app.domain.models.Team;
import com.esports_tournament.app.domain.models.Tournament;

public interface IRegisterPersistencePort {
    void registerTeam(Team team);
    Team getTeam(String teamName);
}
