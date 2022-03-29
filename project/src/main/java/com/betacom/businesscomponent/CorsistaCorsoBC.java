package com.betacom.businesscomponent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.betacom.architecture.dao.CorsistaCorsoDAO;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.Corsista;
import com.betacom.businesscomponent.model.CorsistaCorso;

public class CorsistaCorsoBC {
	private Connection conn;

	public void create( CorsistaCorso entity) throws ClassNotFoundException, IOException, DAOException {
		try {

			conn = DBAccess.getConnection();
			CorsistaCorsoDAO.getFactory().create(conn, entity);

		} catch (

		SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
	}
}