package com.mycompany.hibernate_inheritance_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(account.class)
    				.addAnnotatedClass(savings_account.class).addAnnotatedClass(current_account.class)
    				.buildSessionFactory();
    		Session session = factory.openSession();
    		Transaction t = session.beginTransaction();
			
			account ac = new account();
		
			ac.setName("Arya");
			ac.setAccount_number("1234");
			
			savings_account sa = new savings_account();
			
			sa.setName("Zara");
			sa.setAccount_number("2345");
			sa.setMin_balance(3000);
			
			current_account ca = new current_account();
			
			ca.setName("riyA");
			ca.setAccount_number("3456");
			ca.setInterest(0);
			
			session.persist(ac);
			session.persist(sa);
			session.persist(ca);
			
			t.commit();
			session.close();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
