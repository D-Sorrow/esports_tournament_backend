package com.esports_tournament.app.adapters.driven.jpa.mysql.repository;

import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.TournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITournamentRepository extends JpaRepository<TournamentEntity, Long> {
}
