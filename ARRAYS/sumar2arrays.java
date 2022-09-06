package ARRAYS;
import java.util.Scanner;
import java.util.Arrays;
public class sumar2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner (System.in);
		final int FIL = 2, COL = 3;
		int mat1[][] = new int [FIL][COL];
		int mat2[][] = new int [FIL][COL];
		int result[][] = new int [FIL][COL];
		
		for (int i = 0; i<FIL; i++){//Rellenamos la primera matriz 1
			for (int j=0; j<COL; j++){
				System.out.println("Introduce elementos matriz 1");
				mat1[i][j]= sc.nextInt();
			}
		}

		for (int k = 0; k<FIL; k++){ //Rellenamos la primera matriz 2
			for (int l=0; l<COL; l++){
				System.out.println("Introduce elementos matriz 2");
				mat2[k][l]= sc.nextInt();
			}
		}

		for (int m = 0; m<FIL; m++){ //Rellenamos la primera matriz 1
			for (int n=0; n<COL; n++){
				result[m][n]= mat1[m][n] + mat2[m][n];
			}
		}
		System.out.println(Arrays.deepToString(result));
		
	}
	

}
