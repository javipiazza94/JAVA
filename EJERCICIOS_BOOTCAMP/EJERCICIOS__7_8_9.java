package EJERCICIOS_BOOTCAMP;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class EJERCICIOS__7_8_9 {

	public static String reverse(String texto) { 
		for (int i = texto.length()-1; i>0; i--) {
			System.out.println("Extraemos los valores de la cadena al reves: "+ texto.charAt(i));
		} return texto;
	}

	public static int DividePorCero() {

		int resultado = 0;
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce numeros");
			int numA = sc.nextInt();
			int numB = sc.nextInt();
			resultado = numA / numB;

		} catch (ArithmeticException e) {
			System.out.println("Esto no puede hacerse " + e.getClass());
		} catch (Exception e) {
			System.out.println("Te has confundido escribiendo numeros enteros");
		} finally {
			System.out.println("Demo de código");
		}
		return resultado;
	}
	
	public static void archivos ( InputStream fileIn,  PrintStream fileOut){
	
		try {
			fileIn = new FileInputStream("C:\\Users\\MEDAC\\Downloads\\Currículum de Javi Piazza .pdf");
			BufferedInputStream fichero2 = new BufferedInputStream(fileIn);
			fileOut = new PrintStream("C:\\Users\\MEDAC\\Downloads\\Currículum de Javi Piazza .pdf");
				byte []dato = new byte[5]; 
				int datos = 0;
				try {
					
					datos = fichero2.read(dato);
				} catch (IOException e) {
					e.printStackTrace();
				}
				while (datos !=-1){
					//-1 = EOF 0 END OF FILE
					System.out.print((char)datos);
					try {
						datos = fileIn.read();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/*
		 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la
		 * cadena "hola mundo", debe retornar "odnum aloh".
		 * 
		 * Crea un array unidimensional de Strings y recórrelo, mostrando
		 * únicamente sus valores.
		 * 
		 * Crea un array bidimensional de enteros y recórrelo, mostrando la
		 * posición y el valor de cada elemento en ambas dimensiones.
		 * 
		 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5
		 * elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
		 * 
		 * Indica cuál es el problema de utilizar un Vector con la capacidad por
		 * defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
		 * 
		 * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una
		 * LinkedList. Recorre ambos mostrando únicamente el valor de cada
		 * elemento.
		 * 
		 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con
		 * elementos 1..10. A continuación, con otro bucle, recórrelo y elimina
		 * los numeros pares. Por último, vuelve a recorrerlo y muestra el
		 * ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
		 * siempre y cuando cumplas el primer "for" de relleno.
		 * 
		 * Crea una función DividePorCero. Esta, debe generar una excepción
		 * ("throws") a su llamante del tipo ArithmeticException que será
		 * capturada por su llamante (desde "main", por ejemplo). Si se dispara
		 * la excepción, mostraremos el mensaje "Esto no puede hacerse".
		 * Finalmente, mostraremos en cualquier caso: "Demo de código".
		 * 
		 * Utilizando InputStream y PrintStream, crea una función que reciba dos
		 * parámetros: "fileIn" y "fileOut". La tarea de la función será
		 * realizar la copia del fichero dado en el parámetro "fileIn" al
		 * fichero dado en "fileOut".
		 * 
		 * Sorpréndenos creando un programa de tu elección que utilice
		 * InputStream, PrintStream, excepciones, un HashMap y un ArrayList,
		 * LinkedList o array.
		 */

		EJERCICIOS__7_8_9.reverse("Hola Mundo");
		System.out.println("\n\r");

		// EJERCICIO 1
		String[] cadena = { "Hola mundo", "Me llamo Javi" };
		for (int i = 0; i < cadena.length; i++) {
			System.out.println("Extraemos los valores de la cadena: " + cadena.length);
		}
		System.out.println("\n\r");

		// EJERCICIO 2
		int matriz[][] = new int[3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;

		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;

		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Posicion de i: " + i);
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Estoy en i = " + i + " y en j = " + j);
				System.out.println("El valor de cada posicion es: " + matriz[i][j]);
				System.out.println("\n");
			}
		}
		// EJERCICIO 3
		Vector<Integer> vector = new Vector<Integer>(50, 70); // Capacidad
																// inicial de
																// 50, se
																// incrementa en
																// 70
		vector.add(343357);
		vector.add(136474);
		vector.add(2982432);
		vector.add(45667);
		vector.add(3457);

		System.out.println(vector);
		System.out.println("La capacidad del vector es " + vector.capacity());
		System.out.println("El tamano del vector es " + vector.size());
		System.out.println("Vamos a borrar la posicion 2: " + vector.remove(1));
		System.out.println("Vamos a borrar la posicion 3: " + vector.remove(2));
		System.out.println(vector);

		System.out.println("\n");

		// EJERCICIO 4
		// Al superar los 1000 elementos del vector, al ser de memoria dinamica
		// se duplicara a 2000 si no se limita la capacidad

		// EJERCICIO 5
		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add("Pikachu");
		Lista.add("Bulbasaur");
		Lista.add("Charmander");
		Lista.add("Squirtle");
		LinkedList<String> listaEnlazada = new LinkedList<String>(Lista);
		for (String nombre : Lista) {
			System.out.println(nombre);
		}

		System.out.println("\n");

		// EJERCICIO 6
		ArrayList<Integer> Lista2 = new ArrayList<Integer>();
		for (Integer i = 1; i <= 10; i++) {
			Lista2.add(i);
		}
		System.out.println(Lista2);

		for (Integer i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				Lista2.remove(i);
			}
		}
		System.out.println(Lista2);

		// EJERCICIO 7
		EJERCICIOS__7_8_9.DividePorCero();
		
		//EJERCICIO 8
		EJERCICIOS__7_8_9.archivos(fileIn, fileOut);
	}
}
