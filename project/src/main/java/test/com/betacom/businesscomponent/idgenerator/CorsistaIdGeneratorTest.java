package test.com.betacom.businesscomponent.idgenerator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.betacom.businesscomponent.idgenerator.CorsistaIdGenerator;

class CorsistaIdGeneratorTest {

	@Test
	void testGetNextId() {
		long test = 0;
		try {
			test = CorsistaIdGenerator.getInstance().getNextId();
			System.out.println("Generato Cod Corsista = " + test);
		} catch (Exception exc) {
			System.out.println(exc.getMessage() + "/n" + exc.getStackTrace());
			fail("Not yet implemented");
		}
	}

}
