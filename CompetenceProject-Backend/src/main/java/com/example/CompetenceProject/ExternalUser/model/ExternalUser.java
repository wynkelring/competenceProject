package com.example.CompetenceProject.ExternalUser.model;

import com.example.CompetenceProject.ExternalCompany.model.ExternalCompany;
import com.example.CompetenceProject.Global.Inheritance.Person;
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
