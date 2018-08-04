<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<%
		String fname = request.getParameter("first");
		String lname = request.getParameter("last");
		String mobile = request.getParameter("phone");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String state = request.getParameter("state"); 
	%>
	
	<center><h2>
		First Name:<%= fname %><br/>
		Last Name:<%= lname %><br/>
		Mobile No.:<%= mobile %><br/>
		Email ID:<%= email %><br/>
		Gender:<%= gender %><br/>
		Country:<%= fname %><br/>
		state:<%= state %><br/>
	</h2></center>
</body>
</html>