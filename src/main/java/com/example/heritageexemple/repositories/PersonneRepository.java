package com.example.heritageexemple.repositories;

import com.example.heritageexemple.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
