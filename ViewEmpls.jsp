<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr><th>EMPNO<TH>EMP NAME<TH>LOCATION</TH></tr>
		<c:forEach var="emp" items="${empls}"> 
			<tr>
				<td><c:out value="${emp.empno}"></c:out>  </td>
				<td><c:out value="${emp.ename}"></c:out>  </td>
				<td><c:out value="${emp.job}"></c:out>  </td>
				<td><a href="UpdateEmp?code=${emp.empno}">Update </a></td>
				<td><a href="DeleteEmp?code=${emp.empno}">Delete </a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>