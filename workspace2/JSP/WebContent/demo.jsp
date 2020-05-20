
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Today is
		<%=new Date()%></h1>
		
		
		<h1>Scripting elements</h1>
		
		<%=a+b%>
		
		<%! int a=10; int b=20; %>
		<%out.println(a+b); %>
</body>
</html>