package EJERCICIOS_BOOTCAMP;

import java.util.Iterator;

public class Strings {

	public static void main(String[] args) {
		//Vamos a hacer funcionalidades con Strings
		
		
		//METODO CONTAINS
		String cadena = "SON TODAS PUTAS";
		boolean metodo = cadena.endsWith("PUTAS");
		
		if (metodo) {
			System.out.println("TODAS SON TODAS");
		} else {
			System.out.println("Menos mi madre");
		}
		
		System.out.println("\n\r");
		
		//METODO CHARAT
		
		for (int i = cadena.length()-1; i>0; i--) {
			System.out.println("Extraemos los valores de la cadena al reves: "+ cadena.charAt(i));
		}
		
		System.out.println("\n\r");
		
		//METODO CHARAT AL REVES
			
		for (int i =0; i<cadena.length(); i++) {
			System.out.println("Extraemos los valores de la cadena al reves: "+ cadena.charAt(i));
		}
		
		System.out.println("\n\r");
		
		//ARRAYS
		
		 String Array [] = {"SON", "TODAS", "UNAS", "PUTAS"};
		 /*
		 Array[0]= "SON";
		 Array[1]= "TODAS";
		 Array[2]= "UNAS";
		 Array[3]= "PUTAS";
		 Array[4]= "ZORRAS";
		 */
		 
		 System.out.println("Longitud del array de String es "+Array.length);
		 
		 for (String i: Array) {
			 System.out.println("Array actual: "+i);
		 }
		 
		 System.out.println("\n\r");
		 
		 String mujer = "";
		 for(int i = 0; i<Array.length; i++) {
			 System.out.println("Array actual: "+Array[i]+ " en posicion "+i);
			 mujer = Array[i];
		 }
		 System.out.println(mujer);
		 
		 System.out.println("\n\r");
		 
		/* int contador = 0;
		 while (contador<Array.length) {
			 System.out.println("Array actual: "+Array[contador]+ " en posicion "+contador);
			 contador++;
		 }*/
		 
		 int matriz [][] = new int [3][3];
		 matriz[0][0]= 1;
		 matriz[0][1]= 2;
		 matriz[0][2]= 3;
		 
		 matriz[1][0]= 4;
		 matriz[1][1]= 5;
		 matriz[1][2]= 6;
		 
		 matriz[2][0]= 7;
		 matriz[2][1]= 8;
		 matriz[2][2]= 9;
		 
		 for (int i = 0; i<matriz.length; i++) {
			 System.out.println("Posicion de i: "+i);
			 for (int j = 0; j<matriz[i].length; j++) {
				 System.out.println("Estoy en i = "+i+" y en j = "+j);
				 System.out.println("El valor de cada posicion es: "+matriz[i][j]);
				 System.out.println("\n");
			 }
		 }
		
		

	}

}
