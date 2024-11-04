package com.esports_tournament.app.adapters.driving.http;

import com.esports_tournament.app.adapters.driving.http.dto.TournamentRequest;
import com.esports_tournament.app.adapters.driving.http.dto.TournamentResponse;
import com.esports_tournament.app.adapters.driving.http.mapper.ITournamentMapperRequest;
import com.esports_tournament.app.adapters.driving.http.mapper.ITournamentMapperResponse;
import com.esports_tournament.app.domain.api.ITournamentServicePort;
import com.esports_tournament.app.domain.models.Tournament;
import com.esports_tournament.app.domain.utils.ResponsePage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tournament")
@RequiredArgsConstructor
public class TournamentController {

    private final ITournamentMapperRequest tournamentMapperRequest;
    private final ITournamentMapperResponse tournamentMapperResponse;
    private final ITournamentServicePort tournamentServicePort;

    @PostMapping("/addTournament")
    public ResponseEntity<Void> addTournament(@RequestBody TournamentRequest tournamentRequest) {

        tournamentServicePort.createTournament(tournamentMapperRequest.toTournament(tournamentRequest));

        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAllTournaments")
    public ResponsePage<TournamentResponse> getAllTournaments(@RequestParam Integer size,
                                          @RequestParam Integer page,
                                          @RequestParam String sort) {

        ResponsePage<Tournament> responsePage =  tournamentServicePort.getAllTournaments(size, page, sort);

        return new ResponsePage<>(
                tournamentMapperResponse.toTournamentResponses(responsePage.getCollention()),
                responsePage.getPage(),
                responsePage.getSize(),
                responsePage.getSort()
        );
    }
}
