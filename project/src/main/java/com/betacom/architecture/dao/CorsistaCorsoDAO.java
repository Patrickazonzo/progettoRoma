package com.betacom.architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;

import com.betacom.businesscomponent.model.Corsista;
import com.betacom.businesscomponent.model.CorsistaCorso;

public class CorsistaCorsoDAO implements GenericDAO<CorsistaCorso>, DAOConstants{

	private CachedRowSet rowSet;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static CorsistaCorsoDAO getFactory() throws DAOException {
		return new CorsistaCorsoDAO();
	}

	private CorsistaCorsoDAO() throws DAOException {
		
	}
	
	@Override
	public void create(Connection conn, CorsistaCorso entity ) throws DAOException {
		try {
			
		/*	ps = conn.prepareStatement(SELECT_COD_CORSO);
			ps.setString(1, nomecorso);
			rs = ps.executeQuery();
		*/	
			rowSet.setCommand(SELECT_CORSISTACORSO);
			rowSet.execute(conn);
			rowSet.moveToInsertRow();
			rowSet.updateLong(1, entity.getCodCorsista());
			rowSet.updateLong(2, rs.getLong(1));
			rowSet.insertRow();
			rowSet.moveToCurrentRow();
			rowSet.acceptChanges();

		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		
	}

	@Override
	public void delete(Connection conn, CorsistaCorso entity) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CorsistaCorso getById(Connection conn, long cod) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CorsistaCorso[] getAll(Connection conn) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
