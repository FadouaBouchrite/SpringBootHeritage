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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type",length = 4)
public abstract class Personne {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
  private String nom;
  @Temporal(TemporalType.DATE)
  private Date dateNaissance;

}
