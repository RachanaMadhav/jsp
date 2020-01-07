package com.deloite.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class DeletedList
 */
@WebServlet("/DeletedList")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int empno=Integer.parseInt(request.getParameter("code"));
		EmpDao dao=new EmpDaoImpl();
		dao.delEmp(empno);
		System.out.println("Deleted");
		request.getRequestDispatcher("GetEmp").forward(request, response);
	}

}
