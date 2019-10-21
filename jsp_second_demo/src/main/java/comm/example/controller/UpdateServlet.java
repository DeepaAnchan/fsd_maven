package comm.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.CustomerDAO;
import comm.example.dao.CustomerDAOImpl;
import comm.example.model.Customer;

/**
 * Servlet implementation class UpdateServlet
 */
//@WebServlet("/Update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO dao;

	@Override
	public void init() throws ServletException {
		dao = new CustomerDAOImpl();
	}

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
		
		int id = Integer.parseInt(request.getParameter("CustomerId2"));
		
		Customer c=dao.findById(id);
		//Customer cf = new Customer("sILAS","daran","try@de");
		//Customer c=dao.findById(Integer.parseInt(request.getParameter("CustomerId").toString()));
		request.setAttribute("customer2", c);
		RequestDispatcher view=request.getRequestDispatcher("customer-update-form.jsp");
		view.forward(request, response);

	}

}
