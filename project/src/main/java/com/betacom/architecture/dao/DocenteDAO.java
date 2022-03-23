package com.betacom.architecture.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.betacom.businesscomponent.model.Corsista;
import com.betacom.businesscomponent.model.Docente;

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

			ResultSet rs = stmt.executeQuery(SELECT_DOC);
			rs.last();
			docenti = new Docente[rs.getRow()];
			rs.beforeFirst();
			for (int i = 0; rs.next(); i++) {
				Docente docente = new Docente();
				docente.setCoddocente(rs.getInt(1));
				docente.setNomedocente(rs.getString(2));
				docente.setCognomedocente(rs.getString(3));
				docente.setCvdocente(rs.getString(4));
				
				docenti[i] = docente;
			}
			rs.close();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return docenti;
		
		
		
	}

	@Override
	public void create(Connection conn, Docente entity) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, Docente entity) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Docente getById(Connection conn, long cod) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public  String getNominativoDocente(Connection conn, String nomecorso) throws DAOException {
		
		PreparedStatement ps;
		String docenti;
		try {
			ps=conn.prepareStatement(SELECT_COGNOME_DOC);
			ps.setString(1, nomecorso);
			ResultSet rs = ps.executeQuery();
			docenti = rs.getString(1);
			
			rs.close();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return docenti;
		
}
}
