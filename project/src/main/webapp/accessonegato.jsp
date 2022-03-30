<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="CDN.html"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Accesso negato</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<div class="page-header">
	<h3>Non puoi accedere a questa pagina</h3>
</div>
<div class="panel panel-danger">
	<div class="panel-heading">
		<h3>Risorsa non disponibile</h3>
	</div>
	<div class="panel-body">
	<p>Per effettuare di nuovo il login:
	<a href="login.jsp">Login Admin</a></p>
	</div>
</div>
</div>
<footer class="footer"><%@ include file="footer.jsp" %>
</footer>
</body>
</html>