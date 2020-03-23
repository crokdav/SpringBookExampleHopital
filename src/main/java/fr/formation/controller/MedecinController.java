package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Hopital;
import fr.formation.model.Medecin;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;

@RestController
@RequestMapping("medecin")
@CrossOrigin("http://localhost:4200")
public class MedecinController {
	@Autowired
	IMedecinService medecinService;
	@Autowired
	IHopitalService hopitalService;

	
	@GetMapping("/all")
	public List<Medecin> getAll(){
		return medecinService.getAllMedecin();
	}
	@GetMapping("/get/{id}")
	public Medecin getbyId(@PathVariable long id) {
		return medecinService.getMedecin(id);
	}


	@DeleteMapping("/delete/{id}")
	public int deleteMedecin (@PathVariable long id) {
		return medecinService.deleteMedecin(id);
	}
	@PostMapping("/creat")
	public Medecin createMedecin (@RequestBody Medecin med) {
		return medecinService.createMedecin(med);
	}

@PutMapping("/update/{id}")
public Medecin updateMedecin (@PathVariable long id, @RequestBody Medecin medecin) {
	Medecin m1 = medecinService.getMedecin(id);
	m1.setNomMedecin(medecin.getNomMedecin());
	m1.setSpecialite(medecin.getSpecialite());
	m1.setHopital(medecin.getHopital());
	return medecinService.updateMedecin(m1);
	}

@PutMapping("/affect/{idM}/{idH}")
public Medecin affecte (@PathVariable long idM, @PathVariable long idH) {
	medecinService.getMedecin(idM);
	hopitalService.getHopital(idH);
	return medecinService.affectmed(idM, idH);
}




	
}
