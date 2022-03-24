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

		<div class="container-fluid d-flex justify-content-between bd-light"
			id="imgCorsista">
<div></div>
			<div>
				<table>
					<tr>
						<td colspan="2" align="center"><b>Registrazione corsista<br>Tutti
								i campi sono obbligatori
						</b></td>
					</tr>
					<tr>
						<td><b>*Nome Corsista</b></td>
						<td><input type="text" name="nomecorsista"></td>
					</tr>
					<tr>
						<td><b>*Cognome Corsista</b></td>
						<td><input type="text" name="cognomecorsista"></td>
					</tr>


					<tr>
						<td><b>*Nome Corso</b></td>
						<td><input type="text" name="nomecorso"></td>
					</tr>
					<tr>
						<td><b>*Data inizio corso</b></td>
						<td><input type="date" name="datainiziocorso"></td>
					</tr>
					<tr>
						<td><b>*Data fine corso</b></td>
						<td><input type="date" name="datafinecorso"></td>
					</tr>
					<tr>
						<td><b>Commenti</b></td>
						<td><textarea class="textarea" style="resize: none"
								name="commenti" rows="4" cols="50"></textarea></td>
					</tr>
					<tr>
						<td><b>Corsi Precedenti</b></td>
						<td><input type="checkbox" name="Si"> Si <input
							type="checkbox" name="No"> No</td>

					</tr>
					<tr>
						<td><b>Aula Corso</b></td>
						<td><input type="text" name="aulacorso"></td>
					</tr>

					<tr>
						<td></td>
						<td><a href="#"><button type="button"
									class="btn btn-warning">
									INVIA<span class="glyphicon glyphicon-log-in"></span>
								</button></a></td>
					</tr>

				</table>
			</div>
			<img id="dea1" alt="Logo" src="img/12.png">
		</div>




	<a><img id="dea" alt="Logo" src="img/dea.png"></a>

	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>