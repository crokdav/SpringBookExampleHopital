package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestBody;

@Entity
@Table(name="tb_hopital")
//donner un nom personaliser à notre table SQL
public class Hopital {
	
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private long idHopital;
private String nomHopital;
private String ville;
private String adresse;


public Hopital(String nomHopital, String ville, String adresse) {
	super();
	
	this.nomHopital = nomHopital;
	this.ville = ville;
	this.adresse = adresse;
}
public Hopital() {
	super();
	// TODO Auto-generated constructor stub
}
public long getIdHopital() {
	return idHopital;
}
public void setIdHopital(long idHopital) {
	this.idHopital = idHopital;
}
public String getNomHopital() {
	return nomHopital;
}
public void setNomHopital(String nomHopital) {
	this.nomHopital = nomHopital;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
@Override
public String toString() {
	return "Hopital [idHopital=" + idHopital + ", nomHopital=" + nomHopital + ", ville=" + ville + ", adresse="
			+ adresse + "]";
}





}
