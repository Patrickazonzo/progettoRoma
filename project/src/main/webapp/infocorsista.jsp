<%
String nomeAdmin = (String) session.getAttribute("nomeadmin");
if (nomeAdmin != null) {
%>
<%@page import="com.betacom.businesscomponent.utility.CorsistaUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="CDN.html"%>
<title>Statistiche corsista</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="cors">
		<div class="text-center">
			<h3>Statistiche corsista</h3>
		</div>
			<table>
				<thead>
					<tr>
						<th>Codice corso</th>
						<th>Nome corso</th>
						<th>Data inizio corso</th>
						<th>Data fine corso</th>
						<th>Costo corso</th>
						<th>Commenti corso</th>
						<th>Aula corso</th>
						<th>Codice docente</th>
						<th>Codice corsista</th>
						<th>Codice corso</th>
						<th>Nome corsista</th>
						<th>Cognome corsista</th>
						<th>Precedenti formativi</th>
					</tr>
				</thead>
				<tbody>
					<%
					CorsistaUtility cU = new CorsistaUtility();
					String[] dati = cU.getInfoCorsista(request.getParameter("codcorsista"));
					
					%>
					
					<tr>
						<td><%=dati[0]%></td>
						<td><%=dati[1]%></td>
						<td><%=dati[2]%></td>
						<td><%=dati[3]%></td>
						<td><%=dati[4]%></td>
						<td><%=dati[5]%></td>
						<td><%=dati[6]%></td>
						<td><%=dati[7]%></td>
						<td><%=dati[8]%></td>
						<td><%=dati[9]%></td>

						<td><%=dati[11]%></td>
						<td><%=dati[12]%></td>
						<td><%=dati[13]%></td> 
						


					</tr>
				</tbody>

			</table>
			<center>
				<td>
					<form action="Admin.jsp" method="post">
						<input type="submit" class="btn btn-outline-info" role="button" aria-pressed="true" value="Torna alla pagina di amministrazione">
					</form>
				</td>
			</center>
			</div>
	<footer class="footer"><%@ include file="footer.jsp"%>
	</footer>
</body>
</html>
<%
} else {
response.sendRedirect("accessonegato.jsp");
}
%>