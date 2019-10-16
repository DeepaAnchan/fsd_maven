package com.mycompany.hibernate_app4;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_app4.event.Instructor;
import com.mycompany.hibernate_app4.event.InstructorDetails;

public class DeleteDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			//InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);

			System.out.println("Found instructor: " + tempInstructor);

			if (tempInstructor != null) {

				System.out.println("Deleting: " + tempInstructor);

				session.delete(tempInstructor);
				//session.delete(tempInstructorDetail);
			}

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
