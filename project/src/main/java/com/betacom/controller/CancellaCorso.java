package com.betacom.controller;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.facade.AdminFacade;
import com.betacom.businesscomponent.model.Corso;



@WebServlet("/cancellacorso") 
public class CancellaCorso  {
	private static final long serialVersionUID = 10323L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServerException, IOException, DAOException, ClassNotFoundException {
		HttpSession session = request.getSession();
		AdminFacade aF = AdminFacade.getInstance();
		Corso c = new Corso();
		String cod = request.getParameter("cod");
		c.setCodCorso(Long.parseLong(cod));
		if(cod != null) {
			aF.deleteCorso(c);
}
		response.sendRedirect("");
}
}
