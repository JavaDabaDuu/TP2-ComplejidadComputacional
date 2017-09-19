package polinomios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		generarPolinomio(2);
		System.out.println("Cargando archivo...");
		Polinomio polinomio = new Polinomio("polinomio2.in");
		rendimiento(polinomio);
		
		/*BinomioDeNewton b1 = new BinomioDeNewton(19, 22, 100);
		rendimientoBinomio(b1);*/
	}
	
	public static void rendimiento(Polinomio polinomio) {
		System.out.println("Evaluando rendimiento...");
		
		Calendar tiempoInicial = new GregorianCalendar();
		
		//EvaluarMSucesivas
		double y2 = polinomio.evaluarMSucesivas(0.001);
		Calendar tiempoFinal2 = new GregorianCalendar();	
		System.out.println("\nEvaluar Sucesiva: " + y2);
		long variacionTiempo2 = tiempoFinal2.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo2 + "\nfrom:\nfinal:   " + tiempoFinal2.getTimeInMillis() + "\ninicial: " + tiempoInicial.getTimeInMillis());
		
		//Recursiva
		double y = polinomio.evaluarRecursiva(0.001);
		Calendar tiempoFinal1 = new GregorianCalendar();	
		System.out.println("\nEvaluar Recursiva: " + y);
		long variacionTiempo = tiempoFinal1.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo + "\nfrom:\nfinal:   " + tiempoFinal1.getTimeInMillis() + "\ninicial: " + tiempoInicial.getTimeInMillis());
		
		//Recursiva Par
		double y4 = polinomio.evaluarRecursivaPar(0.001);
		Calendar tiempoFinal4 = new GregorianCalendar();	
		System.out.println("\nEvaluar Recursiva par: " + y4);
		long variacionTiempo4 = tiempoFinal4.getTimeInMillis() - tiempoInicial.getTimeInMillis();	
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo4 + "\nfrom:\nfinal:   " + tiempoFinal4.getTimeInMillis() + "\ninicial: " + tiempoInicial.getTimeInMillis());
		
		//Dinamica
		double y5 = polinomio.evaluarProgDinamica(0.001);
		Calendar tiempoFinal5 = new GregorianCalendar();	
		System.out.println("\nEvaluar dinamica: " + y5);
		long variacionTiempo5= tiempoFinal5.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo5 + "\nfrom:\nfinal:   " + tiempoFinal5.getTimeInMillis() + "\ninicial: " + tiempoInicial.getTimeInMillis());
		
		//Mejorada
		double y6 = polinomio.evaluarMejorada(0.001);
		Calendar tiempoFinal6 = new GregorianCalendar();	
		System.out.println("\nEvaluar mejorada: " + y6);
		long variacionTiempo6 = tiempoFinal6.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo6 + "\nfrom:\nfinal:   " + tiempoFinal6.getTimeInMillis() + "\ninicial: " + tiempoInicial.getTimeInMillis());
		
		//Pow
		double y3 = polinomio.evaluarPow(0.001);
		Calendar tiempoFinal3 = new GregorianCalendar();	
		System.out.println("\nEvaluar Pow: " + y3);
		long variacionTiempo3 = tiempoFinal3.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo3 + "\nfrom:\nfinal:   " + tiempoFinal3.getTimeInMillis() + "\ninicial: " + tiempoInicial.getTimeInMillis());
		
		//Horner
		double y7 = polinomio.evaluarHorner(0.001);
		Calendar tiempoFinal7 = new GregorianCalendar();	
		System.out.println("\nHorner: " + y7);
		long variacionTiempo7 = tiempoFinal7.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		System.out.println("Rendimiento del algoritmo: " + variacionTiempo7 + "\nfrom:\nfinal:   " + tiempoFinal7.getTimeInMillis() + "\ninicial: " + tiempoInicial.getTimeInMillis());
	
	}
	
	public static void generarPolinomio(int grado) {
		try {
			FileWriter arch = new FileWriter("polinomio2.in");
			BufferedWriter buffer = new BufferedWriter(arch);
			
			System.out.println("Generando polinomio...");
			buffer.write(String.valueOf(grado));
			buffer.newLine();
			for (int i = 0; i <= grado ; i++) {
				buffer.write(String.valueOf(1) + " ");
			}
			buffer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*public static void rendimientoBinomio (BinomioDeNewton binomio) {
		Calendar tIni = new GregorianCalendar();
		
	}*/
}
