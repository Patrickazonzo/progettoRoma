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
	<jsp:include page="header.jsp"></jsp:include>
	<div class="d-flex justify-content-center corpo">
		<div class="page-header m-3">
			<h3>Admin Login</h3>

			<img class="icona" alt="icona" src="img/icona.png">

		</div>

		<div class="form-group ">
			<label class="control-label">Nome</label>
			<div class=" inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-user"></i>
					</span> <input type="text" name="Nome" placeholder="Nome..."
						class="form-control">
				</div>
			</div>
			<div class="col-md-7 control-label"></div>



			<label class="control-label">CodCliente</label>
			<div class="inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-lock"></i>
					</span> <input type="password" name="CodCliente"
						placeholder="CodCliente..." class="form-control">
				</div>
			</div>
			<div class="col-md-7 control-label"></div>

			<div class="row">
				<div class="col-md-4  col-md-offset-1 d-flex ">

					<button type="submit" class="btn btn-warning mr-2 ">
						LOGIN<span class="glyphicon glyphicon-log-in"></span>
					</button>

					<a href="registrati.jsp"><button type="button"
							class="btn btn-warning">
							REGISTRATI<span class="glyphicon glyphicon-log-in"></span>
						</button></a>
				</div>
			</div>
		</div>
	</div>
	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>