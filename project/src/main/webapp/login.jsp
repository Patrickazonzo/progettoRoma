<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="css/Style.css">
<meta charset="ISO-8859-1">
<%@include file="CDN.html"%>
<title>login</title>
</head>
<body>
	<header>
	<nav class="navbar navbar-expand-lg " id="apice">
			<div>
				<a class="navbar-brand"><img alt="Logo" src="img/logo2.png"></a>
			</div>
	</nav>
	</header>
	<div class="d-flex justify-content-center corpo">
		<div class="page-header m-3">
			<h3>Admin Login</h3>

			<img class="icona" alt="icona" src="img/icona.png">

		</div>

	<form action="controlloadmin" method="post" class = "form-horizontal">
		<div class="form-group ">
			<label class="control-label">Nome</label>
			<div class=" inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-user"></i>
					</span> <input type="text" name="nomeadmin" placeholder="Nome..."
						class="form-control">
				</div>
			</div>
			<div class="col-md-7 control-label"></div>

			<div class="form-group ">
			<label class="control-label">Cognome</label>
			<div class=" inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-user"></i>
					</span> <input type="text" name="cognomeadmin" placeholder="Cognome..."
						class="form-control">
				</div>
			</div>
			<div class="col-md-7 control-label"></div>

			<label class="control-label">CodAdmin</label>
			<div class="inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-lock"></i>
					</span> <input type="password" name="codadmin"
						placeholder="Codice Amministratore..." class="form-control">
				</div>
			</div>
			<div class="col-md-7 control-label"></div>

			<div class="row">
				<div class="col-md-4  col-md-offset-1 d-flex ">

					<button type="submit" class="btn btn-warning mr-2 mt-4 ">
						LOGIN<span class="glyphicon glyphicon-log-in"></span>
					</button>

					<a href="registrati.jsp"><button type="button"
							class="btn btn-warning mt-4">
							REGISTRATI<span class="glyphicon glyphicon-log-in"></span>
						</button></a>
				</div>
			</div>
			</div>
				</div>
		</form>
		</div>

	<footer class="footer"><%@ include file="footer.jsp"%>
	</footer>
</body>
</html>