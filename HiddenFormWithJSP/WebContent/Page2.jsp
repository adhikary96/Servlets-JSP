<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 2</title>
</head>
<body>
	<%
		String fname = request.getParameter("first");
		String lname = request.getParameter("last");
		String mobile = request.getParameter("phone"); 
	%>

	<form action='Page3.jsp' method='post'>
		<input type='hidden' name='first' value='<%= fname %>'>
		<input type='hidden' name='last' value='<%= lname %>'>
		<input type='hidden' name='phone' value='<%= mobile %>'>
		Email :<input type='text' name='email'><br />
		Gender :<input type='text' name='gender'><br />
		<input type='submit' value='Continue'>
	</form>
	<%-- <%@include file="Page3.jsp" %> --%>
</body>
</html>