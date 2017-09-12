package polinomios;

import org.junit.Assert;
import org.junit.Test;

public class BinomioDeNewtonTest {

	@Test
	public void testQueSeInstancia() {
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		Assert.assertEquals(binomio.getA(), 2);
		Assert.assertEquals(binomio.getB(), 1);
		Assert.assertEquals(binomio.getN(), 2);
	}

	@Test
	public void testCoeficienteK() {
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		Assert.assertEquals(binomio.coeficienteK(binomio.getN()), 4);
		Assert.assertEquals(binomio.coeficienteK(1), 4);
		Assert.assertEquals(binomio.coeficienteK(0), 1);
	}

	@Test
	public void testFormaPolinomica() {
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		Polinomio p = binomio.formaPolinomica();
		double[] coeficientes = { 4, 4, 1 };
		Polinomio q = new Polinomio(coeficientes);
		Assert.assertTrue(p.equals(q));
	}

	@Test
	public void testFormaPolinomicaConTartaglia() {
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		Polinomio p = binomio.formaPolinomicaConTartaglia();
		double[] coeficientes = { 4, 4, 1 };
		Polinomio q = new Polinomio(coeficientes);
		Assert.assertTrue(p.equals(q));
	}
}
