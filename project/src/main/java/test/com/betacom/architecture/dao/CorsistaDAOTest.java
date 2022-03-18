package test.com.betacom.architecture.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.betacom.architecture.dao.CorsistaDAO;
import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;
import com.betacom.businesscomponent.model.Corsista;

class CorsistaDAOTest {
	
	private static Connection conn;
	private static Corsista corsista;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		conn = DBAccess.getConnection();
		corsista = new Corsista();
		corsista.setCodCorsista(1);
		corsista.setNomeCorsista("Pippo");
		corsista.setCognomeCorsista("Bianca");
		corsista.setPrecedentiFormativi((byte) 1);
	}


	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		try {
			CorsistaDAO.getFactory().delete(conn, corsista);
			corsista = null;
			System.out.println("Delete funzionante");
		} catch (DAOException exc) {
			exc.printStackTrace();
			fail("Delete non funzionante");
		}
	}

	@Test
	void testCreate() {
		try {
			CorsistaDAO.getFactory().create(conn, corsista);
			System.out.println("Creato corsista");
		} catch (DAOException exc) {
			exc.printStackTrace();
			fail("Create corsista fallito");
		}
	}
	
	@Test
	void testgetById() throws DAOException {
		try {
		CorsistaDAO.getFactory().getById(conn, 1);
		System.out.println("Corsista trovato" + corsista.toString());
		}catch (DAOException exc) {
			exc.printStackTrace();
			fail("Corsista non trovato");
		}
	}

}
