package com.example.spring_hibernate_integration.service;

import java.util.List;

import com.example.spring_hibernate_integration.model.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer theCustomer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByid(int id);

}
