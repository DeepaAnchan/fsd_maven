package com.mycompany.hibernate_inheritance_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_inheritance_demo.model.account;
import com.mycompany.hibernate_inheritance_demo.model.current_account;
import com.mycompany.hibernate_inheritance_demo.model.savings_account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(account.class)
					.addAnnotatedClass(savings_account.class)
					.addAnnotatedClass(current_account.class).buildSessionFactory();
			Session session = factory.openSession();
			account ac = new account("Leela","12345");
			savings_account sa = new savings_account("Sanjay", "2345", 3000);
			current_account ca = new current_account("Warren","9876", 0);
			session.getTransaction().begin();
			session.save(ac);
			session.save(sa);
			session.save(ca);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
