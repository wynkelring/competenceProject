package com.example.CompetenceProject.WorkingDay.repository;

import com.example.CompetenceProject.WorkingDay.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {
}
