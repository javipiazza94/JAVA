package ARRAYS;

import java.util.Scanner;

public class ARRAYDEARRAY {

	public static void main(String[] args) {
		// Colocamos el main para iniciar el escaner
		Scanner sc = new Scanner(System.in);
		final int FIL = 2, COL = 3;

		int[][] arraymulti = new int[FIL][COL];
		System.out.println("Introduce los elementos");

		for (int i = 0; i < FIL; i++) { //Primer for para posicionar los elementos del primer array
			for (int j = 0; j < COL; j++) { //Segundo for para posicionar los elementos del primer array
				arraymulti[i][j] = sc.nextInt(); //Añadimos los elementos del array
			}
		}
		for (int i = 0; i < FIL; i++) { //Hacemos el for de imprimir de ambos for
			for (int j = 0; j < COL; j++) { //Podemos usar el Arrays.deepToString(arraymulti)
				System.out.println("El elemento de [" + (i+1) + "] e [" + (j+1) + "] es "+arraymulti[i][j]+"");

			}
		}
	}
}
