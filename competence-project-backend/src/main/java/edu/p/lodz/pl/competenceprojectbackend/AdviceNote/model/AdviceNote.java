package edu.p.lodz.pl.competenceprojectbackend.AdviceNote.model;

import edu.p.lodz.pl.competenceprojectbackend.Car.model.Car;
import edu.p.lodz.pl.competenceprojectbackend.ExternalUser.model.ExternalUser;
import edu.p.lodz.pl.competenceprojectbackend.InternalCompanyBranch.model.InternalCompanyBranch;
import edu.p.lodz.pl.competenceprojectbackend.WorkingDaySchedule.model.WorkingDaySchedule;
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
