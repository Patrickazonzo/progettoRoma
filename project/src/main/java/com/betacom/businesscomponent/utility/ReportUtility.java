package com.betacom.businesscomponent.utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.betacom.architecture.dao.DAOConstants;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;

public class ReportUtility implements DAOConstants {
	
	private Connection conn;
	
	
	public ReportUtility() throws DAOException, IOException, ClassNotFoundException {
		conn = DBAccess.getConnection();
	}
	public Vector<String[]> getReport() throws DAOException {
		try {
			Statement stmt = conn.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(SELECT_REPORT);
			ResultSetMetaData meta = rs.getMetaData();
			int numeroColonne = meta.getColumnCount();
			Vector<String[]> dati = new Vector<String[]>();
			rs.beforeFirst();
			while (rs.next()) {
				String[] riga = new String[numeroColonne];
				for (int i = 0; i < numeroColonne; i++)
					riga[i] = rs.getString(i + 1);
				dati.add(riga);
			}
			return dati;
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		
	
	}
}
