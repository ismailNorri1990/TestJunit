package ma.jobintech.JunitDivision;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import serviceCalculatrice.Calculatrice;

class Junit_division {
	
	@BeforeAll
	public static void initialiser() {
		Calculatrice calcDivision = new Calculatrice();
	}
	
	
	@Test
	void Division() {
//		fail("La méthode Division n'est pas encore implémentée");
		
		int diviseur = 0 , divise = 2 , resultDivReel , resultDivAttendu = 2;
		resultDivReel = divise/diviseur;
		resultDivReel = calcDivision.Diviser(divise, diviseur);	
		
		assertEquals(resultDivAttendu, resultDivReel);
		
	}
	
}
