package edu.p.lodz.pl.competenceprojectbackend.User.model;

import edu.p.lodz.pl.competenceprojectbackend.Global.Inheritance.Person;
import edu.p.lodz.pl.competenceprojectbackend.InternalCompanyBranch.model.InternalCompanyBranch;
import edu.p.lodz.pl.competenceprojectbackend.Role.model.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class User extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private Set<Role> roles;

    @ManyToOne
    private InternalCompanyBranch companyBranch;

}
