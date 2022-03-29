package com.betacom.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.facade.AdminFacade;
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

			boolean verificanome = Pattern.matches("^[a-zA-Z-]{1,30}$", request.getParameter("nomecorsista"));
			if (verificanome == true) {
				corsista.setNomeCorsista(request.getParameter("nomecorsista"));
			}

			boolean verificacognome = Pattern.matches("^[a-zA-Z-]{1,30}$", request.getParameter("cognomecorsista"));
			if (verificacognome == true) {
				corsista.setCognomeCorsista(request.getParameter("cognomecorsista"));
			}
			
			corsista.setPrecedentiFormativi(Byte.parseByte(request.getParameter("precedentiformativi")));

			boolean verificacorso = Pattern.matches("^[a-zA-Z-]{1,30}$", request.getParameter("nomecorso"));
			Corso[] nomecorsi = aF.getAllCorsi();
			if (verificacorso == true) {
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
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date firstDate = sdf.parse(request.getParameter("datainiziocorso"));
	        Date secondDate = sdf.parse(request.getParameter("datafinecorso"));
	        
	        long diff = secondDate.getTime() - firstDate.getTime();
			if (diff < 2)
				response.sendRedirect("#");

			if (request.getParameter("commenti").length() > 200)
				response.sendRedirect("#");

			boolean verificaAula = Pattern.matches("^[a-zA-Z0-9-]{0,30}$", request.getParameter("aulacorso"));
			if (verificaAula == false)
				response.sendRedirect("#");

			if (request.getParameter("docente") == null)// || request.getParameter("docente").equals(aF.getNominativoDocente(request.getParameter("nomecorso"))))
				response.sendRedirect("#");

			aF.createCorsista(corsista);
			//aF.createCorsistaCorso(request.getParameter("nomecorso"), corsista);

			response.sendRedirect("basedati.jsp");
		} catch (DAOException exc) {
			exc.printStackTrace();
			throw new ServletException(exc.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
