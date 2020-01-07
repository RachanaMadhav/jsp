package com.deloite.empl.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;
import com.deloitte.empl.utils.ConvertDate;

/**
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/UpdateEmp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpDao dao = new EmpDaoImpl();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("code"));
		Emp emp=dao.getEmpByCode(code);
		request.setAttribute("emp",emp);
		request.getRequestDispatcher("UpdateEmp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empno=Integer.parseInt(request.getParameter("empno"));
		String ename=request.getParameter("ename");
		String job=request.getParameter("job");
		//int mgr=Integer.parseInt(request.getParameter("mgr"));
		//Date hiredate=ConvertDate.parseDate(request.getParameter("hiredate"));
		//double sal=Double.parseDouble(request.getParameter("sal"));
		//double comm=Double.parseDouble(request.getParameter("comm"));
		//int deptno=Integer.parseInt(request.getParameter("deptno"));
		Emp emp=new Emp();
		emp.setEmpno(empno);
		emp.setEname(ename);
		emp.setJob(job);
		//emp.setMgr(mgr);
		//emp.setHiredate(hiredate);
	//	emp.setSal(sal);
		//emp.setComm(comm);
	//	emp.setDeptno(deptno);
		int rows=dao.updateEmp(emp);
		request.getRequestDispatcher("GetEmp").forward(request, response);
		
	}

}
