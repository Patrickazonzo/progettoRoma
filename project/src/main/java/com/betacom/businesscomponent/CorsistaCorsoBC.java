package com.betacom.businesscomponent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.CorsistaCorso;

public class CorsistaCorsoBC {
	private Connection conn;
	
	public void create (CorsistaCorso cc ) throws ClassNotFoundException, IOException, DAOException {
		try {
			conn = DBAccess.getConnection();
			if(cc.getCodCorso() > 0) {
				cc.setCodCorsista(0);
			}
			
		}
		catch (SQLException sql) {
			throw new DAOException(sql);
		} finally {
			DBAccess.closeConnection();
		}
	}
}