package com.example.heritageexemple.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Personne {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
  private String nom;
  @Temporal(TemporalType.DATE)
  private Date dateNaissance;


}
