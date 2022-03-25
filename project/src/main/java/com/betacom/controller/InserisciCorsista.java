package com.betacom.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.facade.AdminFacade;
import com.betacom.businesscomponent.idgenerator.CorsistaIdGenerator;
import com.betacom.businesscomponent.model.Corsista;
import com.betacom.businesscomponent.model.CorsistaCorso;
import com.betacom.businesscomponent.model.Corso;
import com.betacom.businesscomponent.utility.DateUtility;


@WebServlet("/inseriscicorsista")
public class InserisciCorsista extends HttpServlet {
	
	 private static final long serialVersionUID = 4975300134006616204L; 
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	   throws ServletException, IOException { 
	  AdminFacade aF = AdminFacade.getInstance(); 
	  Corsista corsista = new Corsista(); 
	  CorsistaCorso cc = new CorsistaCorso(); 
	  Corso c = new Corso(); 
	 
	  try { 
	 
	   corsista.setCodCorsista(CorsistaIdGenerator.getInstance().getNextId()); 
	 
	   boolean verificanome = Pattern.matches(request.getParameter("nomecorsista"), "[a-zA-Z]"); 
	   if (request.getParameter("nomecorsista") != null && request.getParameter("nomecorsista").length() <= 30 
	     && verificanome == true) { 
	    corsista.setNomeCorsista(request.getParameter("nomecorsista")); 
	   } 
	 
	   boolean verificacognome = Pattern.matches(request.getParameter("cognomecorsista"), "[a-zA-Z]"); 
	   if (request.getParameter("cognomecorsista") != null 
	     && request.getParameter("cognomecorsista").length() <= 30 && verificacognome == true) { 
	    corsista.setCognomeCorsista(request.getParameter("cognomecorsista")); 
	   } 
	   corsista.setPrecedentiFormativi(Byte.parseByte(request.getParameter("precedentiformativi"))); 
	 
	   boolean verificacorso = Pattern.matches(request.getParameter("nomecorso"), "[a-zA-Z]"); 
	   Corso[] nomecorsi = aF.getAllCorsi(); 
	   if (request.getParameter("nomecorso") != null && request.getParameter("nomecorso").length() <= 30 
	     && verificacorso == true) { 
	    for (Corso corso : nomecorsi) { 
	     if ((request.getParameter("nomecorso").toLowerCase()).equals(corso.getNomeCorso().toLowerCase())) { 
	      cc.setCodCorso(c.getCodCorso()); 
	     } 
	    } 
	 
	   } else { 
	    response.sendRedirect("#"); 
	 
	   } 
	 
	   if (request.getParameter("datainiziocorso") == null 
	     && DateUtility.isValid(request.getParameter("datainiziocorso")) == false) { 
	    response.sendRedirect("#"); 
	   } 
	   if (request.getParameter("datafinecorso") == null 
	     && DateUtility.isValid(request.getParameter("datafinecorso")) == false) { 
	    response.sendRedirect("#"); 
	   } 
	   if (Integer.parseInt(request.getParameter("datafinecorso")) 
	     - Integer.parseInt(request.getParameter("datainiziocorso")) < 2) 
	    response.sendRedirect("#"); 
	 
	   if (request.getParameter("commenti").length() > 200) 
	    response.sendRedirect("#"); 
	 
	   boolean verificaAula = Pattern.matches(request.getParameter("aulacorso"), "\\w"); 
	   if (request.getParameter("aulacorso").length() > 30 && verificaAula == false) 
	    response.sendRedirect("#"); 
	 
	   if (request.getParameter("docente") == null || request.getParameter("docente") 
	     .equals(aF.getNominativoDocente(request.getParameter("nomecorso")))) 
	    response.sendRedirect("#"); 
	 
	   aF.createCorsista(corsista); 
	   aF.createCorsistaCorso(cc); 
	 
	   response.sendRedirect("basedati.jsp"); 
	  } catch (DAOException | ClassNotFoundException exc) { 
	   exc.printStackTrace(); 
	   throw new ServletException(exc.getMessage()); 
	  } 
	 } 
	}

