package service;

import bean.Personne;
import web.PersonneVO;

public class PersonneVOAssembler {
	
	public Personne getPersonne(PersonneVO personneVO) throws InstantiationException, IllegalAccessException{
		
		Personne personne= Personne.class.newInstance();
		personne.setLogin(personneVO.getLogin());
		personne.setPassword(personneVO.getPassword());
		personne.setAdresse(personneVO.getAdresse());
		personne.setNom(personneVO.getNom());
		personne.setPrenom(personneVO.getPrenom());
		personne.setTel(personneVO.getTel());
		return personne;
	}

}
