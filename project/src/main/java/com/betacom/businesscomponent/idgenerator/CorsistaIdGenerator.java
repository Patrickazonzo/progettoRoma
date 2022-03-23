package com.betacom.businesscomponent.idgenerator;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.betacom.architecture.dao.DAOConstants;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;

public class CorsistaIdGenerator implements DAOConstants, IdGenerator {

	private static CorsistaIdGenerator istanza;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	private CorsistaIdGenerator() throws DAOException, ClassNotFoundException, IOException {
			conn=DBAccess.getConnection();

		}

	public static CorsistaIdGenerator getInstance() throws DAOException, ClassNotFoundException, IOException {
		if (istanza == null)
			istanza = new CorsistaIdGenerator();
		return istanza;
	}

	@Override
	public long getNextId() throws ClassNotFoundException, IOException, DAOException {
		long id = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_CORSISTA_SEQ);
			rs.next();
			id = rs.getLong(1);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return id;
	}

}
