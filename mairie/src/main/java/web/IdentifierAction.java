package web;

import com.opensymphony.xwork2.ActionSupport;

import bean.PersonneBean;
import service.PersonneServiceImpl;

public class IdentifierAction extends ActionSupport{
	/**
	 * 
	 */
	PersonneBean personneBean;
	private static final long serialVersionUID = -5715007290418617174L;

	public PersonneBean getPersonneBean() {
		return personneBean;
	}

	public void setPersonne(PersonneBean personneVO) {
		this.personneBean= personneVO;
	}

	public String execute(){
		
		PersonneServiceImpl personneServiceBean=new PersonneServiceImpl();
		int result;
		try {
			result = personneServiceBean.getPersonne(personneBean);
			if(result==1 ){
				return ActionSupport.SUCCESS;
			}
				else{
					return 
							ActionSupport.ERROR;
				}
		} catch (InstantiationException e) {
			e.printStackTrace();
			return ActionSupport.ERROR;
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ActionSupport.ERROR;
			
		}
	
	}
	
	public void validate(){
		if(!personneBean.getLogin().equals("AL")){
			addFieldError("personne.login", "login incorrect");
		}
		if(!personneBean.getPassword().equals("AL")){
			addFieldError("personne.password", "mot de passe incorrect");
		}
	}
}
