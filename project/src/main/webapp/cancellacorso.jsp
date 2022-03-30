<%
String nomeAdmin = (String) session.getAttribute("nomeadmin");
if (nomeAdmin != null) {
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.betacom.businesscomponent.model.Corso"%>
<%@page import="com.betacom.businesscomponent.facade.AdminFacade"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="CDN.html"%>
<meta charset="ISO-8859-1">
<title>Cancella corso</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="cors">
	<div class="text-center">
		<h3>Elenco corsi</h3>
	</div>
<div class="d-flex justify-content-center mb-3">
			
			<table class="table table-hover">
						<thead>
							<tr>
							<th>Codice Corso</th>
							<th>Nome Corso</th>
							<th>Data inizio corso</th>
							<th>Data fine corso</th>
							<th>Costo corso</th>
							<th>Commenti corso</th>
							<th>Aula corso</th>
							<th>Codice docente del corso</th>
							
							</tr>
						</thead>
						<tbody>
						
						
						<%
						Corso[] corso = AdminFacade.getInstance().getAllCorsi();
						for (int i = 0; i < corso.length; i++){
							
						%>
							<tr> 
								
								<td><form action="cancella" method="post">
								<input type="submit" class="btn btn-outline-danger" role="button" 
								name="codcorso" aria-pressed="true" value="<%= (Long)(corso[i].getCodCorso()) %>">
									</form>
								</td>
								<td><%=corso[i].getNomeCorso() %></td>
								<td><%=corso[i].getDataInizioCorso() %></td>
								<td><%=corso[i].getDataFineCorso() %></td>
								<td><%=corso[i].getCostoCorso() %></td>
								<td><%=corso[i].getCommentiCorso() %></td>
								<td><%=corso[i].getAulaCorso() %></td>
								<td><%=corso[i].getCodDocente() %></td>
								  
							</tr>
						
							
				<% } %>
						</tbody>
					</table>
	</div>
	<div>
					<form action="Admin.jsp" method="post">
						<input type="submit" class="btn btn-outline-info" role="button" aria-pressed="true" value="Torna alla pagina di amministrazione">
					</form>
				</div>
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