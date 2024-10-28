package com.esports_tournament.app.configuration.bean;

import com.esports_tournament.app.adapters.driven.jpa.mysql.adapter.TournamentAdapter;
import com.esports_tournament.app.adapters.driven.jpa.mysql.mapper.ITournamentMapperEntity;
import com.esports_tournament.app.adapters.driven.jpa.mysql.repository.ITournamentRepository;
import com.esports_tournament.app.domain.api.ITournamentServicePort;
import com.esports_tournament.app.domain.api.usecase.TournamentUseCase;
import com.esports_tournament.app.domain.spi.ITournamentPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITournamentMapperEntity tournamentMapperEntity;
    private final ITournamentRepository tournamentRepository;

    @Bean
    public ITournamentPersistencePort tournamentPersistencePort() {
        return new TournamentAdapter(tournamentRepository, tournamentMapperEntity);
    }

    @Bean
    public ITournamentServicePort tournamentServicePort() {
        return new TournamentUseCase(tournamentPersistencePort());
    }
}
