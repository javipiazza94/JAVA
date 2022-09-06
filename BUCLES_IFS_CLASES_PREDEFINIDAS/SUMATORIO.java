package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

public class SUMATORIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Colocamos el  main para iniciar
				Scanner sc = new Scanner (System.in);
				int suma = 0; //Valor inicial suma
				long fact = 1;// Valor inicial multiplicacion
				System.out.println("Introduzca numero para iniciar la sumatoria y la factorial");
				int num = sc.nextInt();
				
				for (int i=1; i<=num; i++){ //Metemos el bucle for 
				suma = suma+i;//Introducimos la sumatoria
				fact = fact*i;//Introducimos el factorial
				}		
				System.out.println("La suma total de "+num+" es "+suma+" y su factorial es "+fact+"");
	}

}
