package ARRAYS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ARRAY3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		Random n = new Random();
		int FIL = 3;
		int COL = 3;
		int [][] matriz = new int [FIL][COL];
		
		for (int i = 0; i<FIL; i++){
			for (int j=0; j<COL; j++){
				matriz [i][j] = n.nextInt(10);
			}
	}
		System.out.println(Arrays.deepToString(matriz));
		int mayor = matriz[0][0];
		int menor = matriz[0][0];
		String posicionmayor = null;
		String posicionmenor = null;
		for (int i = 0; i<FIL; i++){
			for (int j=0; j<COL; j++){
				if (matriz[i][j]>mayor) {
					mayor = matriz [i][j];
					posicionmayor = "["+i+" , "+j+"]";
				}else if (matriz[i][j]<menor) {
					menor = matriz [i][j];
					posicionmenor = "["+i+" , "+j+"]";
				}
			}	
}
		System.out.println("Los numeros mayores son "+mayor+" en la posicion "+posicionmayor+"");
		System.out.println("Los numeros menores son "+menor+" en la posicion "+posicionmenor+"");
		
		sc.close();
}
}
