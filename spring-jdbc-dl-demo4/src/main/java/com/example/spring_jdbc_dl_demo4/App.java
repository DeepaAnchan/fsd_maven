package com.example.spring_jdbc_dl_demo4;


import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_jdbc_dl_demo4.DAO.CustomerDAO;
import com.example.spring_jdbc_dl_demo4.DAO.CustomerDAOImpl;
import com.example.spring_jdbc_dl_demo4.model.Customer;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {

    		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigBean.class);
			CustomerDAO customerDAO = context.getBean("customerDAO", CustomerDAOImpl.class);
			
			System.out.println("Display");
			List<Customer> list = customerDAO.getAllCustomer();
			Iterator<Customer>  i=list.iterator(); 
			while(i.hasNext()) { 
				 Customer c=i.next();
				 System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
			}
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
			
//			System.out.println("Delete");
//			customerDAO.deleteCustomer(8);

//			System.out.println("After Delete");
//			list = customerDAO.getAllCustomer();			
//			i=list.iterator(); 
//			while(i.hasNext()) { 
//				 Customer c=i.next();
//				 System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
//			}			
//			
			System.out.println("Create");
			customerDAO.createCustomer(new Customer("Steve", "Jobs", "sourav@luv2code.com"));
			System.out.println("After creation");
			list = customerDAO.getAllCustomer();
			i=list.iterator(); 
			while(i.hasNext()) { 
				 Customer c=i.next();
				 System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
			}
			
			System.out.println("ok!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
}
