package polinomios;

public class BinomioDeNewton {

	private int a;
	private int b;
	private int n;

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getN() {
		return n;
	}

	public BinomioDeNewton(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}

	public int coeficienteK(int k) {
		return (int) (MiMath.combinatoria(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}

	public Polinomio formaPolinomica() {
		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < n; i++) {
			coeficientes[i] = MiMath.combinatoria(n, i) * Math.pow(a, i) * Math.pow(b, n - i);
		}
		return new Polinomio(coeficientes);
	}

	public Polinomio formaPolinomicaConTartaglia() {
		int[][] tartaglia = MiMath.trianguloDeTartaglia(this.n);
		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < n; i++) {
			coeficientes[i] = tartaglia[n - 1][i] * Math.pow(a, i) * Math.pow(b, n - i);
		}
		return new Polinomio(coeficientes);
	}
}
