package com.betacom.businesscomponent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dao.DocenteDAO;
import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.Docente;

public class DocenteBC {
	private Connection conn;

	public DocenteBC() {
	}

	public Docente[] getAll() throws ClassNotFoundException, IOException, DAOException {
		Docente[] doc;
		try {
			conn = DBAccess.getConnection();
			doc = DocenteDAO.getFactory().getAll(conn);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
		return doc;
	}

	public String getNominativoDocente(String nomecorso) throws ClassNotFoundException, IOException, DAOException {
		String cognome;
		try {
			conn = DBAccess.getConnection();
			cognome = DocenteDAO.getFactory().getNominativoDocente(conn, nomecorso);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
		return cognome;
	}
}
