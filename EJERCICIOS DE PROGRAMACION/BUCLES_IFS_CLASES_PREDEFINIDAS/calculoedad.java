package BUCLES_IFS_CLASES_PREDEFINIDAS;
import java.util.Scanner;
//Colcamos la impresora en el inicio
public class calculoedad {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		// Ponemos la impresora
		// Programa en el que metes tu fecha de nacimiento y te calcula la edad
		final int a�oA = 2021;
		//Declaramos el a�o inicial porque es una constante fija
		System.out.println("Introduzca el a�o");
		// Solicitamos a�o de nacimiento
		int a�o = sc.nextInt();		
		int a�o2 = (a�oA - a�o);
		System.out.println("Su edad es de "+a�o2+" a�os");
		// Realizamos la resta y aplicamos el resultado
		sc.close();
}}
