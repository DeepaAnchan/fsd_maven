package com.example.spring_jdbc_dl_demo2;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_jdbc_dl_demo2.DAO.CustomerDAO;
import com.example.spring_jdbc_dl_demo2.DAO.CustomerDAOImpl;
import com.example.spring_jdbc_dl_demo2.model.Customer;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);
			
//			System.out.println("Display");
//			List<Customer> list = customerDAO.getAllCustomer();
//			Iterator<Customer>  i=list.iterator(); 
//			while(i.hasNext()) { 
//				 Customer c=i.next();
//				 System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
//			}
//			
//			System.out.println("Update");
//			customerDAO.updateCustomer("Jolly", "khan", "sahilv@luv2code.com",3);
//			
//			System.out.println("After update");
//			list = customerDAO.getAllCustomer();
//			i=list.iterator(); 
//			while(i.hasNext()) { 
//				 Customer c=i.next();
//				 System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
//			}			
			
			System.out.println("Delete");
			customerDAO.deleteCustomer(7);

//			System.out.println("After Delete");
//			list = customerDAO.getAllCustomer();			
//			i=list.iterator(); 
//			while(i.hasNext()) { 
//				 Customer c=i.next();
//				 System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
//			}			
//			
//			System.out.println("Create");
//			customerDAO.createCustomer(new Customer("Warren", "Buffet", "sourav@luv2code.com"));
//			System.out.println("After creation");
//			list = customerDAO.getAllCustomer();
//			i=list.iterator(); 
//			while(i.hasNext()) { 
//				 Customer c=i.next();
//				 System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
//			}
			
			System.out.println("ok!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
}
