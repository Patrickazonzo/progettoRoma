<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrati</title>
</head>
<body>
<form method="post" name="modulo">
	<table>
			<tr>
				<td colspan="2" align="center"><b>Registrazione al servizio<br>Tutti
						i campi sono obbligatori
				</b></td>
			</tr>
			<tr>
				<td><b>Nome</b></td>
				<td><input type="text" name="nome"></td>
			</tr>
			<tr>
				<td><b>Cognome</b></td>
				<td><input type="text" name="cognome"></td>
			</tr>
			<tr>
				<td><b>CodAdmin</b></td>
				<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="right"><input type="button"
					value="Invia" onClick="Modulo()"></td>
			</tr>
	
	</table>
		</form>
</body>
</html>