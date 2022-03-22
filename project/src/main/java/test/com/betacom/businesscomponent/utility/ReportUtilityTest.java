package test.com.betacom.businesscomponent.utility;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import com.betacom.architecture.dao.DAOConstants;
import com.betacom.businesscomponent.utility.ReportUtility;

class ReportUtilityTest implements DAOConstants {

	@Test
	void test() throws ClassNotFoundException, IOException {
		Connection conn = null;
		Statement stmt;
		try {
			/*
			 * conn = DBAccess.getConnection();
			 * 
			 * stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
			 * ResultSet.CONCUR_READ_ONLY); ResultSet rs = stmt.executeQuery(SELECT_REPORT);
			 * ResultSetMetaData meta = rs.getMetaData();
			 */
			
			ReportUtility ru = new ReportUtility();
			fail("Not yet implemented");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
