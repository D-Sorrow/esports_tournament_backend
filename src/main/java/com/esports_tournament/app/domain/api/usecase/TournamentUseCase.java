package com.esports_tournament.app.domain.api.usecase;

import com.esports_tournament.app.domain.api.ITournamentServicePort;
import com.esports_tournament.app.domain.constants.ConstantsDomain;
import com.esports_tournament.app.domain.exception.FieldEmptyException;
import com.esports_tournament.app.domain.exception.NumberInvalid;
import com.esports_tournament.app.domain.exception.StartDateException;
import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.spi.ITournamentPersistencePort;
import com.esports_tournament.app.domain.utils.ResponsePage;

public class TournamentUseCase implements ITournamentServicePort {

    private final ITournamentPersistencePort tournamentPersistencePort;

    public TournamentUseCase(ITournamentPersistencePort tournamentPersistencePort) {
        this.tournamentPersistencePort = tournamentPersistencePort;
    }

    @Override
    public void createTournament(Tournament tournament) {
        if(!tournament.getStartDate().isBefore(tournament.getEndDate())) {
            throw new StartDateException(ConstantsDomain.START_DATE_EXCEPTION_MESSAGE);
        }
        if (tournament.getMaxParticipants() <= ConstantsDomain.ZERO_CONSTANTS ||
                tournament.getMinParticipants() <= ConstantsDomain.ZERO_CONSTANTS) {
            throw new NumberInvalid(ConstantsDomain.NUMBER_OF_PARTICIPANT_INVALID);
        }
        if (tournament.getMinTeamSize() != null && tournament.getMinTeamSize() <= ConstantsDomain.ZERO_CONSTANTS) {
            throw new NumberInvalid(ConstantsDomain.NUMBER_OF_PARTICIPANT_INVALID);
        }

        validatorEmpty(tournament.getDescription());
        validatorEmpty(tournament.getName());
        validatorEmpty(tournament.getGameType());
        validatorEmpty(tournament.getStatus());

        tournamentPersistencePort.createTournament(tournament);
    }

    @Override
    public Tournament getTournament(Long tournamentId) {
        return null;
    }

    @Override
    public ResponsePage<Tournament> getAllTournaments(Integer size, Integer page, String sort) {
        return tournamentPersistencePort.getAllTournaments(size, page, sort);
    }

    @Override
    public void updateTournament(Tournament tournament) {

    }

    @Override
    public void deleteTournament(Tournament tournament) {

    }

    public boolean validatorEmpty(String argumentToValidate) {
        if(argumentToValidate.isEmpty()) {
            throw new FieldEmptyException(ConstantsDomain.FIELD_IS_EMPTY_MESSAGE);
        }
        return true;
    }
}
