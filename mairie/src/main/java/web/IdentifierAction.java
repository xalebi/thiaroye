package web;

import com.opensymphony.xwork2.ActionSupport;

import bean.PersonneBean;
import service.PersonneServiceImpl;

public class IdentifierAction extends ActionSupport{
	/**
	 * 
	 */
	PersonneVO personneVO;
	private static final long serialVersionUID = -5715007290418617174L;

	public PersonneVO getPersonneVO() {
		return personneVO;
	}

	public void setPersonne(PersonneVO personneVO) {
		this.personneVO = personneVO;
	}

	public String execute(){
		
		PersonneServiceImpl personneServiceBean=new PersonneServiceImpl();
		personneServiceBean.getPersonne(personne);
		if(personneVO.getLogin().equals("AL")&& personneVO.getPassword().equals("AL") ){
		return ActionSupport.SUCCESS;
	}
		else{
			return 
					ActionSupport.ERROR;
		}
	}
	
	public void validate(){
		if(!personneVO.getLogin().equals("AL")){
			addFieldError("personne.login", "login incorrect");
		}
		if(!personneVO.getPassword().equals("AL")){
			addFieldError("personne.password", "mot de passe incorrect");
		}
	}
}
