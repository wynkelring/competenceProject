package com.example.CompetenceProject.InternalCompanyBranch.repository;

import com.example.CompetenceProject.InternalCompanyBranch.model.InternalCompanyBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalCompanyBranchRepository extends JpaRepository<InternalCompanyBranch, Long> {
}
