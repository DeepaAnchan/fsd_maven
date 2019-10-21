package comm.example.dao;

import java.util.List;
import java.util.UUID;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.modelmapper.ModelMapper;


import comm.example.factory.HibernateSessionFactory;
import comm.example.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private SessionFactory factory = null;
	private Session session = null;
	List<Customer> list;
	public List<Customer> getAllCustomer() {
		try {
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.getTransaction().begin();
			list = session.createQuery("from Customer", Customer.class).getResultList();
			session.getTransaction().commit();
			//session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	

	
	@Override
	public void createCustomer(Customer iCustomer) {
		// TODO Auto-generated method stub		
		session = HibernateSessionFactory.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.persist(iCustomer);
		session.getTransaction().commit();
		//session.close();

	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSessionFactory().openSession();
		session.getTransaction().begin();
		Customer c = session.get(Customer.class, id);
		//session.close();
		return c;

	}
	
	@Override
	public void updateCustomer(int id, Customer c) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSessionFactory().openSession();
		session.getTransaction().begin();
		Customer customer = session.get(Customer.class, id);
		customer.setFirstName(c.getFirstName());
		customer.setLastName(c.getLastName());
		customer.setEmail(c.getEmail());
		session.merge(customer);
		session.getTransaction().commit();
		//session.close();


	}
	
	
	@Override
	public void deleteCustomer(Customer dCustomer) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.remove(dCustomer);
		session.getTransaction().commit();
		//session.close();

	}
	
	@Override
	public List<Customer> findCustomer(String str) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("FROM Customer WHERE firstName like concat('%',:customerName,'%')");
        query.setParameter("customerName", str);
        session.getTransaction().commit();
		//session.close();
		return query.getResultList();
	}



	@Override
	public List<Customer> findSortedCustomer(String str) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("FROM Customer  ORDER BY firstName "+str);
        session.getTransaction().commit();
		//session.close();
		return query.getResultList();
	}
	
	
}
