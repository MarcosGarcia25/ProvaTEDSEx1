package teds.PrimeiraProvaEx1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Equacao2oGrauTest {

	private Equacao2oGrau equacao = new Equacao2oGrau(10,6,10);
	
	@Test
	void test() {
		assertThrows(IndexOutOfBoundsException.class, () -> equacao.getRaizes());
	}

}
