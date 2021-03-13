package edu.p.lodz.pl.competenceprojectbackend.InternalCompanyBranch.repository;

import edu.p.lodz.pl.competenceprojectbackend.InternalCompanyBranch.model.InternalCompanyBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalCompanyBranchRepository extends JpaRepository<InternalCompanyBranch, Long> {
}
