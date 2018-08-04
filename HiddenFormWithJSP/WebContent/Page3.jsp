<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 3</title>
</head>
<body>
	<%
		String fname = request.getParameter("first");
		String lname = request.getParameter("last");
		String mobile = request.getParameter("phone");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender"); 
	%>
	<form action='PageDisplay.jsp' method='post'>
		<input type='hidden' name='first' value='<%= fname %>'>
		<input type='hidden' name='last' value='<%= lname %>'>
		<input type='hidden' name='phone' value='<%= mobile %>'>
		<input type='hidden' name='email' value='<%= email%>'>
		<input type='hidden' name='gender' value='<%= gender%>'>
		Country :<input type='text' name='country'><br/>
		State :<input type='text' name='state'><br/>
		<input type='submit' value='Continue'>
	</form>
	<%-- <%@include file="PageDisplay.jsp" %> --%>
</body>
</html>