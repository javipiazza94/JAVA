package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

public class ASCII {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un solo caracter: ");
		String cadena = sc.next();
		int codascii = cadena.charAt(0);
		
		System.out.println("El Condigo ASCII de tu caracter es : "+codascii);
		sc.close();
}}
