package com.example.CompetenceProject.User.model;

import com.example.CompetenceProject.Global.Inheritance.Person;
import com.example.CompetenceProject.InternalCompanyBranch.model.InternalCompanyBranch;
import com.example.CompetenceProject.Role.model.Role;
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
