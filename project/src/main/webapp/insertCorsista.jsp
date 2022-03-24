<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/Style.css">
<meta charset="ISO-8859-1">
<%@include file="CDN.html"%>
<title>Inserisci nuovo Corsista</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<!-- 
	codice corsista
	nome corsista
	cognome corsista
	precedenti formativi "SI|NO" as "1|0"
	 -->
	<div class="container-fluid d-flex justify-content-center bd-light" 
		id="imgCorsista">
		<form method="post" name="modulo">
			<div >
				<table>
					<tr>
						<td colspan="2" align="center"><b>Registrazione corsista<br>Tutti
								i campi sono obbligatori
						</b></td>
					</tr>
					<tr>
						<td ><b>CodCorsista</b></td>
						<td><input type="password" name="password"></td>
					</tr>

					<tr>
						<td ><b>NomeCorsista</b></td>
						<td><input type="text" name="nome"></td>
					</tr>
					<tr>
						<td><b>CognomeCorsista</b></td>
						<td><input type="text" name="cognome"></td>
					</tr>

					<tr>
						<td ><b>Corsi Precedenti</b></td>
						<td><input type="checkbox" name="Si"> Si <input
							type="checkbox" name="No"> No</td>

					</tr>
					<tr>
						<td ></td>
						<td><a href="#"><button type="button"
									class="btn btn-warning">
									INVIA<span class="glyphicon glyphicon-log-in"></span>
								</button></a></td>
					</tr>

				</table>
			</div>
		</form>
	</div>
	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>