package com.esports_tournament.app.domain.api.usecase;

import com.esports_tournament.app.domain.api.IRegisterServicePort;
import com.esports_tournament.app.domain.models.Team;
import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.spi.IRegisterPersistencePort;
import com.esports_tournament.app.domain.spi.ITournamentPersistencePort;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class RegisterUseCase  implements IRegisterServicePort {

    private final IRegisterPersistencePort persistencePort;
    private final ITournamentPersistencePort tournamentPort;

    public RegisterUseCase(IRegisterPersistencePort persistencePort, ITournamentPersistencePort tournamentPort) {
        this.persistencePort = persistencePort;
        this.tournamentPort = tournamentPort;
    }

    @Override
    public void registerTeam(Long tournamentId, Team team) {
        Team teamDef = persistencePort.getTeam(team.getTeamName());
        if( teamDef != null) {

            tournamentPort.getTournament(tournamentId);
        }


        persistencePort.registerTeam(team);
    }

    public boolean validationDate(Tournament tournamentNow, List<Tournament> tournaments) {
        for (Tournament tournament : tournaments) {
            if (tournamentNow.getStartDate().isBefore(tournament.getStartDate()) &&
                    tournamentNow.getEndDate().isAfter(tournament.getEndDate())  ) {
                return false;
            }
        }
        return true;
    }
}
