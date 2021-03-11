package com.example.CompetenceProject.ExternalUser.repository;

import com.example.CompetenceProject.ExternalUser.model.ExternalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalUserRepository extends JpaRepository<ExternalUser, Long> {
}
