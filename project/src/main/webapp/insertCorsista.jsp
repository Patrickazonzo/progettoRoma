<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
		<div>
			<h3 text-align="center">
				Registrazione corsista<br>Tutti i campi sono obbligatori
			</h3>
		</div>

	<form action="inseriscicorsista" method="post" class="form-horizontal">
				<div class="form-group ">
					<label class="control-label">Nome</label>					
						 <i class="glyphicon glyphicon-user"></i>
							<input type="text" name="nomecorsista" placeholder="Nome..."
								class="form-control">
				</div>
					
					

					
						<label class="control-label">Cognome</label>
						<div class=" inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i>
								</span> <input type="text" name="cognomecorsista" placeholder="Cognome..."
									class="form-control"></div>
						</div>					

						<label class="control-label">Corso</label>
						<div class="inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-lock"></i>
								</span><input type="text" name="nomecorso"
									placeholder="corso..." class="form-control">
							</div>
						</div>					
						
						<label class="control-label">Data inizio corso</label>
						<div class=" inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i>
								</span> <input type="text" name="datainiziocorso" placeholder="Data inizio corso..."
									class="form-control">
							</div>
						</div>						
					
						<label class="control-label">Data fino corso</label>
						<div class=" inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i>
								</span> <input type="text" name="datafinecorso" placeholder="Data fine corso..."
									class="form-control">
							</div>
						</div>						
					
						<label class="control-label">Commenti</label>
						<div class=" inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i>
								</span> <input type="text" name="commenti" placeholder="Commenti..."
									class="form-control">											
							</div>
						</div>						
					
						<label class="control-label">Precedenti formativi</label>
						<div class=" inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i>
								</span> <input type="text" name="precedentiformativi" placeholder="1 o Zero"
									class="form-control">											
							</div>
						</div>						
					
						<label class="control-label">Aula corso</label>
						<div class=" inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i>
								</span> <input type="text" name="aulacorso" placeholder="Aula corso..."
									class="form-control">											
							</div>
						</div>						
						
						<label class="control-label">Docente</label>
						<div class=" inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i>
								</span> <input type="text" name="docente" placeholder="Docente..."
									class="form-control">											
							</div>
						</div>						

						<div class="row">
							<div class="col-md-4  col-md-offset-1 d-flex ">
								<input type="submit" class="btn btn-warning mr-2 mt-4 ">
									<span class="glyphicon glyphicon-log-in"></span>						
							</div>
						</div>				
			</form>

	<div>
		<img id="dea1" alt="Logo" src="img/12.png">
	</div>




	<a><img id="dea" alt="Logo" src="img/dea.png"></a>

	<footer class="footer"><%@ include file="footer.html"%>
	</footer>
</body>
</html>