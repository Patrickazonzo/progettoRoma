package com.betacom.architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



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

	@Override
	public void delete(Connection conn, Corso entity) throws DAOException {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(DELETE_CORSO);
			ps.setLong(1, entity.getCodCorso());
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
			
				if(rs.next()) {
			corso = new Corso();
					corso.setCodCorso(rs.getLong(1));
					corso.setNomeCorso(rs.getString(2));
					corso.setDataInizioCorso(new java.util.Date(rs.getDate(3).getTime()));
					corso.setDataFineCorso(new java.util.Date(rs.getDate(4).getTime()));
					corso.setCostoCorso(rs.getDouble(5));
					corso.setCommentiCorso(rs.getString(6));
					corso.setAulaCorso(rs.getString(7));
				}
				
		} catch (SQLException sql) {
			throw new DAOException(sql);
			
		}
		return corso;
	}

	@Override
	public Corso[] getAll(Connection conn) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
