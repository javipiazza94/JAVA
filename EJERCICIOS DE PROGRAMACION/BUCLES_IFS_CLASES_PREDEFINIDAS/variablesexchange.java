package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

public class variablesexchange {
	public static void main(String[] args) {
		// Ponemos el main para iniciar el programa. Es como el chasis del coche
	Scanner sc = new Scanner(System.in);
		// Ponemos el escaner
	System.out.println("Introduzca un numero");
	int num1 = sc.nextInt();
	System.out.println("Introduzca un numero 2");
	int num2 = sc.nextInt();
	System.out.println("Los numeros son "+num1+" y"+num2+".");
	int aux;// Colocamos un auxiliar porque el Java es gilipollas y no sabe intercambiar los numeros directamente
	aux = num1;
	num1 = num2;
	num2 = aux;
	System.out.println("Ahora los numeros son "+num1+" y "+num2+"");
		// Con  este ejercicio intercambiamos los numeros	
		// Impresion final
	
	sc.close();
}}

