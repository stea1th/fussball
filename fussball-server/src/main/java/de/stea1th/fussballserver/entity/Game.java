package de.stea1th.fussballserver.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_game")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Game extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "home_team_id", insertable = false, updatable = false)
    @JsonBackReference
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "guest_team_id", insertable = false, updatable = false)
    @JsonBackReference
    private Team guestTeam;

    @ManyToOne
    @JoinColumn(name = "result_id", insertable = false, updatable = false)
    @JsonBackReference
    private Result result;
}
