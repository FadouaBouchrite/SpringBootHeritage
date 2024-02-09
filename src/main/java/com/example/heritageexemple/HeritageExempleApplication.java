package com.example.heritageexemple;

import com.example.heritageexemple.entities.Enseignant;
import com.example.heritageexemple.entities.Etudiant;
import com.example.heritageexemple.repositories.PersonneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HeritageExempleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeritageExempleApplication.class, args);
    }
@Bean
    CommandLineRunner start(PersonneRepository personneRepository){

        return args->{

            Etudiant etudiant =new Etudiant();
            etudiant.setNom("amira");
            etudiant.setDateNaissance(new Date(2002-1900,7,12));
            etudiant.setNote(13.0);
             personneRepository.save(etudiant);
            Enseignant enseignant=new Enseignant();
            enseignant.setDateNaissance(new Date());
            enseignant.setMatiere("math");
            enseignant.setNom("amina");
            personneRepository.save(enseignant);
        };

}
}
