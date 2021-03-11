package com.example.CompetenceProject.WorkingDaySchedule.model;

import com.example.CompetenceProject.Schedule.model.Schedule;
import com.example.CompetenceProject.WorkingDay.model.WorkingDay;
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
