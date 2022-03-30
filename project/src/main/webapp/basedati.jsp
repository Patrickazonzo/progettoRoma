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
<div class="cors">
		<div class="text-center">
			<h3>Elenco Corsisti</h3>
		</div>
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
			</div>
			<td>
					<form action="Admin.jsp" method="post">
						<input type="submit" class="btn btn-outline-info" role="button" aria-pressed="true" value="Torna alla pagina di amministrazione">
					</form>
				</td>
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

