package ARRAYS;

//Son 14 filas y 22 columnas
import java.util.Scanner;

import java.util.Arrays;

public class asientoscine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int FIL = 14, COL = 22; // Declaramos la matriz de las butacas
		System.out.println("LAS COLUMNAS 10 Y 11 SON PASILLOS Y NO SE PUEDEN RESERVAR"); // Decimos
																							// al
																							// ususario
																							// que
																							// no
																							// puede
																							// meter
																							// esos
																							// numeros
		String reservado = "[x]"; // Declaramos los asientos cogidos
		String vacio = "[ ]"; // Declaramos los asientos libres
		String butaca[][] = new String[FIL][COL]; // Hacemos el array de la
													// matriz
		boolean completo = false; // Hacemos un boleano de cuando este completo
		int cont = 0; //Hacemos un contador del for de la matriz para contar las plazas que se estan reservando

		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) { //for de la matriz, poniendo los asientos vacios menos el pasillo
				butaca[i][j] = vacio;
				if (j == 10 || j == 11) {
					butaca[i][j] = "[p]";
				}
			}
		}
		/*
		 * for (int i = 0; i < FIL; i++) { for (int j = 0; j < COL; j++) {
		 * System.out.print(butaca[i][j]); if (j == COL - 1) {
		 * System.out.println(); } } }
		 */
		do { //Hacemos un do while porque no sabemos cuantos bucles vamos a hacer 
			System.out.println("Introduzca la fila donde quiera reservar");  //Introducimos la fila
			int fila = sc.nextInt();
			System.out.println("Introduzca la columna donde quiera reservar"); //Introducimos la columna
			int col = sc.nextInt();
			if (butaca[fila][col] == vacio) { //hacemos un if de si esta vacio que nos diga que hemos reservado.
				
				cont++;
				System.out.println("Acaba de reservarlo");
			}
		if (butaca[fila][col] == reservado || COL == 10 || COL == 11) //hacemos un if de si esta cogido el asiento que nos diga que no podemos reservar
				;
			cont++;
			System.out.println("No puede coger este asiento");
			for (int i = 0; i < FIL; i++) {   //Imprimimos el resultado
				for (int j = 0; j < COL; j++) {
					System.out.print(butaca[i][j]);
					if (j == COL - 1) { //Ponemos las columnas menos 1 porque hay que hacer un salto de linea
						System.out.println();
					}
				}
			}
			System.out.println("¿Esta completo?"); //Le preguntamos al ususario si esta completo y asi parar el bucle
			char respuesta = sc.next().charAt(0); //Hacemos un char para almacenar la letra de la respuesta

			if (respuesta == 's') { //Si la respuesta es un s esta completo y para el bucle do while
				completo = true;
			}
		} while (completo == false); //Cuando esta completo paramos
		System.out.println("Disfruta del espectaculo");
	}
}
