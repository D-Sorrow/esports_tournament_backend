package com.esports_tournament.app.adapters.driving.http.dto;

import com.esports_tournament.app.adapters.driving.http.constants.ControllerConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentRequest {

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private String name;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private LocalDate startDate;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private LocalDate endDate;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private String description;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private Integer minTeamSize;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private Integer minParticipants;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private Integer maxParticipants;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private String gameType;

    @NotNull(message = ControllerConstants.NOT_NULL_MESSAGE_DTO_TOURNAMENT)
    private String status;
}
