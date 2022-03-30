
<%
String nomeAdmin = (String) session.getAttribute("nomeadmin");
if (nomeAdmin != null) {
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
	<jsp:include page="header.jsp"></jsp:include>
	<div class="d-flex justify-content-center">
		<div class="page-header m-3">
			<h3>Statistiche corsista</h3>
			<form action="Admin.jsp">
				<td>
					<button type="submit">Torna alla pagina admin</button>
				</td>
			</form>
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