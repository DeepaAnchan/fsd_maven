package org.customer.module.factory;
import java.util.List;
import org.customer.module.Customer;

public interface CustomerFactory {
	public Customer createCustomer(int id, String name, String email);
	
	public List<Customer> getAllCustomer();
	
	public void findById(int id);
	
	public void updateCustomer(int id);
	
	public void deleteCustomer(int id);
}
