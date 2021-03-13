package edu.p.lodz.pl.competenceprojectbackend.ExternalCompany.repository;

import edu.p.lodz.pl.competenceprojectbackend.ExternalCompany.model.ExternalCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalCompanyRepository extends JpaRepository<ExternalCompany, Long> {
}
