package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Hopital;

public interface IHopitalRepository extends JpaRepository<Hopital, Long> {

}
