package com.mycompany.hbernate_many_to_may;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hbernate_many_to_many.model.Course;
import com.mycompany.hbernate_many_to_many.model.Instructor;
import com.mycompany.hbernate_many_to_many.model.InstructorDetail;
import com.mycompany.hbernate_many_to_many.model.Review;
import com.mycompany.hbernate_many_to_many.model.Student;

public class DeleteMaryStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int studentId = 2;
			Student tempStudent = session.get(Student.class, studentId);

			System.out.println("\nLoaded student: " + tempStudent);
			System.out.println("Courses: " + tempStudent.getCourses());

			System.out.println("\nDeleting student: " + tempStudent);
			session.delete(tempStudent);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}