package com.betacom.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.utility.LoginUtility;


@WebServlet("/controlloadmin")
public class ControlloAdmin extends HttpServlet {
	private static final long serialVersionUID = 1768449498373L;
	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeAdmin = request.getParameter("nomeadmin");
		String cognomeAdmin = request.getParameter("cognomeadmin");
		String codAdmin = request.getParameter("codadmin");
		String adminCode;
		
		
		HttpSession session = request.getSession();
		if(nomeAdmin != null | cognomeAdmin != null | codAdmin != null) {
			try {
				LoginUtility lu = new LoginUtility();
				adminCode = lu.getAdminCod(nomeAdmin, cognomeAdmin);
				if(adminCode != null) {
					if(adminCode.equals(codAdmin)) {
						session.setAttribute("nomeadmin", nomeAdmin);
						session.setAttribute("cognomeadmin", cognomeAdmin);
						response.sendRedirect("Admin.jsp");
					} else {
						response.sendRedirect("accessoegato.jsp");
					}
				}
			} catch (DAOException | ClassNotFoundException ex) {
					ex.printStackTrace();
					throw new ServletException(ex.getMessage());
			} 
		}
		
	}

}
