package com.example.spring_jdbc_dl_demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_jdbc_dl_demo.DAO.CustomerDAO;
import com.example.spring_jdbc_dl_demo.DAO.CustomerDAOImpl;
import com.example.spring_jdbc_dl_demo.model.Customer;

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
			
			List<String> list = customerDAO.retrieveCustomer();
			System.out.println(list);
			
			//customerDAO.createCustomer(new Customer("Shamanth", "Singh", "sourav@luv2code.com"));
			System.out.println("ok!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
}
