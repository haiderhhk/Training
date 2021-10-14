<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="base.jsp" %>
<%@include file="style.jsp" %>
<body>

<h1>INdex Page</h1>

<%=session.getAttribute("user")%>
</body>
</html>