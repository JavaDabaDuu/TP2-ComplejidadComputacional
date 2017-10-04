package polinomios;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PolinomioTest {

	private Polinomio polinomio;
	private double evaluacion[] = { 3, 6, 11 };

	@Before
	public void testQueSeInstancia() {
		double coeficientes[] = { 1, 2, 3 };
		this.polinomio = new Polinomio(coeficientes);
	}

	@Test
	public void testGradoCorrecto() {
		Assert.assertEquals(2, this.polinomio.getGrado());
	}

	@Test
	public void testCoeficientesCorrectos() {
		Assert.assertEquals(1, this.polinomio.getCoeficiente(0), 0.00001);
		Assert.assertEquals(2, this.polinomio.getCoeficiente(1), 0.00001);
		Assert.assertEquals(3, this.polinomio.getCoeficiente(2), 0.00001);
	}

	@Test
	public void testEvaluarMSucesivas() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertEquals(this.evaluacion[i], this.polinomio.evaluarMSucesivas(i), 0.000001);
		}
	}

	@Test
	public void testEvaluarRecursiva() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertEquals(this.evaluacion[i], this.polinomio.evaluarRecursiva(i), 0.000001);
		}
	}

	@Test
	public void testEvaluarRecursivaPar() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertEquals(this.evaluacion[i], this.polinomio.evaluarRecursivaPar(i), 0.000001);
		}
	}

	@Test
	public void testEvaluarProgDinamica() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertEquals(this.evaluacion[i], this.polinomio.evaluarProgDinamica(i), 0.000001);
		}
	}

	@Test
	public void testEvaluarMejorada() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertEquals(this.evaluacion[i], this.polinomio.evaluarMejorada(i), 0.000001);
		}
	}

	@Test
	public void testEvaluarPow() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertEquals(this.evaluacion[i], this.polinomio.evaluarPow(i), 0.000001);
		}
	}

	@Test
	public void testEvaluarHorner() {
		for (int i = 0; i <= this.polinomio.getGrado(); i++) {
			Assert.assertEquals(this.evaluacion[i], this.polinomio.evaluarHorner(i), 0.000001);
		}
	}

}
