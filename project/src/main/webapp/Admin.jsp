<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/Style.css">
<%@include file="CDN.html"%>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>



	<div class="container-fluid d-flex justify-content-between" id="flo">
	
		<button type="button" class="btn  uno" >INSERISCI
			CORSISTA</button>

		<button type="button" class="btn due">VISUALIZZA STATISTICHE</button>

		<button type="button" class="btn  tre">ELIMINA CORSO</button>
		
	</div>

	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>