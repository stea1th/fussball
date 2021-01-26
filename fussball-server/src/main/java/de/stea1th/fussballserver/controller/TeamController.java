package de.stea1th.fussballserver.controller;

import de.stea1th.fussballserver.entity.Team;
import de.stea1th.fussballserver.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Team> get(@PathVariable Long id) {
        return new ResponseEntity<>(teamService.get(id), HttpStatus.OK);
    }


}
