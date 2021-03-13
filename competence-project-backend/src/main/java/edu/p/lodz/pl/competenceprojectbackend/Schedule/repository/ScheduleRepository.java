package edu.p.lodz.pl.competenceprojectbackend.Schedule.repository;

import edu.p.lodz.pl.competenceprojectbackend.Schedule.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
