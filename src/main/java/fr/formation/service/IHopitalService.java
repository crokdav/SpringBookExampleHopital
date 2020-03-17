package fr.formation.service;

import java.util.List;

import fr.formation.model.Hopital;


public interface IHopitalService {
public List<Hopital> getAllHopital();
public Hopital creatHopital (Hopital ho);
public int deleteHopital (long id);
public Hopital getHopital (long id); 

}
