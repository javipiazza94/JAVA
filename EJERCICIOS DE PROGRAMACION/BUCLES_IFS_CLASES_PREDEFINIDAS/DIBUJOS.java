package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

public class DIBUJOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce numero A");//introducimos numero 1
		int num = sc.nextInt();
		System.out.println("Introduce numero B");//introducimos numero 2
		int num2 = sc.nextInt();
		//Hacemos 2 if para saber la diferencia entre uno y otro y asi coger ambos numeros
		if (num > num2) { // si a>B
			for (int i = num2; i <= num; i++) { //Contador empieza en el B, hace los bucles hasta el A y se incrementa
				if (i % 2 != 0) { //Hacemos modulo de los numeros para buscar los impares
					System.out.println(i); //Decimos que nos lo imprima
				}

			}
		} else if (num2 > num) {//si a>B
			for (int i = num; i <= num2; i++) {//Contador empieza en el A, hace los bucles hasta el B y se incrementa
				if (i % 2 != 0) {//Hacemos modulo de los numeros para buscar los impares
					System.out.println(i);//Decimos que nos lo imprima
				}

			}
		}
	}
}