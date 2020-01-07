package com.deloitte.empl.dao;
import java.sql.Date;
import java.util.List;

import com.deloitte.empl.beans.Emp;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	void delEmp(int empcode);
	int updateSalByCode(double sal,int empcode);
	int updateAll(String ename,String job,int mgr,Date hiredate,double sal,double comm,int deptno,int empno);
	int updateEmp(Emp emp);
	
}
