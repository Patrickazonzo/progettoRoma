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
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

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

			String[] corsisti;
			int i, a, b, c, d, e, f = 0;
			while (rs1.next())
				corsisti[i] = rs1.getString(i + 1);

			String[] corso;
			while (rs2.next())
				corso[a] = rs2.getString(a + 1);

			String[] data;
			while (rs3.next())
				data[b] = rs3.getString(b + 1);

			String[] media;
			while (rs4.next())
				media[c] = rs4.getString(c + 1);

			String[] commenti;
			while (rs5.next())
				media[d] = rs5.getString(d + 1);

			Vector<String[]> dati = new Vector<String[]>();
			rs6.beforeFirst();
			while (rs6.next()) {
				String[] riga = new String[numColonne];
				for (int g = 0; g < numColonne; g++) {
					riga[g] = rs6.getString(g + 1);
					dati.add(riga);
				}
			}
			String[] docente;
			while (rs7.next())
				docente[e] = rs7.getString(e + 1);

			String[] posti;
			while (rs8.next())
				posti[f] = rs8.getString(f + 1);

			dati.add(corsisti);
			dati.add(corso);
			dati.add(media);
			dati.add(commenti);
			dati.add(docente);
			dati.add(posti);

			rs1.close();
			rs2.close();
			rs3.close();
			rs4.close();
			rs5.close();
			rs6.close();
			rs7.close();
			rs8.close();

			return dati;
		} catch (SQLException sql) {

			throw new DAOException(sql);
		}
	}
}
