package ARRAYS;
//Implemente un programa en Java que resuelva la siguiente fórmula para resolver con qué fuerza se atraen dos cuerpos
import java.util.Scanner;
//Importamos el escaner
public class PRUEBACLASE2 {
	public static void main(String[] args){
		// Colocamos el  main para iniciar el escaner
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la masa del primero "); //Introducimos la masa del primero
		double m1= sc.nextDouble();
		System.out.println("Introduzca la masa del segundo ");//Introducimos la masa del segundo
		double m2= sc.nextDouble();
		System.out.println("Introduzca la distancia entre ambos ");// Introducimos la distancia entre ambos
		double d= sc.nextDouble();
		// Introducimos la constante gravitatoria
		final double G = 6.673e-11;
		// Introducimos la formula de calculo
		double fuerza = G*((m1*m2)/Math.pow(d, 2));
		
		System.out.println("El resultado total es "+fuerza+""); //Imprimimos el resultado final
		sc.close(); //Cerramos impresion
}}
