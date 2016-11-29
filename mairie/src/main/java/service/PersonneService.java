package service;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.Personne;
import utils.MairieUtil;
import web.PersonneVO;

public interface PersonneService {

	int getPersonne(Personne personne);

	void createPersonne(PersonneVO personneVO) throws InstantiationException, IllegalAccessException;

}
