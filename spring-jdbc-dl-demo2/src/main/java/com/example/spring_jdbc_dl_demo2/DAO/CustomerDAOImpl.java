package com.example.spring_jdbc_dl_demo2.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.spring_jdbc_dl_demo2.model.Customer;



public class CustomerDAOImpl implements CustomerDAO{
	
	private DataSource dataSource=null;
	private JdbcTemplate jdbcTemplate;

	
	public CustomerDAOImpl(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public void createCustomer(Customer customer) {
		jdbcTemplate.update("insert into customer_spring_table(firstName,lastName,email) values(?,?,?)",
				customer.getFirstName(),customer.getLastName(),customer.getEmail());
		
		/*
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
		*/
		
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

	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select firstName,lastName,email from customer_spring_table", new CustomerMapper());
	}

	@Override
	public void updateCustomer(String firstname, String lastname, String email, int id ) {
		jdbcTemplate.update("update customer_spring_table set firstName = ? , lastName=? ,email=? where id =?", firstname,lastname,email,id);

		/*
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
			pStatement=connection.prepareStatement("update customer_spring_table set firstName = ? , lastName=? ,email=? where id =?");
			pStatement.setString(1, firstname);
			pStatement.setString(2, lastname);
			pStatement.setString(3, email);
			pStatement.setInt(4,id);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}


	@Override
	public void deleteCustomer(int id) {
		jdbcTemplate.update("delete from  customer_spring_table where id =?", id);
		
		/*Connection connection=null;
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
			pStatement=connection.prepareStatement("delete from  customer_spring_table where id =?");
			
			pStatement.setInt(1,id);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}

