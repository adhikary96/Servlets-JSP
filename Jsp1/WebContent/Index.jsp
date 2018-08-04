<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%@include file="File1.jsp" %>
		
		<%!
			int count=0;
			public void incCount(){
				count += 1;
			}
		%>
		<%incCount();%>
		<h2><i>The page is visited:<%= count %> times.</i></h2><hr/>
		<div>
			<%@include file="File1.jsp" %>
		</div>
	</body>
</html>	