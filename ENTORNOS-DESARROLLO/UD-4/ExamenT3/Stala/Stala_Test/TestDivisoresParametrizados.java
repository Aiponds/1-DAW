import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestDivisoresParametrizados {

	@ParameterizedTest
	@CsvSource({"5,-10,-5",
				"2,-18,14",
				"1,17,-5",
				"14,28,14"})
	final void testMcd(long resultado, int a, int b) {
		assertEquals(resultado,Divisores.mcd(a,b));
	}
	@ParameterizedTest
	@CsvSource({"-15,0",
				"0,-5",
				"0,0",
				"0,14",
				"18,0"})
	final void testMcd2(int a, int b) {
		assertThrows(IllegalArgumentException.class,()->Divisores.mcd(a,b));
	}
}
