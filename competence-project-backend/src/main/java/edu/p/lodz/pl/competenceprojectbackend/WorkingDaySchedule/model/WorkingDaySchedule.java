package edu.p.lodz.pl.competenceprojectbackend.WorkingDaySchedule.model;

import edu.p.lodz.pl.competenceprojectbackend.Schedule.model.Schedule;
import edu.p.lodz.pl.competenceprojectbackend.WorkingDay.model.WorkingDay;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class WorkingDaySchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private WorkingDay workingDay;

    @ManyToOne
    private Schedule schedule;

    @NotNull
    private Boolean cancelled = false;
}
