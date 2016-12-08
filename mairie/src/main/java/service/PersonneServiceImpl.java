package service;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.PersonneBean;
import model.Personne;
import utils.MairieUtil;

public class PersonneServiceImpl implements PersonneService {
	@Override
	public void createPersonne(Personne personne) throws InstantiationException, IllegalAccessException
	{
		Session session=MairieUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction().begin();
		PersonneVOAssembler pvoa=new PersonneVOAssembler();
		//PersonneBean personne=pvoa.getPersonne(personne);
		session.save(personne);
		session.beginTransaction().commit();
		session.close();
	}
	@Override
	public int getPersonne(Personne personne){
		Session session=MairieUtil.getSessionFactory().getCurrentSession();
		Map<String, String> mapParameter=new HashMap<>();
		mapParameter.put("login", personne.getLogin());
		mapParameter.put("password",personne.getPassword());
		Query query= session.createQuery("from PersonneEntite as personne where personne.login=: and personne.password:=");
		query.setParameter("login",mapParameter.get("login"));
		query.setParameter("password", mapParameter.get("password"));
		int result=query.executeUpdate();
		return result;
	}
	

}
