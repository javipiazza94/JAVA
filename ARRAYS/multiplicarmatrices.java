package ARRAYS;

import java.util.Scanner;
import java.util.Arrays;

public class multiplicarmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de las matrices");
		int tam = sc.nextInt();
		int mat1[][] = new int[tam][tam];
		int mat2[][] = new int[tam][tam];
		int result[][] = new int[tam][tam];

		for (int i = 0; i < tam; i++) {// Rellenamos la primera matriz 1
			for (int j = 0; j < tam; j++) {
				System.out.println("Introduce elementos matriz 1");
				mat1[i][j] = sc.nextInt();
			}
		}

		for (int k = 0; k < tam; k++) { // Rellenamos la primera matriz 2
			for (int l = 0; l < tam; l++) {
				System.out.println("Introduce elementos matriz 2");
				mat2[k][l] = sc.nextInt();
			}
		}

		for (int m = 0; m < tam; m++) { // Rellenamos la primera matriz 1
			for (int n = 0; n < tam; n++) {
				result[m][n] = mat1[m][n] * mat2[n][m];
			}
		}
		System.out.println(Arrays.deepToString(result)); //Imprimimos resultado
		sc.close();
	} 

}
