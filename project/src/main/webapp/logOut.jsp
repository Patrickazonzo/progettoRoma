
<%
	String nomeAdmin= (String) session.getAttribute("nomeadmin");
	if(nomeAdmin!=null){
		session.invalidate();
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="CDN.html"%>
<meta http-equiv="refresh" content="2; URL='login.jsp'" />
<title>LogOut</title>
</head>
<body>
	<div class="d-flex flex-colum justify-content-center">
		<div class="pt-5">
			<img alt="ceck" src="img/ceck.png">
			<h3>Log Out Eseguito con Successo</h3>
			</div>
			<p>Per accedere di nuovo :
				<a href="login.jsp">Login</a>
			</p>
		</div>
</body>
</html>
<% 
	}else{
		response.sendRedirect("login.jsp");
	}

%>




