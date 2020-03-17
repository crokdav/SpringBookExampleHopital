package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_patient")
public class Patient {
	
@Id
@GeneratedValue
	private long idPatient;

	private String pathologie;
	private String nomPatient;
	
	@JoinColumn(name="idMedecin")
	@ManyToOne
	private Medecin medecin;
	
	
	public Patient(String pathologie, String nomPatient, Medecin medecin) {
		super();
		this.pathologie = pathologie;
		this.nomPatient = nomPatient;
		this.medecin = medecin;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
	public String getPathologie() {
		return pathologie;
	}
	public void setPathologie(String pathologie) {
		this.pathologie = pathologie;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", pathologie=" + pathologie + ", nomPatient=" + nomPatient
				+ ", medecin=" + medecin + "]";
	}
	
	
	
	
}
