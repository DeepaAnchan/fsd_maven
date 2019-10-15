package com.mycompany.hibernate_crud_demo;

import com.mycompany.hibernate_crud_demo.dao.EmployeeDAO;
import com.mycompany.hibernate_crud_demo.dao.EmployeeDAOImpl;
import com.mycompany.hibernate_crud_demo.shared.SharedEmployee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
		
		/*try {
        	SessionFactory factory=
        			new Configuration().configure().
        			addAnnotatedClass(Employee.class).
        			buildSessionFactory();
        	Session session=
        			factory.getCurrentSession();
        	Employee employee=new Employee();
        	employee.setFirstName("John");
        	employee.setLastName("Doe");
        	employee.setEmail("john@email.com");
        	session.getTransaction().begin();
        	session.persist(employee);
        	session.getTransaction().commit();
        	System.out.println("sucess!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		
    	EmployeeDAO dao=new EmployeeDAOImpl();
        try {
			
			  dao.createEmployee(new SharedEmployee("Shane", "Warne",
			  "shane@luv2code.com")); System.out.println("inserted");
			 
        	
        	List<SharedEmployee> se=dao.getAllEmployee();
        	for(SharedEmployee see:se)
        	{
        		System.out.println(see);
        	}
        	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
