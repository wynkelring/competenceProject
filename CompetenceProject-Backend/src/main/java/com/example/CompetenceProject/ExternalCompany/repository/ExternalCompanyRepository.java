package com.example.CompetenceProject.ExternalCompany.repository;

import com.example.CompetenceProject.ExternalCompany.model.ExternalCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalCompanyRepository extends JpaRepository<ExternalCompany, Long> {
}
