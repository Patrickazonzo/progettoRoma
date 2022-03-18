package com.betacom.architecture.dao;

public interface DAOConstants {
		public String SELECT_CORSISTA= "Select* from corsista";
		public String SELECT_CORSISTA_BYID= "Select * from corsista where codCorsista=?";
		public String DELETE_CORSISTA = "Delete from corsista where codCorsista=?";
		public String DELETE_CORSO = "Delete from corso where codCorso=?";
		public String SELECT_CORSO_BYID = "Select * from corso where codCorso=?";
		public String SELECT_REPORT = "Select * from report";
	
}
