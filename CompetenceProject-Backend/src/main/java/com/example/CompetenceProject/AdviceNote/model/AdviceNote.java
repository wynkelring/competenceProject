package com.example.CompetenceProject.AdviceNote.model;

import com.example.CompetenceProject.Car.model.Car;
import com.example.CompetenceProject.ExternalUser.model.ExternalUser;
import com.example.CompetenceProject.InternalCompanyBranch.model.InternalCompanyBranch;
import com.example.CompetenceProject.WorkingDaySchedule.model.WorkingDaySchedule;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class AdviceNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ExternalUser externalUser;

    @NotNull
    private Boolean completed;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ArrivalPurpose arrivalPurpose;

    @NotNull
    private LocalDateTime registrationDate;

    private String remarks;

    @ManyToOne
    private Car car;

    @ManyToOne
    private InternalCompanyBranch companyBranch;

    @ManyToOne
    private WorkingDaySchedule workingDaySchedule;
}
