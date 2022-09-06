package ARRAYS;

import java.util.Scanner;
import java.util.Arrays;

public class signos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FIL = 5, COL = 7;
		char sign[][] = new char[FIL][COL];

		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				if (i == 0 || i == 4) {
					sign[i][j] = '-';
				} else {
					sign[i][j] = '+';
				}
			}
		}
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {
				if (j < 6) {
					System.out.print(sign[i][j]);
				} else {
					System.out.println("");
				}
			}
		} 
		
	}
}