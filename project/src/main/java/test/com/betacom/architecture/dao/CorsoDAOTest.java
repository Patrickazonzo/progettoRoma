package test.com.betacom.architecture.dao;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.betacom.architecture.dao.CorsoDAO;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.Corso;

class CorsoDAOTest {

	private static Connection conn;
	private static Corso corso;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		conn = DBAccess.getConnection();
		corso = new Corso();
		corso.setCodCorso(1);
		corso.setNomeCorso("JAVA");
		corso.setDataInizioCorso(new java.sql.Date(12 - 12 - 2022));
		corso.setDataFineCorso(new java.sql.Date(12 - 12 - 2023));
		corso.setCostoCorso(50.00);
		corso.setCommentiCorso("Corso di java Enterprise");
		corso.setAulaCorso("1");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

		try {
			CorsoDAO.getFactory().delete(conn, corso);
			corso = null;
			System.out.println("Delete funzionante");
		} catch (DAOException exc) {
			exc.printStackTrace();
			fail("Delete non funzionante");
		}
	}

	@Test
	void testgetById() throws DAOException {
		try {
			CorsoDAO.getFactory().getById(conn, 1);
			System.out.println("Corso trovato" + corso.toString());
		} catch (DAOException exc) {
			exc.printStackTrace();
			fail("Corsista non trovato");
		}
	}

}
