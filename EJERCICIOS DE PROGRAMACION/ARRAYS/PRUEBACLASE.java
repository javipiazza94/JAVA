package ARRAYS;
/* Implementa un programa en Java que reciba dos parámetros de tipo entero: distancia y tiempo. 
//El programa mostrará por pantalla la aceleración obtenida a partir de estas variables */
import java.util.Scanner;
//Importamos el escaner
public class PRUEBACLASE {
	public static void main(String[] args){
		// Colocamos el  main para iniciar el escaner
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la variable tiempo "); //Introducimos la variable tiempo
		int t = sc.nextInt();
		System.out.println("Introduzca la variable espacio ");//Introducimos la variable espacio
		int e = sc.nextInt();
		
		//Introducimos la formula de la aceleracion (ESTÁ MAL HECHA, MEJOR HAZLA DE LA VELOCIDAD QUE ES E/T)
		int a = e/t;
		
		System.out.println("La aceleracion es "+a+" metros por segundo"); //Introducimos el resultado final de la "formula" 
		sc.close(); //Cerramos impresion
}}
