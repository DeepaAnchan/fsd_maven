package com.example.spring_jdbc_dl_demo4.DAO;

import java.util.List;

import com.example.spring_jdbc_dl_demo4.model.Customer;


public interface CustomerDAO {
	public void createCustomer(Customer customer);
	
	public List<String> retrieveCustomer();	
	
	public void updateCustomer(String firstname, String lastname, String email, int id );
	
	public void deleteCustomer(int id );
	
	public List<Customer> getAllCustomer();


}
