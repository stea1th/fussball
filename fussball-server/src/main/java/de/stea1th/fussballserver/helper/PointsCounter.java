package de.stea1th.fussballserver.helper;

import de.stea1th.fussballserver.dto.RowDto;
import de.stea1th.fussballserver.entity.Team;
import de.stea1th.fussballserver.enums.ResultState;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PointsCounter {

    public void count(List<Team> teamList, ResultState resultState) {
        List<RowDto> collect = teamList.stream()
                .map(t -> new RowDto(t.getId(), t, getPoints(resultState))).collect(Collectors.toList());

    }


    private int getPoints(ResultState resultState) {
        switch (resultState) {
            case WIN:
                return 3;
            case LOSE:
                return 0;
            case DRAW:
            default:
                return 1;
        }
    }

//    private List<RowDto> reduce(List<RowDto> collect) {
//        List<RowDto> rowDtoList = new ArrayList<>();
//        collect.forEach(r-> {
//            rowDtoList.stream().anyMatch(l-> l.getId() == )
//        });
//
////        for (RowDto row : collect) {
////            collect.forEach(r -> {
////                if(rowDtoList.contains() == )
////            });
//
////                    .filter(r -> {
////                        if (r.getTeam().getId() == row.getTeam().getId()) {
////                            r.setPoints(r.getPoints() + row.getPoints());
////                        } else {
////
////
////                        }
////                    })
//
////        }
//    }

}
