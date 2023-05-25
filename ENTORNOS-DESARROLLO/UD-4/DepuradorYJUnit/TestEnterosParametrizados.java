import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestEnterosParametrizados {

	@ParameterizedTest
	@CsvSource({"1,0",
				"6,3",
				"1,1",
				"2432902008176640000,20"})
	final void testFactorial(long resultado, int candidato) {
		assertEquals(resultado,Enteros.factorial(candidato));
	}
	@ParameterizedTest
	@ValueSource(ints= {-3,-1})
	final void testFactorial2(int candidato) {
		assertThrows(IllegalArgumentException.class,()->Enteros.factorial(candidato));
	}

	@ParameterizedTest
	@CsvSource({"18,4",
				"18,0",
				"-18,4",
				"18,-4",
				"-18,-4"})
	final void testDivisible(int dividendo, int divisor) {
		assertFalse(Enteros.divisible(dividendo,divisor));
	}
	@ParameterizedTest
	@CsvSource({"18,3",
				"18,1",
				"18,-1",
				"-18,3",
				"18,-3"})
	final void testDivisible2(int dividendo, int divisor) {
		assertTrue(Enteros.divisible(dividendo,divisor));
	}

	@ParameterizedTest
	@ValueSource(ints = {0,4,-3,9,1})
	final void testEsPrimo(int candidato) {
		assertFalse(Enteros.esPrimo(candidato));
	}
	@ParameterizedTest
	@ValueSource(ints = {3,5,7,2})
	final void testEsPrimo2(int candidato) {
		assertTrue(Enteros.esPrimo(candidato));
	}
	
}
