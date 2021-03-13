package edu.p.lodz.pl.competenceprojectbackend.WorkingDay.repository;

import edu.p.lodz.pl.competenceprojectbackend.WorkingDay.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {
}
