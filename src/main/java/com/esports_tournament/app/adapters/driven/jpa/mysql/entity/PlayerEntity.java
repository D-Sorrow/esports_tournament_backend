package com.esports_tournament.app.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerId;

    private String playerName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team;
}
