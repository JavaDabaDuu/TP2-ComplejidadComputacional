package polinomios;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PolinomioTest {

	private Polinomio polinomio;
	private double evaluacion[] = { 1.0, 10.0, 1023.0, 29524.0, 349525.0, 2441406.0, 1.2093235E7, 4.7079208E7,
			1.53391689E8, 4.3584805E8 };

	@Before
	public void testQueSeInstancia() {
		double coeficientes[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		this.polinomio = new Polinomio(coeficientes);
	}

	@Test
	public void testGradoCorrecto() {
		Assert.assertEquals(9, this.polinomio.getGrado());
	}

	@Test
	public void testCoeficientesCorrectos() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(1 == this.polinomio.getCoeficiente(i));
		}
	}

	@Test
	public void testEvaluarMSucesivas() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(this.evaluacion[i] == this.polinomio.evaluarMSucesivas(i));
		}
	}

	@Test
	public void testEvaluarRecursiva() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(this.evaluacion[i] == this.polinomio.evaluarRecursiva(i));
		}
	}

	@Test
	public void testEvaluarRecursivaPar() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(this.evaluacion[i] == this.polinomio.evaluarRecursivaPar(i));
		}
	}

	@Test
	public void testEvaluarProgDinamica() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(this.evaluacion[i] == this.polinomio.evaluarProgDinamica(i));
		}
	}

	@Test
	public void testEvaluarMejorada() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(this.evaluacion[i] == this.polinomio.evaluarMejorada(i));
		}
	}

	@Test
	public void testEvaluarPow() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(this.evaluacion[i] == this.polinomio.evaluarPow(i));
		}
	}

	@Test
	public void testEvaluarHorner() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertTrue(this.evaluacion[i] == this.polinomio.evaluarHorner(i));
		}
	}

}
