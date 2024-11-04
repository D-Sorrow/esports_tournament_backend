package com.esports_tournament.app.configuration.bean;

import com.esports_tournament.app.adapters.driven.jpa.mysql.adapter.RegisterAdapter;
import com.esports_tournament.app.adapters.driven.jpa.mysql.adapter.TournamentAdapter;
import com.esports_tournament.app.adapters.driven.jpa.mysql.mapper.ITeamMapperEntity;
import com.esports_tournament.app.adapters.driven.jpa.mysql.mapper.ITournamentMapperEntity;
import com.esports_tournament.app.adapters.driven.jpa.mysql.repository.IRegisterRepository;
import com.esports_tournament.app.adapters.driven.jpa.mysql.repository.ITournamentRepository;
import com.esports_tournament.app.domain.api.IRegisterServicePort;
import com.esports_tournament.app.domain.api.ITournamentServicePort;
import com.esports_tournament.app.domain.api.usecase.RegisterUseCase;
import com.esports_tournament.app.domain.api.usecase.TournamentUseCase;
import com.esports_tournament.app.domain.spi.IRegisterPersistencePort;
import com.esports_tournament.app.domain.spi.ITournamentPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITournamentMapperEntity tournamentMapperEntity;
    private final ITournamentRepository tournamentRepository;
    private final ITeamMapperEntity teamMapperEntity;
    private final IRegisterRepository registerRepository;

    @Bean
    public ITournamentPersistencePort tournamentPersistencePort() {
        return new TournamentAdapter(tournamentRepository, tournamentMapperEntity);
    }

    @Bean
    public ITournamentServicePort tournamentServicePort() {
        return new TournamentUseCase(tournamentPersistencePort());
    }

    @Bean
    public IRegisterPersistencePort registerPersistencePort() {
        return new RegisterAdapter(registerRepository, teamMapperEntity);
    }

    @Bean
    public IRegisterServicePort registerServicePort() {
        return new RegisterUseCase(registerPersistencePort(), tournamentPersistencePort());
    }
}
