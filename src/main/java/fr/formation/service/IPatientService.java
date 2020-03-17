package fr.formation.service;

import java.util.List;
import fr.formation.model.Patient;

public interface IPatientService {
	public List<Patient> getAllPatient();
	public Patient createPatient(Patient pa);
	public int deletePatient (long id);
	public Patient getPatient (long id);
}
