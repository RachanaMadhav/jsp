<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int group='e'; %>
<%switch(group){
case 'c':{%>
<h2>CSE group</h2>
<%}break; case 'e':{ %>
<h2>EEE Group</h2>
<%}break;case 'm':{ %>
<h2>Mechanical group</h2>
<%}break;default:{ %>
<h2>ECE</h2>
<%}} %>

}
</body>
</html>