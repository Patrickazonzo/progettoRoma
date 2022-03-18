package test.com.betacom.architecture.dbaccess;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.betacom.architecture.dao.DAOException;
import com.betacom.architecture.dbaccess.DBAccess;

class DBAccessTest {

	@Test
	void test() {
		try {
			DBAccess.getConnection();
		} catch (DAOException | ClassNotFoundException | IOException exc) {
		} finally {
			try {
				DBAccess.closeConnection();

			} catch (DAOException exc) {
				exc.printStackTrace();
				fail("Errore nella chiusa della connessione");
			}
		}
	}

}
