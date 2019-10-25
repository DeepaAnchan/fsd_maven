package com.example.spring_jdbc_dl_demo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.example.spring_jdbc_dl_demo.model.Customer;


public class CustomerDAOImpl implements CustomerDAO{
	
	private DataSource dataSource=null;
	
	public CustomerDAOImpl(DataSource dataSource) {
		
		this.dataSource = dataSource;
	}

	
	@Override
	public void createCustomer(Customer customer) {
		Connection connection=null;
		Statement statement=null;
		PreparedStatement pStatement=null;
		
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(dataSource.toString());
		try {
			pStatement=connection.prepareStatement("insert into customer_spring_table(firstName,lastName,email) values(?,?,?)");
			pStatement.setString(1, customer.getFirstName());
			pStatement.setString(2, customer.getLastName());
			pStatement.setString(3, customer.getEmail());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public List<String> retrieveCustomer() {
		List<String> list = new ArrayList<String>();

		
		Connection connection=null;
		Statement stmt=null;
		
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(dataSource.toString());
		try {
			
			
			
			stmt = connection.createStatement();

		    String sql = "SELECT * from customer_spring_table";
		    ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		    while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         String first = rs.getString("firstName");
		         String last = rs.getString("lastName");

		         //Display values
		         String row = "ID: " + id+ ", First Name: " + first + ", Last Name: " + last + "";
		         list.add(row);
		    }
		    rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return list;

		
	}

}
