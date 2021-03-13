package edu.p.lodz.pl.competenceprojectbackend.ExternalUser.model;

import edu.p.lodz.pl.competenceprojectbackend.ExternalCompany.model.ExternalCompany;
import edu.p.lodz.pl.competenceprojectbackend.Global.Inheritance.Person;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ExternalUser extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ExternalCompany externalCompany;
}
