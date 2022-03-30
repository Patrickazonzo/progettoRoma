
<%
String nomeAdmin = (String) session.getAttribute("nomeadmin");
if (nomeAdmin != null) {
%>
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
	<div class="cors">
		<div class="text-center">
			<h3>Registrazione corsista</h3>
		</div>
		
		<div class="d-flex justify-content-center mt-5">
			<form action="inseriscicorsista" method="post" class="form-horizontal">			
				<div class="d-flex justify-content-between mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label"><b>Nome</b></label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	  <input type="text" name="nomecorsista" placeholder="Nome..."
									class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				
				
				<div class="d-flex justify-content-between mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label"><b>Cognome	</b></label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	  <input type="text" name="cognomecorsista" placeholder="Cognome..."
									class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				 
				 <div class="d-flex justify-content-between mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label"><b>Corso</b></label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	  <input type="text"
						name="nomecorso" placeholder="corso..." class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				
				
				 <div class="d-flex justify-content-between mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label"><b>Data inizio corso</b></label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	  <input type="text"
						name="datainiziocorso" placeholder="Data inizio corso..." class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				
				
				 <div class="d-flex justify-content-between mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label"><b>Data fine corso</b></label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	  <input type="text"
						name="datafinecorso" placeholder="Data fine corso..." class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				 
				  <div class="d-flex justify-content-between mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label">Commenti</label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	 <input type="text"
						name="commenti" placeholder="Commenti..."
						class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				 
				  <div class="d-flex  mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label">Precedenti formativi</label>
				    </div>
				   	   
				   	   <div class="btn-group btn-group-toggle" data-toggle="buttons">
				   	   	<label class="btn">
	    					<input type="radio" name="1" > Si
	 					 </label>
						<label class="btn">
	    					<input type="radio" name="0" > No
	 					 </label>
				   	 </div>
				   	 
				   	  <!--  	 <input type="text"
						name="precedentiformativi" placeholder="1 o Zero"
						class="form-control" aria-describedby="passwordHelpInline">    -->
				   	   	 </div> 			   	   			    
				
				 
				  <div class="d-flex justify-content-between mb-3">
				   <div class="col-auto">     
				   	<label class="col-form-label">Aula corso</label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	 <input type="text"
						name="aulacorso" placeholder="Aula corso..." class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				 
				   <div class="d-flex justify-content-between mb-3">
				  	 <div class="col-auto">     
				   		<label class="col-form-label">Docente</label>
				    </div>
				   	   	<div class="col-auto">   
				   	   	 <input type="text"
						name="docente" placeholder="Docente..." class="form-control" aria-describedby="passwordHelpInline">   
				   	   	 </div> 			   	   			    
				 </div>
				<div class="row d-flex justify-content-end">
				
					
						<input type="submit" class="btn btn-primary mt-4"><span
							class="glyphicon glyphicon-log-in"></span>
					
				</div>
				
			</form>
	
			<!--  <div class="ml-5">
				<img id="dea1" alt="Logo" src="img/12.png">
			</div>-->
		</div>
	
	</div>
	
	<!-- 	<a><img id="dea" alt="Logo" src="img/dea.png"></a>
	 -->
		<footer class="footer"><%@ include file="footer.html"%>
		</footer>
	
</body>
</html>
<%
} else {
response.sendRedirect("accessonegato.jsp");
}
%>