package metier;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestUnitcreditmetier {
	ICreditMetier metier;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		CreditMetierImpl metier = new CreditMetierImpl();
	}

	@Test
	void test() 
	{
		double capital = 200000;
		double taux = 4.5;
		int duree = 240;
		
		double resultatAttendu = 1265.2987;
		double resutlatCalcule = metier.calculMensualite(capital, taux, duree);
		
		assertEquals(0.0001, resultatAttendu, resutlatCalcule);
	}

}
