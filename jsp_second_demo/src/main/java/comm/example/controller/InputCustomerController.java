package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import comm.example.dao.CustomerDAO;
import comm.example.dao.CustomerDAOImpl;
import comm.example.model.Customer;


//@WebServlet("/controller.do")

public class InputCustomerController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private String firstName, lastName;
	private CustomerDAO dao;
	private List<String> errors = null;
	private String email;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hey I am in controller.do");
		errors = new LinkedList<String>();
		firstName = request.getParameter("fName");
		/*
		if ((firstName == null)) {
			errors.add("<font color='red'>first name can't be null </font>");
		}
		*/
		lastName = request.getParameter("lName");
		/*
		if ((lastName == null)) {
			errors.add("<font color='red'>last name can't be null </font>");
		}
		*/
		email = request.getParameter("email").toString();
		/*
		if (email.length()<8) {
			errors.add("<font color='red'>email field can't be blank</font>");
		}

		
		if (!errors.isEmpty()) {
			request.setAttribute("errors", errors);
			errors = null;
			RequestDispatcher view = request.getRequestDispatcher("add-customer.jsp");
			view.forward(request, response);
		} else {
		*/
			//request.setAttribute("success", new Customer(firstName, lastName,email));
			
			dao.createCustomer(new Customer(firstName, lastName,email));

			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			view.forward(request, response);

		//}
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		dao = new CustomerDAOImpl();
	}
	
}
