<%
	String nomeAdmin= (String) session.getAttribute("nomeadmin");
	if(nomeAdmin!=null){
%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.betacom.businesscomponent.model.Corsista"%>
<%@page import="com.betacom.businesscomponent.facade.AdminFacade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="CDN.html"%>
<title>Base Dati</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<div class="container">
		<div class="page-header">
			<h3>Elenco Corsisti</h3>
			<div class="table-responsive">
				<table class="table table-hover">
					<thead>
						<tr>
						<th>Codice Corsista</th>
						<th>Nome Corsista</th>
						<th>Cognome Corsista</th>
						<th>Precedenti formativi</th>
						</tr>
					</thead>
					<tbody>
					<%
					Corsista[] corsisti = AdminFacade.getInstance().getAllCorsisti();
					for (int i = 0; i < corsisti.length; i++){
						
					%>
						<tr>
							<td><%= corsisti[i].getCodCorsista() %></td>
							<form action="infocorsista.jsp"><td>
							 <button type="submit"><%= corsisti[i].getNomeCorsista()%></button>
							 </form></td>
							<td><%= corsisti[i].getCognomeCorsista()  %></td>
							<td><%= corsisti[i].getPrecedentiFormativi() %></td>			
						</tr>
			<% } %>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
<%
	} else {
		response.sendRedirect("accessonegato.jsp");
	}
%>

