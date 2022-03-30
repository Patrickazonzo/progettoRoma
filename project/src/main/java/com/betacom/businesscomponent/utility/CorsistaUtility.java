package com.betacom.businesscomponent.utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.betacom.architecture.dao.DAOConstants;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;

public class CorsistaUtility implements DAOConstants {
	private Connection conn;
	String[] dati;

	public CorsistaUtility() throws DAOException, IOException, ClassNotFoundException {
		conn = DBAccess.getConnection();
	}

	public String[] getInfoCorsista(String cod) throws DAOException {
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement(SELECT_INFO_CORSISTA);
			int codice = Integer.parseInt(cod);
			ps.setInt(1, codice);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsMD = rs.getMetaData();
			int NUMERO_COLONNE = rsMD.getColumnCount();
			while(rs.next()) {
				dati = new String[NUMERO_COLONNE];
				for(int i = 0 ; i < NUMERO_COLONNE; i++) {
					dati[i] = rs.getString(i+1);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
			throw new DAOException(e);
		}
		return dati;
		

	}
	
	
}