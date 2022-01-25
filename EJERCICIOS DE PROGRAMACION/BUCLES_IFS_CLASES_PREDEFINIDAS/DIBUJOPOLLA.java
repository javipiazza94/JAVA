package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

public class DIBUJOPOLLA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("     *   "); System.out.println("   *   * ");
		 * System.out.println("  *     *"); System.out.println("  *******");
		 * System.out.println("  *     *"); System.out.println("  *     *");
		 * System.out.println("  *     *"); System.out.println("  *     *");
		 * System.out.println("*         *"); System.out.println("*         *");
		 */

		String dibujo = "";

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				System.out.println("     *   ");
			}
			if (i == 1) {
				System.out.println("   *   * ");
			}
			if (i == 2) {
				System.out.println("  *     *");
			}
			if (i == 3) {
				System.out.println("  *******");
			}
			if (i == 4) {
				System.out.println("  *     *");
			}
			if (i == 5) {
				System.out.println("  *     *");
			}
			if (i == 6) {
				System.out.println("  *     *");
			}
			if (i == 7) {
				System.out.println("  *     *");
			}
			if (i == 8) {
				System.out.println("*         *");
			}
			if (i == 9) {
				System.out.println("*         *");
			}
		}

	}
}
