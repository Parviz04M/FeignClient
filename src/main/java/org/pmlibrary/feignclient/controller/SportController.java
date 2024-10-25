package org.pmlibrary.feignclient.controller;

import org.pmlibrary.feignclient.dto.SportDto;
import org.pmlibrary.feignclient.service.SportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sports")
public class SportController {

    private final SportService sportService;

    public SportController(SportService sportService) {
        this.sportService = sportService;
    }

    @GetMapping
    public List<SportDto> getSport() {
        return sportService.fetchDataFromExternalService();
    }
}
