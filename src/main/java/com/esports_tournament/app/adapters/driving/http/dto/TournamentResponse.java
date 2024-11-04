package com.esports_tournament.app.adapters.driving.http.dto;

import com.esports_tournament.app.adapters.driving.http.constants.ControllerConstants;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentResponse {
    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private String description;

    private Integer minTeamSize;

    private Integer minParticipants;

    private Integer maxParticipants;

    private String gameType;

    private String status;
}
