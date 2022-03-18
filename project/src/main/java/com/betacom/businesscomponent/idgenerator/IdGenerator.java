package com.betacom.businesscomponent.idgenerator;

import java.io.IOException;

import com.betacom.architecture.dao.DAOException;

public interface IdGenerator {
long getNextId() throws ClassCastException, DAOException, IOException; 
}
