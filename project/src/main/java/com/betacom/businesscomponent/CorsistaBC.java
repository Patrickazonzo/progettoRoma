package com.betacom.businesscomponent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.betacom.architecture.dao.CorsistaDAO;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.Corsista;

public class CorsistaBC {
	private Connection conn;

	public CorsistaBC() {
	}
	
	public Corsista getById(long cod) throws ClassNotFoundException, IOException, DAOException {
		Corsista cs;
		try {
			conn = DBAccess.getConnection();
			cs = CorsistaDAO.getFactory().getById(conn, cod);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		} return cs;
	}
	
	public void create(Corsista corsista) throws ClassNotFoundException, IOException, DAOException {
		try {
			conn = DBAccess.getConnection();
			CorsistaDAO.getFactory().create(conn, corsista);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
	}
	
	public void delete(Corsista corsista) throws DAOException, ClassNotFoundException, IOException {
		try {
			conn = DBAccess.getConnection();
			CorsistaDAO.getFactory().delete(conn, corsista);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
	}

}
