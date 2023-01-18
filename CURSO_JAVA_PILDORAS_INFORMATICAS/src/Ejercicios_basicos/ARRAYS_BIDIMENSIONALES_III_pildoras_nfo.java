package Ejercicios_basicos;

public class ARRAYS_BIDIMENSIONALES_III_pildoras_nfo {

	public static void main(String[] args) {
		// Hacer un array de una tabla de interes compuesto

		double resultado;
		double interes = 0.08;

		double[][] saldo = new double[6][5];

		for (int i = 0; i < 6; i++) {
			saldo[i][0] = 10000;
			resultado = 10000;
			for (int j = 0; j < 5; j++) {
				resultado = resultado + (resultado * interes);
				saldo[i][j] = resultado;
			}
			interes = interes + 0.01;
		}

		for (int z = 0; z < 6; z++) {
			System.out.println();
			for (int h = 0; h < 5; h++) {
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" ");

			}
		}
	}
}