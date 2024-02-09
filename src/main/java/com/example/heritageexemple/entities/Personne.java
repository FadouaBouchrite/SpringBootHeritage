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
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
    //il faut pas mettre .IDENTITY
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
  private String nom;
  @Temporal(TemporalType.DATE)
  private Date dateNaissance;



}
