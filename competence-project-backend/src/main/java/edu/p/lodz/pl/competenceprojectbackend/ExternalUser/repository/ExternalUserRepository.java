package edu.p.lodz.pl.competenceprojectbackend.ExternalUser.repository;

import edu.p.lodz.pl.competenceprojectbackend.ExternalUser.model.ExternalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalUserRepository extends JpaRepository<ExternalUser, Long> {
}
