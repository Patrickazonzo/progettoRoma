<%@page import="com.betacom.businesscomponent.facade.AdminFacade"%>
<%@page import="com.betacom.businesscomponent.model.Corsista"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Vector"%>
<%@ page import="com.betacom.businesscomponent.utility.ReportUtility" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="CDN.html"%>
<title>REPORT</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%
ReportUtility rU = new ReportUtility();
String [] stat = rU.getReport();

Float giorni = 0.0f;
giorni = Float.parseFloat(stat[3]);
int g= (int) (giorni*5/7); 
%>

<h3>Statistiche</h3>
<table> 
	<tr>
		<td>Numero corsisti totali: </td><td><%=stat[0]  %></td>
	</tr> 
	<tr>
		<td>corso più frequentato</td><td><%=stat[1]  %></td>
	</tr> 
	<tr>
		<td>Data di inizio ultimo corso</td><td><%= stat[2] %></td>
	</tr>
	<tr>
		<td>Durata media dei corsi</td><td><%= g %> giorni lavorativi</td>
	</tr> 
	<tr>
		<td>Numero di commenti presenti</td><td><%=stat[4]  %></td>
	</tr> 
	<tr>
		<td>Elenco corsisti</td><td><table class="table table-hover">
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
				</table></td>
	</tr> 
	<tr>
		<td>Docente che può tenere più tipologie di corso</td><td><%=stat[5]  %></td>
	</tr> 
	<tr>
		<td>Corsi con posti disponibilir</td><td><%=stat[6]  %></td>
	</tr> 
	
</table>

</body>
</html>