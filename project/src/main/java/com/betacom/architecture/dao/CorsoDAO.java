package com.betacom.architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.betacom.businesscomponent.model.Corso;

public class CorsoDAO implements GenericDAO<Corso>, DAOConstants {

	public static CorsoDAO getFactory() throws DAOException {
		return new CorsoDAO();
	}

	private CorsoDAO() throws DAOException {

	}

	@Override
	public void create(Connection conn, Corso entity) throws DAOException {
	}

	
	public void delete(Connection conn, long cod) throws DAOException {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(DELETE_CORSO);
			ps.setLong(1, cod);
			ps.execute();
			conn.commit();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
	}

	@Override
	public Corso getById(Connection conn, long cod) throws DAOException {
		Corso corso = null;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SELECT_CORSO_BYID);
			ps.setLong(1, cod);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				corso = new Corso();
				corso.setCodCorso(rs.getLong(1));
				corso.setNomeCorso(rs.getString(2));
				corso.setDataInizioCorso((rs.getDate(3)));
				corso.setDataFineCorso((rs.getDate(4)));
				corso.setCostoCorso(rs.getDouble(5));
				corso.setCommentiCorso(rs.getString(6));
				corso.setAulaCorso(rs.getString(7));
				corso.setCodDocente(rs.getInt(8));
			}

		} catch (SQLException sql) {
			throw new DAOException(sql);

		}
		return corso;
	}

	@Override
	public Corso[] getAll(Connection conn) throws DAOException {
		Corso[] corsi = null;
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = stmt.executeQuery(SELECT_CORSO);
			
			rs.last();
			corsi = new Corso[rs.getRow()];
			rs.beforeFirst();
			for (int i = 0; rs.next(); i++) {
				Corso c = new Corso();
				c.setCodCorso(rs.getLong(1));
				c.setNomeCorso(rs.getString(2));
				c.setDataInizioCorso((rs.getDate(3)));
				c.setDataFineCorso((rs.getDate(4)));
				c.setCostoCorso(rs.getDouble(5));
				c.setCommentiCorso(rs.getString(6));
				c.setAulaCorso(rs.getString(7));
				c.setCodDocente(rs.getInt(8));

				corsi[i] = c;
			}
			rs.close();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return corsi;

	}

	@Override
	public void delete(Connection conn, Corso entity) throws DAOException {
		// TODO Auto-generated method stub
		
	}
	

}
