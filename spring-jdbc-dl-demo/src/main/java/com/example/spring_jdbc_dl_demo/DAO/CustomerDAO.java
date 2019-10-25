package com.example.spring_jdbc_dl_demo.DAO;

import java.util.List;

import com.example.spring_jdbc_dl_demo.model.Customer;

public interface CustomerDAO {
	public void createCustomer(Customer customer);
	
	public List<String> retrieveCustomer();

}
