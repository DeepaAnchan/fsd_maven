package com.mycompany.hibernate_crud_demo4.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_crud_demo4.event.Instructor;
import com.mycompany.hibernate_crud_demo4.event.InstructorDetails;


public class MyHibernateFactory {
private static SessionFactory factory;
	
	public static SessionFactory getMySession()
	{
		factory=new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class)
				.buildSessionFactory();
		return factory;
				
	}
}
