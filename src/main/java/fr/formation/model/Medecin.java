package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_medecin")
public class Medecin {
	
	
@Id
@GeneratedValue
private long idMedecin;

private String nomMedecin;
private String specialite;

@JoinColumn(name="idHopital")
@ManyToOne
private Hopital hopital;
public Medecin() {
	super();
	// TODO Auto-generated constructor stub
}
public Medecin(String nomMedecin, String specialite, Hopital hopital) {
	super();
	this.nomMedecin = nomMedecin;
	this.specialite = specialite;
	this.hopital = hopital;
}
public String getNomMedecin() {
	return nomMedecin;
}
public void setNomMedecin(String nomMedecin) {
	this.nomMedecin = nomMedecin;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
public Hopital getHopital() {
	return hopital;
}
public void setHopital(Hopital hopital) {
	this.hopital = hopital;
}
public long getIdMedecin() {
	return idMedecin;
}
public void setIdMedecin(long idMedecin) {
	this.idMedecin = idMedecin;
}
@Override
public String toString() {
	return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", specialite=" + specialite
			+ ", hopital=" + hopital + "]";
}





}
