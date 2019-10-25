package com.example.spring_hibernate_integration.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.spring_hibernate_integration.model.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class CustomerDaoImpl implements CustomerDao{

	private SessionFactory sessionFactory;
	
	@Override
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub		
		Session session = sessionFactory.openSession();
		session.save(theCustomer);
		return theCustomer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
