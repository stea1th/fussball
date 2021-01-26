package de.stea1th.fussballserver.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_result")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Result extends BaseEntity {

    @Column(name = "draw")
    private boolean draw;

    @OneToMany(mappedBy = "result", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Game> gameList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "winner", insertable = false, updatable = false)
    @JsonBackReference
    private Team winner;

    @ManyToOne
    @JoinColumn(name = "looser", insertable = false, updatable = false)
    @JsonBackReference
    private Team looser;

}
