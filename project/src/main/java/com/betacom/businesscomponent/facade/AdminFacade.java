package com.betacom.businesscomponent.facade;

import java.io.IOException;

import com.betacom.architecture.dao.DAOException;
import com.betacom.businesscomponent.CorsistaBC;
import com.betacom.businesscomponent.CorsistaCorsoBC;
import com.betacom.businesscomponent.CorsoBC;
import com.betacom.businesscomponent.DocenteBC;
import com.betacom.businesscomponent.model.Corsista;
import com.betacom.businesscomponent.model.CorsistaCorso;
import com.betacom.businesscomponent.model.Corso;
import com.betacom.businesscomponent.model.Docente;

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
	
	public void createCorsista(Corsista cs) throws ClassNotFoundException, DAOException, IOException {
		CorsistaBC csBC = new CorsistaBC();
		csBC.create(cs);
	}
	public void createCorsistaCorso(CorsistaCorso cc) throws ClassNotFoundException, DAOException, IOException {
        CorsistaCorsoBC ccBC = new CorsistaCorsoBC();
        ccBC.create(cc);
    }
	public Corso[] getAllCorsi() throws DAOException, ClassNotFoundException, IOException {
		CorsoBC cBC = new CorsoBC();		
		return cBC.getAll();
	}
	public Docente[] getAllDocenti() throws DAOException, ClassNotFoundException, IOException {
		DocenteBC dBC = new DocenteBC();		
		return dBC.getAll();
	}
	public String getNominativoDocente(String nomecorso) throws ClassNotFoundException, DAOException, IOException {
		DocenteBC dBC = new DocenteBC();
		return dBC.getNominativoDocente(nomecorso);
	}
}
