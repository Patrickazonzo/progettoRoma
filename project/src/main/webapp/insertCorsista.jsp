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
				   	<label class="col-form-label"><b>Cognome</b></label>
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
						name="nomecorso" placeholder="Corso..." class="form-control" aria-describedby="passwordHelpInline">   
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
					   	  <div class="mt-2 d-flex"> 
						   	  <div class="form-check mr-2"> 
						   	    <input class="form-check-input" type="radio" name="precedentiformativi" id="exampleRadios1" value="1">  
						   	     	<label class="form-check-label" for="exampleRadios1">Si</label> 
						   	  </div>
						   	   <div class="form-check">   
						   	     	<input class="form-check-input" type="radio" name="precedentiformativi" id="exampleRadios2" value="0"> 
						   	       		<label class="form-check-label" for="exampleRadios2">No</label> 
						   	   </div>
					   	 </div>
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
		</div>	
	</div>	
	<footer class="footer"><%@ include file="footer.jsp"%>
	</footer>
	
</body>
</html>
<%
} else {
response.sendRedirect("accessonegato.jsp");
}
%>