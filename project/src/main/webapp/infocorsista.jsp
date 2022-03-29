<%
	String nomeAdmin= (String) session.getAttribute("nomeadmin");
	if(nomeAdmin!=null){
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="CDN.html"%>
<title>Statistiche corsista</title>
</head>
<body>
	<h3>Statistiche corsista</h3>
	<% }else {
		response.sendRedirect("accessonegato.jsp");
	} %>
</body>
</html>