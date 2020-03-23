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
import fr.formation.service.IHopitalService;

@RestController
@RequestMapping("hopital")//url du webservice chemin vers la classe controller /hopital
@CrossOrigin("http://localhost:4200")// autorise les requetes a partir du 4200 et va 8080
public class HopitalController {
	@Autowired
	IHopitalService hopitalService;
	
@GetMapping("/all")
public List<Hopital> getAll(){
	return hopitalService.getAllHopital();
}
@GetMapping("/get/{id}")
public Hopital getbyId(@PathVariable long id) {
	return hopitalService.getHopital(id);
}

@PostMapping("/creat")
public Hopital createHopital (@RequestBody Hopital ho) {
	return hopitalService.creatHopital(ho);
}

@DeleteMapping("/delete/{id}")
public int deleteHopital (@PathVariable long id) {
	return hopitalService.deleteHopital(id);
}

@PutMapping("/update/{id}")
public Hopital updateHopitale (@PathVariable long id, @RequestBody Hopital hopital) {
	Hopital h1 = hopitalService.getHopital(id);
	h1.setNomHopital(hopital.getNomHopital());
	h1.setVille(hopital.getVille());
	h1.setAdresse(hopital.getAdresse());
	return hopitalService.updateHopital(h1);
	}



}