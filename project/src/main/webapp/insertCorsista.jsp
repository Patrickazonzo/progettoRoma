<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
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
	 <div class="page-header m-3">
		<h3>Completa il form per aggiungere un nuovo corsista</h3>	
	</div>
	<form action="/<%=application.getServletContextName()%>/inseriscicorsista" method="post" class="form-horizontal">
		<div class="form-group">
			<label class="control-label">Nome Corsista</label>
			<div class=" inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon">
					<i class="glyphicon glyphicon-user"></i>
					</span>
					<input type="text" name="nomecorsista" placeholder="Nome..." class="form-control">
				</div>
			</div>
			<div class="col-md-7 control-label"></div>
		</div>

		<div class="form-group">
			<label class="control-label">Cognome Corsista</label>
			<div class="inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon"> 
					<i class="glyphicon glyphicon-lock"></i>
					</span> 
					<input type="text" name="cognomecorsista" placeholder="Cognome..." class="form-control">
				</div>
			</div>
			<div class="col-md-7 control-label"></div>
		</div>
		
		
		<div class="row">
				<div class="col-md-4 col-md-offset-1">
					<button type="submit" class="btn btn-warning">
						Inserisci<span class="glyphicon glyphicon-log-in"></span>
					</button>
				</div>
			</div>
		</form>
	</div>
	
	
	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>