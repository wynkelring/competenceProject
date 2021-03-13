package edu.p.lodz.pl.competenceprojectbackend.User.repository;

import edu.p.lodz.pl.competenceprojectbackend.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
