package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Patient;

public interface IpatientRepository extends JpaRepository<Patient, Long> {

}
