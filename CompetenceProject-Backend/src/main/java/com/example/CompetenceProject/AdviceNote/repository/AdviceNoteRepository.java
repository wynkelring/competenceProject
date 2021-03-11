package com.example.CompetenceProject.AdviceNote.repository;

import com.example.CompetenceProject.AdviceNote.model.AdviceNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviceNoteRepository extends JpaRepository<AdviceNote, Long> {
}
