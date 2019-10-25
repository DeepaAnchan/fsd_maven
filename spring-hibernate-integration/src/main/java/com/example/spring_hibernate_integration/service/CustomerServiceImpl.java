package com.example.spring_hibernate_integration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.spring_hibernate_integration.dao.CustomerDao;
import com.example.spring_hibernate_integration.model.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		return customerDao.createCustomer(theCustomer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}

	@Override
	public Customer getCustomerByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
