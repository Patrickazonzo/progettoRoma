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
	<div class="cors pt-5 pb-5">
	 <div class="social-bar pt-5 pb-5">
        <ul>
          <li class=" pt-5 mb-4"><a href="insertCorsista.jsp"><img alt="Logo" class="stud" src="img/studente.png"><b class="ml-2">Inserisci corsista</b></a></li>
          <li class="mb-4"><a href="visualizzareport.jsp"><img alt="Logo" class="stud" src="img/studente.png"><b class="ml-2">Statistiche</b></a></li>
          <li class="pb-5"><a href="#"><img alt="Logo" class="stud" src="img/studente.png"><b class="ml-2">Elimina Corso</b></a></li>
        </ul>
      </div>
     </div>
	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>