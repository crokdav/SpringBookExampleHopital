package fr.formation.service;

import java.util.List;

import fr.formation.model.Medecin;

public interface IMedecinService {
public List<Medecin> getAllMedecin();
public Medecin createMedecin(Medecin med);
public int deleteMedecin (long id);
public Medecin getMedecin (long id);
}
