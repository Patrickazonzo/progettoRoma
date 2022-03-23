package test.com.betacom.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.Corso;

 class CancellaCorsoTest {
	 
	 @Test
	void setUp() throws Exception {
		
		Corso corso = new Corso();
		corso.setCodCorso(1);
		corso.setNomeCorso("Pippo");
		corso.setDataInizioCorso(new java.sql.Date(12 - 12 - 2022));
		corso.setDataFineCorso(new java.sql.Date(12 - 12 - 2023));
		corso.setCostoCorso(50.00);
		corso.setCommentiCorso("Corso di java Enterprise");
		corso.setAulaCorso("1");
		try {
			corso = null;
			Connection conn = DBAccess.getConnection();
			Statement Pro = conn.createStatement();
			Pro.executeUpdate("Delete from corso where nomecorso ='Pippo'");
		conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Errore nella compilazione");
		}
	}
	
	
}
