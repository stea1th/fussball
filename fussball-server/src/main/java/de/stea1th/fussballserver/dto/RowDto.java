package de.stea1th.fussballserver.dto;

import de.stea1th.fussballserver.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class RowDto {


    private Long id;
    private Team team;
    private int points = 0;
}
