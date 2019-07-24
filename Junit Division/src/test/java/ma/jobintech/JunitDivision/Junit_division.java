package ma.jobintech.JunitDivision;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import serviceCalculatrice.Calculatrice;

@SuppressWarnings("removal")
class Junit_division {
	
	
	
	@Test
	void Division() {
//		fail("La méthode Division n'est pas encore implémentée");
		Calculatrice calcDivision = new Calculatrice();
		
		int diviseur = 1 , divise = 2;
		
		
		assertThrows(ArithmeticException.class, () -> {
			calcDivision.diviser(divise, diviseur);
		});
		
	}
	
}
