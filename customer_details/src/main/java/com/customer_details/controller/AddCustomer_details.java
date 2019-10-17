package com.customer_details.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCustomer_details
 */
public class AddCustomer_details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	private String id;
	private List<String> errors;
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		errors = new ArrayList<String>();
		
		id = request.getParameter("id");
		
		if(id.length()<=0) {
			
			errors.add("year field must be numeric");

		}
			
		
		name=request.getParameter("name");
		
		if(name.length()<=8)
		{
			errors.add("invalid title");
		}
		type=request.getParameter("type");
		if(type.equals("Unknown"))
		{
			errors.add("select a season");
		}
		if(!errors.isEmpty())
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
		else
		{

			RequestDispatcher view=request.getRequestDispatcher("success.html");
			view.forward(request, response);
		}

	}

}
