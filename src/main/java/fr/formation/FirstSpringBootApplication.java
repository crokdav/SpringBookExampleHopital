package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.model.Hopital;
import fr.formation.model.Medecin;
import fr.formation.model.Patient;
import fr.formation.service.HopitalService;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {

	@Autowired
	IHopitalService hopitalService;
	@Autowired
	IMedecinService medecinService;
	@Autowired
	IPatientService patientService;
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
		System.out.println("hi");
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	//Hopital
		//hopitalService.creatHopital(new Hopital("Saint Anne", "Paris", "14 ieme Arrondissement"));
		//System.out.println(hopitalService.getAllHopital());
//		hopitalService.deleteHopital(1);
		
		
	//medecin
//			Hopital ho= new Hopital();
//			ho.setIdHopital(4);;
//			Medecin medi= new Medecin("Dr.Folamour", "Neurologie", ho);
//			medecinService.createMedecin(medi);
//			System.out.println(medecinService.getMedecin(3));
//		Medecin m1 = new Medecin();
//		m1.setHopital(service.getHopital(1));
//		m1.setNomMedecin("dr.Baranova");
//		m1.setSpecialite("Cardiologie");
//		medecinService.createMedecin(m1);
//		medecinService.deleteMedecin(8);
		
	//Patient
//		Medecin me = new Medecin();
//		me.setIdMedecin(9);
//		patientService.createPatient(new Patient("Souffle au coeur", "David", me));
//		System.err.println(patientService.getAllPatient());
		//patientService.deletePatient(5);
		
		
	}

	}
	

