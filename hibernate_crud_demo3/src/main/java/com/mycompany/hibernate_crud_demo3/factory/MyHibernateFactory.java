package com.mycompany.hibernate_crud_demo3.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_crud_demo3.event.Employee;


public class MyHibernateFactory {
	private static SessionFactory factory;
	
	public static SessionFactory getMySession()
	{
		factory=new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		return factory;
				
	}
}
