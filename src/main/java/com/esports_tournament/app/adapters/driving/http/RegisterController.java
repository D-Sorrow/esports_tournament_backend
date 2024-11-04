package com.esports_tournament.app.adapters.driving.http;


import com.esports_tournament.app.adapters.driving.http.mapper.ITeamMapperRequest;
import com.esports_tournament.app.domain.api.IRegisterServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegisterController {

    private final IRegisterServicePort registerService;
    private final ITeamMapperRequest teamMapperRequest;
}
