package edu.p.lodz.pl.competenceprojectbackend.AdviceNote.repository;

import edu.p.lodz.pl.competenceprojectbackend.AdviceNote.model.AdviceNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviceNoteRepository extends JpaRepository<AdviceNote, Long> {
}
