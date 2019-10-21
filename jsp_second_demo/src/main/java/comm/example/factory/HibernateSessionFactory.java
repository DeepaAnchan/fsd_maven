package comm.example.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.model.Customer;

public class HibernateSessionFactory {
	private static SessionFactory sessionFactory;
	
	
	public static SessionFactory getSessionFactory()
	{
		sessionFactory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class).buildSessionFactory();
		return sessionFactory;
	}
}
