package com.betacom.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.facade.AdminFacade;

@WebServlet("/cancella")
public class Cancella extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AdminFacade aF = AdminFacade.getInstance();
		String cod = request.getParameter("codcorso");
		
		long codice = Long.parseLong(cod);
		if (cod != null) {
			
			try {
				aF.deleteCorso(codice);
			} catch (DAOException | ClassNotFoundException | IOException e) {
				
				e.printStackTrace();
			}
		}
		response.sendRedirect("cancellacorso.jsp");
	}
}
