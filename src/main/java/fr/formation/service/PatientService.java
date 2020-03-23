package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.formation.model.Medecin;
import fr.formation.model.Patient;
import fr.formation.repository.IMedecinRepository;
import fr.formation.repository.IpatientRepository;

@Service
public class PatientService implements IPatientService {

	@Autowired
	IpatientRepository patientrepository;

	@Autowired
	IMedecinRepository medecinRepository;

	@Override
	public List<Patient> getAllPatient() {
		try {
			return patientrepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Patient createPatient(Patient pa) {
		try {
			return patientrepository.save(pa);
			
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int deletePatient(long id) {
		try {
			patientrepository.deleteById(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}


	@Override
	public Patient getPatient(long id) {
		try {
			Optional<Patient> opa = patientrepository.findById(id);
			Patient patient =new Patient();
			if (opa.isPresent()) {
				patient = opa.get();
			}
			return patient;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Patient updatePatient(Patient pa) {
		return patientrepository.save(pa);
	}

	@Override
	public Patient affectedpat(long idP, long idM) {
		try {
			Optional<Patient> opa = patientrepository.findById(idP);
			Patient patient =new Patient();
			Optional<Medecin> opm = medecinRepository.findById(idM);
			Medecin medecin = new Medecin();
			if (opm.isPresent() && opa.isPresent()) {
				patient = opa.get();
				medecin= opm.get();
				patient.setMedecin(medecin);
				patientrepository.save(patient);
			}
			return patient;
		} catch (Exception e) {
			return null;
		}
	}
}
