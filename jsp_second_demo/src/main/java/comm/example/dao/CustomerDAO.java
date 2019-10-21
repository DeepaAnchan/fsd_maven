package comm.example.dao;


import java.util.List;

import comm.example.model.Customer;

public interface CustomerDAO {
	public List<Customer> getAllCustomer();
	public void createCustomer(Customer iCustomer);
	public void deleteCustomer(Customer dCustomer);
	public Customer findById(int id);
	public void updateCustomer(int id, Customer c);
	public List<Customer> findCustomer(String str);
	public List<Customer> findSortedCustomer(String str);
}
