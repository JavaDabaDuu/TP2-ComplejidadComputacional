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
	public void testCoeficienteKConCombinatoria() {
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		Assert.assertEquals(4, binomio.coeficienteKConCombinatoria(0));
		Assert.assertEquals(4, binomio.coeficienteKConCombinatoria(1));
		Assert.assertEquals(1, binomio.coeficienteKConCombinatoria(2));
	}

	@Test
	public void testCoeficienteKConTartaglia() {
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		Assert.assertEquals(4, binomio.coeficienteKConTartaglia(0));
		Assert.assertEquals(4, binomio.coeficienteKConTartaglia(1));
		Assert.assertEquals(1, binomio.coeficienteKConTartaglia(2));
	}

	@Test
	public void testFormaPolinomicaConCombinatoria() {
		BinomioDeNewton binomio = new BinomioDeNewton(2, 1, 2);
		Polinomio p = binomio.formaPolinomicaConCombinatoria();
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
