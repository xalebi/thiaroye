package service;

import bean.PersonneBean;
import web.PersonneVO;

public class PersonneVOAssembler {
	
	public static PersonneBean getPersonne(PersonneBean personneVO) throws InstantiationException, IllegalAccessException{
		
		PersonneBean personne= PersonneBean.class.newInstance();
		personne.setLogin(personneVO.getLogin());
		personne.setPassword(personneVO.getPassword());
		personne.setAdresse(personneVO.getAdresse());
		personne.setNom(personneVO.getNom());
		personne.setPrenom(personneVO.getPrenom());
		personne.setTel(personneVO.getTel());
		return personne;
	}

}
