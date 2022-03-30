<%
String nomeAdmin = (String) session.getAttribute("nomeadmin");
if (nomeAdmin != null) {
%>
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
<div class="cors">
		<div class="text-center">
				<h3>Statistiche</h3>
		</div>

	<div class="d-flex justify-content-center mb-3">
		<table>
			<tr>
				<td><b>Numero corsisti totali: </b></td><td><%=stat[0]  %></td>
			</tr> 
			<tr>
				<td><b>Corso più frequentato: </b></td><td><%=stat[1]  %></td>
			</tr> 
			<tr>
				<td><b>Data di inizio ultimo corso: </b></td><td><%= stat[2] %></td>
			</tr>
			<tr>
				<td><b>Durata media dei corsi: </b></td><td><%= g %> giorni lavorativi</td>
			</tr> 
			<tr>
				<td><b>Numero di commenti presenti: </b></td><td><%=stat[4]  %></td>
			</tr> 
		</table>
	</div>
	
	<div class="d-flex justify-content-center mb-3">
		<table>
		<tr>
			<td><b>Elenco corsisti</b></td>
			<td>
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
								
								<td><form action="infocorsista.jsp" method="post">
								<input type="submit" class="btn btn-outline-info" role="button" name="codcorsista" aria-pressed="true" value="<%= corsisti[i].getCodCorsista()%>">
									</form>
								</td>
								<td><%=corsisti[i].getNomeCorsista() %></td>
								<td><%= corsisti[i].getCognomeCorsista()  %></td>
								<td><%= corsisti[i].getPrecedentiFormativi() %>  </td>
							</tr>
						
							
				<% } %>
						</tbody>
					</table>
				
			</td>
		</tr>
	</table>
</div>
	<div class="d-flex justify-content-center mb-3">
		<table>
			<tr>
				<td><b>Docente che può tenere più tipologie di corso: </b></td><td><%=stat[5]  %></td>
			</tr> 
			<tr>
				<td><b>Corsi con posti disponibili: </b></td><td><%=stat[6]  %></td>
			</tr> 
		</table>
	</div>

</div>

	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>
<%
} else {
response.sendRedirect("accessonegato.jsp");
}
%>