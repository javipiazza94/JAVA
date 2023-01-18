package Ejercicios_basicos;
import java.util.*;

public class ARRAYS_BIDIMENSIONALES_pildoras_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamano de la matriz de doble dimension");
		int tam1= sc.nextInt();
		int tam2= sc.nextInt();

		int [][] matriz = new int [tam1][tam2];
		
		for (int i = 0; i<tam1; i++) {
			for (int j = 0; j<tam2; j++){ 
			System.out.println("Introduce valores de la matriz");
			matriz[i][j]= sc.nextInt();
		}
	}

	System.out.println(Arrays.deepToString(matriz));
	sc.close();
			
		}
}
