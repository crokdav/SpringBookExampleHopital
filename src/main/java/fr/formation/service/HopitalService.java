package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Hopital;
import fr.formation.repository.IHopitalRepository;

@Service
public class HopitalService implements IHopitalService {

	@Autowired
	IHopitalRepository hopitalRepository;

	@Override
	public List<Hopital> getAllHopital() {
		try {
			return hopitalRepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Hopital creatHopital(Hopital ho) {
		try {
			return hopitalRepository.save(ho);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int deleteHopital(long id) {
		try {
			hopitalRepository.deleteById(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public Hopital getHopital(long id) {
		try {
			Optional<Hopital> op = hopitalRepository.findById(id);
			Hopital hopital =new Hopital();
			if (op.isPresent()) {
				hopital = op.get();
			}
			return hopital;
		} catch (Exception e) {
			return null;
		}
	}


}
