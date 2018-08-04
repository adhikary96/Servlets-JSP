<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 1</title>
</head>
<body>
	<form action="Page2.jsp" method="post">
		First Name:<input type="text" name="first"><br/>
		Last Name :<input type="text" name="last"><br/>
		Mobile No.:<input type="text" name="phone"><br/>
		<input type="submit" value="Continue">
	</form>
	<%-- <%@include file="Page2.jsp" %> --%>
</body>
</html>