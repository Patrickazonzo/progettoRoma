package com.betacom.businesscomponent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.betacom.architecture.dao.CorsoDAO;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.Corso;

public class CorsoBC {
	private Connection conn;
	public CorsoBC() {
	}

	public Corso[] getAll() throws DAOException, ClassNotFoundException, IOException {
		try {
			conn = DBAccess.getConnection();
			return CorsoDAO.getFactory().getAll(conn);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
	}

	public void delete(Corso corso) throws DAOException, ClassNotFoundException, IOException {
		try {
			conn = DBAccess.getConnection();
			CorsoDAO.getFactory().delete(conn, corso);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
	}
}