package com.mycompany.hibernate_one_to_one3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_one_to_one3.event.Instructor;
import com.mycompany.hibernate_one_to_one3.event.InstructorDetails;


public class DeleteDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theId = 5;
			//Instructor tempInstructor = session.get(Instructor.class, theId);
			InstructorDetails tempInstructorDetail = session.get(InstructorDetails.class, theId);


			System.out.println("Found instructor: " + tempInstructorDetail);

			if (tempInstructorDetail != null) {

				System.out.println("Deleting: " + tempInstructorDetail);

				//session.delete(tempInstructor);
				session.delete(tempInstructorDetail);

			}

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
