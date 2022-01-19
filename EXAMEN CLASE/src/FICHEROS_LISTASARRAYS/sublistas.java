package FICHEROS_LISTASARRAYS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sublistas {

	public static void main(String[] args) {
		// Tenemos una lista array de numeros, por teclado pedimos dos
		// posiciones, y en otro arraylist copiaremos los valores entre ellos
		Scanner scanner = new Scanner(System.in);
		List<Integer> array1 = new ArrayList<Integer>();
		List<Integer> array2 = new ArrayList<Integer>();
		int [] aux = new int [2];
		for (int i = 1; i < 11; i++) {
			array1.add(i); 
		}
		System.out.println(array1); // Imprimimos el array1 con sus posiciones definidas
		
		System.out.println("Coge 2 de los numeros del array");
		aux[0]= scanner.nextInt(); // Introducimos los 2 numeros 
		aux[1]= scanner.nextInt();
		
		for (int i = aux[0]; i<aux[1]; i++){ //Hacemos un bucle entre un numero y otro
			array2.add(array1.get(i));			
		}
		System.out.println(array2);
	}
}
