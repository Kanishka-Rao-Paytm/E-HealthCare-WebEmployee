package com.paytm.health.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.paytm.health.dao.EmployeeDao;
import com.paytm.health.model.Employee;
@WebServlet("/employeeregister")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao empdao = new EmployeeDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		disp.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String fullname = request.getParameter("fullname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String jobrole = request.getParameter("jobrole");
		String dept = request.getParameter("dept");

		Employee emp = new Employee();
		emp.setId(id);
		emp.setFullname(fullname);
		emp.setPhone(phone);
		emp.setEmail(email);
		emp.setJobrole(jobrole);
		emp.setDept(dept);
		
		try {
			empdao.registerEmployee(emp);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		disp.forward(request, response);
	}
}
