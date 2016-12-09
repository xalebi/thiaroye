package service;

import bean.PersonneBean;
import model.Personne;

public interface PersonneService {

	int getPersonneBean(Personne personne);

	void createPersonne(Personne personne) throws InstantiationException, IllegalAccessException;

	int getPersonne(PersonneBean personneBean) throws InstantiationException, IllegalAccessException;

}
