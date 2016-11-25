package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static final SessionFactory  sessionFactory=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		try{
			return new AnnotationConfiguration().configure().buildSessionFactory();
			
		}
		catch(Exception ex){
			throw new ExceptionInInitializerError();
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}