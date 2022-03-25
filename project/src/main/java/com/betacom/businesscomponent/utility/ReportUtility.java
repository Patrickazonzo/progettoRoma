package com.betacom.businesscomponent.utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
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
			
			
			ResultSet rs1 = stmt.executeQuery(SELECT_TOT_CORSISTI);
			stmt.close();

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs2 = stmt.executeQuery(SELECT_CORSO_PIU_FREQUE);
			stmt.close();

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs3 = stmt.executeQuery(SELECT_DATA_ULTIMO_CORSO);
			stmt.close();

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs4 = stmt.executeQuery(SELECT_DURATA_MEDIA_CORSO);
			stmt.close();

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs5 = stmt.executeQuery(SELECT_NUM_COMMENTI);
			stmt.close();

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs6 = stmt.executeQuery(SELECT_ELENCO_CORSISTI);
			stmt.close();
			
			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs7 = stmt.executeQuery(SELECT_DOC_CORSO);
			stmt.close();
			
			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs8 = stmt.executeQuery(SELECT_POSTI_LIBERI);
			stmt.close();
			
			
			ResultSetMetaData meta = rs6.getMetaData();
			int numColonne = meta.getColumnCount();

			String corsisti = rs1.getString(1);
			String corso = rs2.getString(1);
			String data = rs3.getString(1);
			String media = rs4.getString(1);
			String commenti = rs5.getString(1);
			Vector<String[]> dati = new Vector<String[]>();
			rs6.beforeFirst();
			while (rs6.next()) {
				String[] riga = new String[numColonne];
				for (int i = 0; i < numColonne; i++) {
					riga[i] = rs6.getString(i + 1);
					dati.add(riga);
				}
			}
			String docente = rs7.getString(1);
			String posti = rs8.getString(1);
			dati.addAll(corsisti);
			
			rs1.close();
			stmt.close();
			rs2.close();
			rs3.close();
			rs4.close();
			rs5.close();
			rs6.close();
			rs7.close();
			rs8.close();
			}
			return dati;
		}catch (SQLException sql) {

		throw new DAOException(sql);
	}

}
