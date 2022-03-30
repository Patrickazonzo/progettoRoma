package com.betacom.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.utility.CorsistaUtility;


@WebServlet("/informazionicorsista")
public class InformazioniCorsista extends HttpServlet {
	private static final long serialVersionUID = 186857647368L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cod = request.getParameter("codcorsista");
		System.out.println("Qui ci arrivo");
		//CorsistaUtility cU = new CorsistaUtility();
		System.out.println("Creata CorsistaUtility");
		if(cod != null) {
			//cU.getInfoCorsista(cod);
			System.out.println("Cod not null" + cod);
			
		}
	
		response.sendRedirect("infocorsista.jsp");
	}

}
