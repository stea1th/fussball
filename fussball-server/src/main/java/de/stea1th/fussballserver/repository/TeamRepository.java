package de.stea1th.fussballserver.repository;

import de.stea1th.fussballserver.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("select t1 from Team t1 where exists ( select t from Result r left join Game g on r = g.result " +
            " left join Team t on t = g.homeTeam where r.draw = true) or exists ( select t from Result r left join Game g on r = g.result " +
            " left join Team t on t = g.guestTeam where r.draw = true) ")
    List<Team> getAllDrawTeams();

    @Query("select t from Team t left join Result r on t = r.winner " +
            "where r.winner is not null and t = r.winner ")
    List<Team> getAllWinnerTeams();

    @Query("select t from Team t left join Result r on t = r.looser " +
            "where r.looser is not null and t = r.looser ")
    List<Team> getAllLooserTeams();
}
