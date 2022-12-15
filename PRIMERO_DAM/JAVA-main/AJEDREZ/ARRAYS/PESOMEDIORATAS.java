package ARRAYS;
import java.util.Scanner;

public class PESOMEDIORATAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] peso = new int[20];
		int suma = 1;
		int contiguales = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce los pesos");
		for (int i = 0; i < peso.length; i++) {
			peso[i] = sc.nextInt();
			System.out.println("La rata " + i + " pesa " + peso[i] + " gramos");
			suma += peso[i];
			for (int j = 0; j < peso.length; j++) {
				if (peso[i] == peso[j])
					contiguales++;{
				}
			}
		}
		double media = (double) suma / 20;
		System.out.println("El peso medio es " + media);
		System.out.println("Hay " + contiguales + " ratas con el mismo peso");
		sc.close();
	}
}
