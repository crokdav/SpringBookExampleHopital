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


import fr.formation.model.Patient;

import fr.formation.service.IPatientService;
@RestController
@RequestMapping("patient")
@CrossOrigin("http://localhost:4200")
public class PatientController {
	@Autowired
	IPatientService patientService;
	
	
	@GetMapping("/all")
	public List<Patient> getAll(){
		return patientService.getAllPatient();
	}
	@GetMapping("/get/{id}")
	public Patient getbyId(@PathVariable long id) {
		return patientService.getPatient(id);
	}

	@PostMapping("/creat")
	public Patient createPatient (@RequestBody Patient pa) {
		return patientService.createPatient(pa);
	}

	@DeleteMapping("/delete/{id}")
	public int deletePatient (@PathVariable long id) {
		return patientService.deletePatient(id);
	}

	@PutMapping("/update/{id}")
	public Patient updateHopitale (@PathVariable long id, @RequestBody Patient pa) {
		Patient p1 = patientService.getPatient(id);
		p1.setNomPatient(pa.getNomPatient());
		p1.setPathologie(pa.getPathologie());
		p1.setMedecin(pa.getMedecin());
		return patientService.updatePatient(pa);
		}

}
