<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function validate1()
{
	if(document.myForm.user.value=="")
	{
	//alert("Please provide your name!");
	document.getElementById("f1").innerHTML=
    "<font color=red>Name Should not be empty</font>";
	document.myForm.user.focus();
	return false;
	}
	if(document.myForm.pass.value=="")
	{
	//alert("Please provide your Email");
	document.getElementById("f2").innerHTML=
    "<font color=red>Password Should not be empty</font>";
	document.myForm.pass.focus();
	return false;
	}
	return (true);
}
</script>
</head>
<body>
	<form action="Validate.jsp"name="myForm" onsubmit="return(validate1());">
		Enter Name<input type="text" name="user"><span id="f1"></span><br>
		Enter Password<input type="text" name="pass"><span id="f2"></span><br>
		<input type="submit">
		</form>
		
	
</body>
</html>