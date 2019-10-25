package org.customer.module.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.customer.module.Customer;
import org.customer.module.connection.hbsql.MyHbsSqlConnection;

public class CustomerFactoryImpl implements CustomerFactory {
	private static Scanner scanner=new Scanner(System.in);
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	
	Customer tempCustomer=null;
	public CustomerFactoryImpl() {
		super();
		
		try {
			connection=MyHbsSqlConnection.getMyConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Customer createCustomer(int id, String name, String email) {
		// TODO Auto-generated method stub
		
		try {
			tempCustomer=new Customer(id,name,email);
	
			pStatement=connection.prepareStatement("insert into customer values(?,?,?)");
			pStatement.setInt(1, tempCustomer.getId());
			pStatement.setString(2, tempCustomer.getName().toString());
			pStatement.setString(3, tempCustomer.getEmail().toString());
			int count=pStatement.executeUpdate();
			System.out.println(count+" row(s) inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tempCustomer;
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		
		
		List<Customer> list=new ArrayList<Customer>();
		try {
			statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from customer");
			while(rs.next())
			{
				list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return list;
	}
	
	
	public void findById(int id) {
		try {
			int count=-1;
			pStatement=connection.prepareStatement("select * from customer where id=?");
			pStatement.setInt(1, id);
			ResultSet rs=pStatement.executeQuery();
			System.out.println(rs);

			while(rs.next())
			{
				count++;
			}
			if(count<0)
			{
				System.out.println("no such record found...");
			}
			else
			{

				rs.beforeFirst();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
				}
			}
			//System.out.println(count);

			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateCustomer(int id) {
		try {
			
			System.out.println("New name:");
			String name = scanner.next();
			System.out.println("New Email");
			String email = scanner.next();
			
			pStatement=connection.prepareStatement("Update customer set name=? , email=? where id=?");
			pStatement.setString(1, name);
			pStatement.setString(2, email);
			pStatement.setInt(3, id);
			int count=pStatement.executeUpdate();
			
			
			
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCustomer(int id) {
		try {	
			
			pStatement=connection.prepareStatement("delete from customer where id=?");			
			pStatement.setInt(1, id);
			int count=pStatement.executeUpdate();	
			
			
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}


	
	
}
