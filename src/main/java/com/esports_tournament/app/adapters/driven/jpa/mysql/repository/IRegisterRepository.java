package com.esports_tournament.app.adapters.driven.jpa.mysql.repository;

import com.esports_tournament.app.adapters.driven.jpa.mysql.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegisterRepository extends JpaRepository<TeamEntity, Long> {
    TeamEntity findByName(String name);
}
