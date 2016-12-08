package service;

import model.Personne;

public interface PersonneService {

	int getPersonne(Personne personne);

	void createPersonne(Personne personne) throws InstantiationException, IllegalAccessException;

}
