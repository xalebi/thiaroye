package service;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.type.TrueFalseType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bean.PersonneBean;
import dao.PersonneDAO;
import dao.PersonneDaoImpl;
import model.Personne;
import utils.MairieUtil;

@Service("personneService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
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
	public int getPersonne(PersonneBean personneBean) throws InstantiationException, IllegalAccessException{
		
		Personne personne=PersonneVOAssembler.getInstance().getPersonne(personneBean);
		
		PersonneDAO personneDAO =new PersonneDaoImpl();
		return personneDAO.getPersonne(personne);
	}
	@Override
	public int getPersonneBean(Personne personne) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
