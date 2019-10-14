package org.customer.module;

import java.util.List;
import java.util.Scanner;

import org.customer.module.Customer;
import org.customer.module.factory.CustomerFactoryImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scanner=new Scanner(System.in);
	public static void main( String[] args )
    {
        try {
        	
        	 CustomerFactoryImpl impl=new CustomerFactoryImpl();
        	 int choice = 0;
        	 
        	 
        	 do {
        		 
        		 System.out.println("1-Create ");
            	 System.out.println("2-Display");
            	 System.out.println("3-Find customer by ID");
            	 System.out.println("4-Update");
            	 System.out.println("5-Remove customer");
            	 System.out.println("6-Exit");
            	 System.out.println("Enter your choice");
            	 choice = scanner.nextInt();
            	 switch(choice) {
	            	 case 1:            		 
	            		 System.out.print("ID: "); int id=scanner.nextInt();
	        			 System.out.print("NAME: "); String name=scanner.next();
	        			 System.out.print("EMAIL: "); String email=scanner.next();     			 
	        			 Customer customer=impl.createCustomer(id, name, email);
	        			 System.out.println(customer.toString());
	            		 break;
	            	 case 2:
	            		 List<Customer> list=impl.getAllCustomer();
	                 	 for(Customer c:list)
	                 	 {
	                 		System.out.println(c);
	                 	 }
	                 	 break;
	            	 case 3:
	            		 System.out.println("Enter the id");
	                 	 int id2 = scanner.nextInt();
	                 	 impl.findById(id2);
	                 	 break;
	            	 case 4:
	            		 System.out.println("Enter the id of the customer details to be updated:");
	         			 int id3 = scanner.nextInt();
	            		 impl.updateCustomer(id3);
	            		 break;
	            	 case 5:
	            		 System.out.println("Enter the id of the customer details to be deleted:");
	         			 int id4 = scanner.nextInt();
	            		 impl.deleteCustomer(id4);
	            		 break;
	            	 case 6:
	            		 choice=0;
	            		 break;
	            	 
            	 	default:
            	 		break;
            	 }
        		 
        	 }while(choice!=0);
			
        	
        	
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
