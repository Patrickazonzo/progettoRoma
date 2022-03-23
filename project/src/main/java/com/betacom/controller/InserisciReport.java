package com.betacom.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.betacom.architecture.dao.DAOConstants;
import com.betacom.architecture.dao.DAOException;

@WebServlet("/inseriscireport")
public class InserisciReport extends HttpServlet implements DAOConstants {
	private static final long serialVersionUID = 73737978172721L;
	private Statement stmt;
	private Connection conn;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs1 = stmt.executeQuery(SELECT_TOT_CORSISTI);
			ResultSet rs2 = stmt.executeQuery(SELECT_CORSO_PIU_FREQUE);
			ResultSet rs3 = stmt.executeQuery(SELECT_DATA_ULTIMO_CORSO);
			ResultSet rs4 = stmt.executeQuery(SELECT_DURATA_MEDIA_CORSO);
			ResultSet rs5 = stmt.executeQuery(SELECT_NUM_COMMENTI);
			ResultSet rs6 = stmt.executeQuery(SELECT_ELENCO_CORSISTI);
			ResultSet rs7 = stmt.executeQuery(SELECT_DOC_CORSO);
			ResultSet rs8 = stmt.executeQuery(SELECT_POSTI_LIBERI);
			
		} catch (SQLException exc) {
			exc.printStackTrace();
			throw new ServletException(exc.getMessage());
		
	}

}
}
