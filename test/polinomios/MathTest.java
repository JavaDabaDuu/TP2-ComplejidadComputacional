package polinomios;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

	@Test
	public void testFactorial() {
		Assert.assertEquals(MiMath.factorial(0), 1);
		Assert.assertEquals(MiMath.factorial(1), 1);
		Assert.assertEquals(MiMath.factorial(2), 2);
		Assert.assertEquals(MiMath.factorial(3), 6);
		Assert.assertEquals(MiMath.factorial(4), 24);
		Assert.assertEquals(MiMath.factorial(5), 120);
		Assert.assertEquals(MiMath.factorial(6), 720);
		Assert.assertEquals(MiMath.factorial(7), 5040);
	}

	@Test
	public void testCombinatoria() {
		Assert.assertEquals(MiMath.combinatoria(6, 0), 1);
		Assert.assertEquals(MiMath.combinatoria(6, 1), 6);
		Assert.assertEquals(MiMath.combinatoria(6, 2), 15);
		Assert.assertEquals(MiMath.combinatoria(6, 3), 20);
		Assert.assertEquals(MiMath.combinatoria(6, 4), 15);
		Assert.assertEquals(MiMath.combinatoria(6, 5), 6);
		Assert.assertEquals(MiMath.combinatoria(6, 6), 1);
	}

	@Test
	public void testCombinatoriaRecursiva() {
		Assert.assertEquals(MiMath.combinatoriaRecursiva(6, 0), 1);
		Assert.assertEquals(MiMath.combinatoriaRecursiva(6, 1), 6);
		Assert.assertEquals(MiMath.combinatoriaRecursiva(6, 2), 15);
		Assert.assertEquals(MiMath.combinatoriaRecursiva(6, 3), 20);
		Assert.assertEquals(MiMath.combinatoriaRecursiva(6, 4), 15);
		Assert.assertEquals(MiMath.combinatoriaRecursiva(6, 5), 6);
		Assert.assertEquals(MiMath.combinatoriaRecursiva(6, 6), 1);
	}

	@Test
	public void testTartaglia() {
		int[][] tartaglia = { { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 2, 1, 0, 0 }, { 1, 3, 3, 1, 0 },
				{ 1, 4, 6, 4, 1 } };
		int[][] miTartaglia = MiMath.trianguloDeTartaglia(5);

		for (int i = 0; i < tartaglia.length; i++) {
			for (int j = 0; j < tartaglia.length; j++) {
				Assert.assertEquals(tartaglia[i][j], miTartaglia[i][j]);
			}
		}
	}

}
