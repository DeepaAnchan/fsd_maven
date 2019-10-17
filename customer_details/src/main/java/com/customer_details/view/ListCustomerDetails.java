package com.customer_details.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer_details.model.Customer;

/**
 * Servlet implementation class ListCustomerDetails
 */
public class ListCustomerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Customer> list=null;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		list=new ArrayList<Customer>();
		list.add(new Customer("123","Raj","Corporate"));
		list.add(new Customer("234", "Simran", "Corporate"));
		out.println("<html><title>List All Available Customers</title><body><table border='1'><tr><td>ID</td><td>NAME</td><td>TYPE OF CUSTOMER</td></tr>");
		
		for(Customer l:list)
		{
			out.println("<tr><td>"+l.getID()+"</td><td>"+l.getNAME()+"</td><td>"+l.getTYPE()+"</td></tr>");
		}
		out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
		
	}

}
