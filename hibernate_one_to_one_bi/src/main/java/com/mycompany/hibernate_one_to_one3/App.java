package com.mycompany.hibernate_one_to_one3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_one_to_one3.event.Instructor;
import com.mycompany.hibernate_one_to_one3.event.InstructorDetails;


/**
 * Hello world!
 *
  */
public class App 
{
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			Instructor tempInstructor = 
					new Instructor("Madhu", "Patel", "madhu@luv2code.com");
			
			InstructorDetails tempInstructorDetail =
					new InstructorDetails(
							"http://www.youtube.com",
							"Guitar");		
			
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			session.beginTransaction();
			
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);

			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
