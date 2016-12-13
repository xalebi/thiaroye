package dao;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Personne;

public class PersonneDaoImpl implements PersonneDAO {
	@Autowired  
	 private SessionFactory sessionFactory;  
	
	public int getPersonne(Personne personne){
		Map<String, String> mapParameter=new HashMap<>();
		mapParameter.put("login", personne.getLogin());
		mapParameter.put("password",personne.getPassword());
		Query query= sessionFactory.getCurrentSession().createQuery("from PersonneEntite as personne where personne.login=:login and personne.password:=password");
		query.setParameter("login",mapParameter.get("login"));
		query.setParameter("password", mapParameter.get("password"));
		int result=query.executeUpdate();
		return result;
		 
	}

}
