package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Medecin;
import fr.formation.repository.IMedecinRepository;

@Service
public class MedecinService implements IMedecinService {

	@Autowired
	IMedecinRepository medecinRepository;

	@Override
	public List<Medecin> getAllMedecin() {
		try {
			return medecinRepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Medecin createMedecin(Medecin med) {
		try {
			return medecinRepository.save(med);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int deleteMedecin(long id) {
		try {
			medecinRepository.deleteById(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}


	@Override
	public Medecin getMedecin(long id) {
		try {
			Optional<Medecin> opm = medecinRepository.findById(id);
			Medecin medecin =new Medecin();
			if (opm.isPresent()) {
				medecin = opm.get();
			}
			return medecin;
		} catch (Exception e) {
			return null;
		}
	}

}
