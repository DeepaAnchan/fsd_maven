package org.customer.module.connection.hbsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyHbsSqlConnection {

	private static Connection connection=null;
	
	
	private MyHbsSqlConnection() throws SQLException
	{
	
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer1","root","pass@word1");
	}
	
	public static Connection getMyConnection() throws SQLException
	{
		if(connection==null)
		{
			new MyHbsSqlConnection();
		}
		return connection;
	}
}

