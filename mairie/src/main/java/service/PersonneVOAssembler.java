package service;

import bean.PersonneBean;
import model.Personne;

public class PersonneVOAssembler {
	private static PersonneVOAssembler instance;
	
	public static PersonneVOAssembler getInstance(){
		if(PersonneVOAssembler.instance==null){
			PersonneVOAssembler.instance=new PersonneVOAssembler();
		}
		return PersonneVOAssembler.instance;
	}
	
	public  PersonneBean getPersonneBean(Personne personne) throws InstantiationException, IllegalAccessException{
		
		PersonneBean personneBean= PersonneBean.class.newInstance();
		personneBean.setLogin(personne.getLogin());
		personneBean.setPassword(personne.getPassword());
		personneBean.setAdresse(personne.getAdresse());
		personneBean.setNom(personne.getNom());
		personneBean.setPrenom(personne.getPrenom());
		personneBean.setTel(personne.getTel());
		return personneBean;
	}

	
public  Personne getPersonne(PersonneBean personneBean) throws InstantiationException, IllegalAccessException{
		
		Personne personne= Personne.class.newInstance();
		personne.setLogin(personneBean.getLogin());
		personne.setPassword(personneBean.getPassword());
		personne.setAdresse(personneBean.getAdresse());
		personne.setNom(personneBean.getNom());
		personne.setPrenom(personneBean.getPrenom());
		personne.setTel(personneBean.getTel());
		return personne;
	}

}
