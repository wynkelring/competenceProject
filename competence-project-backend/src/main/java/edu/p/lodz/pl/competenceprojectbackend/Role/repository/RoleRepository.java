package edu.p.lodz.pl.competenceprojectbackend.Role.repository;

import edu.p.lodz.pl.competenceprojectbackend.Role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
