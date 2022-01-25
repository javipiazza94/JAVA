package ARRAYS;
import java.util.Scanner;

public class LOTERIA {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] loteria = { 23, 45, 12, 67, 4, 78 };
		int[] boleto = new int[6];
		Scanner sc = new Scanner(System.in);
		int cont = 0;

		System.out.println("Introduce los numeros");
		for (int i = 0; i < boleto.length; i++) {
			boleto[i] = sc.nextInt();
		}

		for (int i = 0; i < boleto.length; i++) {
			if (boleto[i] == loteria[i])
				cont++;{
			}
		}
		System.out.println("Has acertado " + cont);
		sc.close();
	}
}
