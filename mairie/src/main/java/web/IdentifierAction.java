package web;

import com.opensymphony.xwork2.ActionSupport;

import dao.Personne;

public class IdentifierAction extends ActionSupport{
	/**
	 * 
	 */
	PersonneVO personne;
	private static final long serialVersionUID = -5715007290418617174L;

	public PersonneVO getPersonne() {
		return personne;
	}

	public void setPersonne(PersonneVO personne) {
		this.personne = personne;
	}

	public String execute(){
		if(personne.getLogin().equals("AL")&& personne.getPassword().equals("AL") ){
		return ActionSupport.SUCCESS;
	}
		else{
			return 
					ActionSupport.ERROR;
		}
	}
	
	public void validate(){
		if(!personne.getLogin().equals("AL")){
			addFieldError("personne.login", "login incorrect");
		}
		if(!personne.getPassword().equals("AL")){
			addFieldError("personne.password", "mot de passe incorrect");
		}
	}
}
