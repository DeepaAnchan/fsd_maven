package com.mycompany.hibernate_crud_demo4;

import static java.lang.System.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycompany.hibernate_crud_demo4.event.Instructor;
import com.mycompany.hibernate_crud_demo4.event.InstructorDetails;
import com.mycompany.hibernate_crud_demo4.factory.MyHibernateFactory;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	try {
    		SessionFactory sessionFactory = MyHibernateFactory.getMySession();
    		Session session = null;
    		
    		
    		
    		session = sessionFactory.openSession();

    		InstructorDetails id = new InstructorDetails();
    		id.setHobby("Cricket");
    		id.setYoutube_channels("www.youtube.com");
    		
    		Instructor i = new Instructor();    		
    		i.setFirst_name("Sunny");
    		i.setLast_name("Deol");
    		i.setEmail("sunny@i.com");
    		
    		
    		
    		session.getTransaction().begin();
    		session.persist(id);
    		session.persist(i);
  			session.getTransaction().commit();	
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		   
    }
}
