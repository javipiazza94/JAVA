package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;
		// Colocamos el escaner con Control + Shift + O
public class PROGRAMACION {

	private static Scanner sc;

	public static void main(String[] args) {
		// Ponemos el main para iniciar la comparacion
		sc = new Scanner (System.in);
		System.out.println("Introduzca un numero");
		int num1 = sc.nextInt();
		System.out.println("Introduzca un segundo numero para compararlo con el primero");
		int num2 = sc.nextInt();
		System.out.println("Introduzca un segundo numero para compararlo con el segundo");
		int num3 = sc.nextInt();
		//Vamos colocando todos los numeros
		boolean bool= num1 == num2;
		boolean bool2= num2 == num3;
		boolean boolfinal= bool && bool2;
		// Los comparamos entre si con la funcion bool
		System.out.println(boolfinal);
		// Impresion final
	}

}
