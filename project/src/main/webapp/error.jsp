<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Errore nell'esecuzione</title>
</head>
<body>
<%
	if(exception instanceof ClassNotFoundException) {
%>
<h1>Driver non trovato</h1>
<p><%= exception.getMessage() %>
<%
	} else if(exception instanceof SQLException){
%>
<h1>SQLException registrata</h1>
<p><%= exception.getMessage() %>
<p><%= ((SQLException)exception).getErrorCode() %>
<%
	}else{
%>
<h1>Eccezione non prevista</h1>
<p><%= exception.getClass().getName() %>
<p><%= exception.getMessage() %>
<% } %>


</body>
</html>