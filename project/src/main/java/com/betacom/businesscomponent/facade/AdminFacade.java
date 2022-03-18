package com.betacom.businesscomponent.facade;

import java.io.IOException;

import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.CorsoBC;
import com.betacom.businesscomponent.model.Corso;

public class AdminFacade {
	private static AdminFacade aF;

	private AdminFacade() {
	}

	public static AdminFacade getInstance() {
		if (aF == null)
			aF = new AdminFacade();
		return aF;
	}

	public void deleteCorso(Corso c) throws DAOException, ClassNotFoundException, IOException {
		CorsoBC cBC = new CorsoBC();
		cBC.delete(c);
	}
}
