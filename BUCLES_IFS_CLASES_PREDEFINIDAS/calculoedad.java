package BUCLES_IFS_CLASES_PREDEFINIDAS;
import java.util.Scanner;
//Colcamos la impresora en el inicio
public class calculoedad {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		// Ponemos la impresora
		// Programa en el que metes tu fecha de nacimiento y te calcula la edad
		final int añoA = 2021;
		//Declaramos el año inicial porque es una constante fija
		System.out.println("Introduzca el año");
		// Solicitamos año de nacimiento
		int año = sc.nextInt();		
		int año2 = (añoA - año);
		System.out.println("Su edad es de "+año2+" años");
		// Realizamos la resta y aplicamos el resultado
		sc.close();
}}
