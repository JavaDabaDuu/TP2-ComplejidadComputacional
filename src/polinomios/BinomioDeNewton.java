package polinomios;

public class BinomioDeNewton {

	private int a;
	private int b;
	private int n;
	
	private int [][] tartaglia;

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
		this.generarTrianguloDeTartaglia(n + 1);
	}

	private void generarTrianguloDeTartaglia(int i) {
		this.tartaglia = MiMath.trianguloDeTartaglia(this.n + 1);
	}

	public int coeficienteKConCombinatoria(int k) {
		return (int) (MiMath.combinatoria(n, k) * Math.pow(a, n - k) * Math.pow(b, k));
	}
	
	public int coeficienteKConTartaglia(int k) {
		return (int) (this.tartaglia[n][k] * Math.pow(a, n - k) * Math.pow(b,k));
	}

	public Polinomio formaPolinomicaConCombinatoria() {
		double[] coeficientes = new double[n + 1];
		for (int i = 0; i <= n; i++) {
			coeficientes[i] = this.coeficienteKConCombinatoria(i);
		}
		return new Polinomio(coeficientes);
	}

	public Polinomio formaPolinomicaConTartaglia() {
		double[] coeficientes = new double[n + 1];
		for (int i = 0; i <= n; i++) {
			coeficientes[i] = this.coeficienteKConTartaglia(i);
		}
		return new Polinomio(coeficientes);
	}
}
