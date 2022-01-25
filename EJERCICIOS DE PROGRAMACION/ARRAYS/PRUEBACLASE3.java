package ARRAYS;
/*Implemente un programa en Java que acepte un número entero por teclado, representando un número en centímetros, y muestre por pantalla su descomposición en metros y kilómetros. 
 * NOTA: Se debe utilizar el operador módulo.*/ 
import java.util.Scanner;
//Importamos el escaner
public class PRUEBACLASE3 {
	public static void main(String[] args){
		// Colocamos el  main para iniciar el escaner
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el número de centímetros");
		int centimetrostotales = sc.nextInt();
		
		int centimetrosdaux = centimetrostotales;// Añadimos una variable auxiliar de centimetros para no repetir la misma
		int centimetros= centimetrosdaux%100;//Descomponemos los centimetros
		int metros = centimetrostotales/100; //Pasamos los centimetros a metros
		int kilometros = centimetrosdaux/100000;// Pasamos los centimetros a kilometros
		
		System.out.println("Los centimetros son "+centimetros+" los metros son "+metros+" y los kilometros son "+kilometros+" ");
		//Declaramos la descomposicion final
		sc.close(); //Cerramos impresion
}}
