package de.stea1th.fussballserver.service;

import de.stea1th.fussballserver.entity.Team;
import de.stea1th.fussballserver.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team get(long id) {
        return teamRepository.getOne(id);
    }

//    @Override
//    public Map<Team, Integer> getResultTable() {
//        List<Team> allWinnerTeams = teamRepository.getAllWinnerTeams();
//        List<Team> allLooserTeams = teamRepository.getAllLooserTeams();
//        List<Team> allDrawTeams = teamRepository.getAllDrawTeams();
//
//
//    }
}
