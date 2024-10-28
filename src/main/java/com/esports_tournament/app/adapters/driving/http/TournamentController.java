package com.esports_tournament.app.adapters.driving.http;

import com.esports_tournament.app.adapters.driving.http.dto.TournamentRequest;
import com.esports_tournament.app.adapters.driving.http.dto.TournamentResponse;
import com.esports_tournament.app.adapters.driving.http.mapper.ITournamentMapperRequest;
import com.esports_tournament.app.domain.api.ITournamentServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournament")
@RequiredArgsConstructor
public class TournamentController {

    private final ITournamentMapperRequest tournamentMapperRequest;
    private final ITournamentServicePort tournamentServicePort;

    @PostMapping("/addTournament")
    public ResponseEntity<Void> addTournament(@RequestBody TournamentRequest tournamentRequest) {

        tournamentServicePort.createTournament(tournamentMapperRequest.toTournament(tournamentRequest));

        return ResponseEntity.ok().build();
    }
}
