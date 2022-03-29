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

	public String[] getReport() throws DAOException {
		try {
			String[] report = new String[7];

			Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs1 = stmt.executeQuery(SELECT_TOT_CORSISTI);

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs2 = stmt.executeQuery(SELECT_CORSO_PIU_FREQUE);
			

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs3 = stmt.executeQuery(SELECT_DATA_ULTIMO_CORSO);
			

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs4 = stmt.executeQuery(SELECT_DURATA_MEDIA_CORSO);

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs5 = stmt.executeQuery(SELECT_NUM_COMMENTI);

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs7 = stmt.executeQuery(SELECT_DOC_CORSO);

			stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs8 = stmt.executeQuery(SELECT_POSTI_LIBERI);

			rs1.next();
			report[0] = rs1.getString(1);
			
			rs2.next();
			report[1] = rs2.getString(1);
			
			rs3.next();
			rs4.next();
			rs5.next();
			rs7.next();
			rs8.next();
			
			report[2] = rs3.getString(1);
			report[3] = rs4.getString(1);
			report[4] = rs5.getString(1);
			report[5] = rs7.getString(1);
			report[6] = rs8.getString(1);

			rs1.close();
			rs2.close();
			rs3.close();
			rs4.close();
			rs5.close();
			rs7.close();
			rs8.close();
			stmt.close();



			return report;
		} catch (SQLException sql) {

			throw new DAOException(sql);
		}
	}
}
