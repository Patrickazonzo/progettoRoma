package com.betacom.architecture.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.betacom.businesscomponent.model.Corsista;

public class DocenteDAO implements GenericDAO<Docente>, DAOConstants{

	
	private CachedRowSet rowSet;
	
	public static DocenteDAO getFactory() throws DAOException {
		return new DocenteDAO();
	}

	private DocenteDAO() throws DAOException {
		try {

			rowSet = RowSetProvider.newFactory().createCachedRowSet();

		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
	}

	

	@Override
	public Docente[] getAll(Connection conn) throws DAOException {
		Docente[] docenti = null;
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = stmt.executeQuery();
			rs.last();
			docenti = new Docente[rs.getRow()];
			rs.beforeFirst();
			for (int i = 0; rs.next(); i++) {
				Docente docente = new Docente();
				docenti.setIdArticolo(rs.getLong(1));
				docenti.setMarca(rs.getString(2));
				docenti.setModello(rs.getString(3));
				docenti.setPrezzo(rs.getDouble(4));
				docenti[i] = docente;
			}
			rs.close();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return docenti;
		
		
		
	}
	
	
}
