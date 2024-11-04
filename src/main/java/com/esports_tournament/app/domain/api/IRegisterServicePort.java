package com.esports_tournament.app.domain.api;

import com.esports_tournament.app.domain.models.Team;

public interface IRegisterServicePort {
    void registerTeam(Long tournamentId, Team team);
}
