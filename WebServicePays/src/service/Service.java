package service;

import meserreurs.MonException;
import java.util.*;

import javax.persistence.EntityTransaction;

import models.Pays;

public class Service extends EntityService {
	// gestion des pays
	// Consultation d'un pays par son nom
	
	public Pays consulterPays(String  nom) throws MonException {
		Pays unPays = null;
		try {
			
			EntityTransaction transac = startTransaction();
			transac.begin();
			unPays = entitymanager.find(Pays.class, nom);
			
			entitymanager.close();
			emf.close();
			
		} catch (Exception e) {
			throw new MonException("Erreur de lecture", e.getMessage());
		}
		return unPays;
	}

	// Consultation des pays
	// Fabrique et renvoie une liste d'objets Pays contenant le r�sultat de
	// la requ�te BDD
	public List<Pays> consulterListePays() throws MonException {
		List<Pays> mesPays= null;
		try {
			
			EntityTransaction transac = startTransaction();
			transac.begin();
			mesPays = (List<Pays>) entitymanager.createQuery("SELECT p FROM Pays p ORDER BY p.nomPays").getResultList();
			entitymanager.close();
		}  catch (RuntimeException e){
			throw new MonException("Erreur de lecture ", e.getMessage());
		}
		return mesPays;
	}
}
