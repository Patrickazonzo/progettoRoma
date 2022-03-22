package com.betacom.architecture.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;

import com.betacom.businesscomponent.model.CorsistaCorso;

public class CorsistaCorsoDAO implements GenericDAO<CorsistaCorso>, DAOConstants{

	private CachedRowSet rowSet;
	
	public static CorsistaCorsoDAO getFactory() throws DAOException {
		return new CorsistaCorsoDAO();
	}

	private CorsistaCorsoDAO() throws DAOException {
		
	}
	
	@Override
	public void create(Connection conn, CorsistaCorso entity) throws DAOException {
		try {
			rowSet.setCommand(SELECT_CORSISTACORSO);
			rowSet.execute(conn);
			rowSet.moveToInsertRow();
			rowSet.updateLong(1, entity.getCodCorsista());
			rowSet.updateLong(2, entity.getCodCorso());
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
