package Ejercicios_basicos;
import java.util.*;

public class buclesII_pildoras_informaticas {

	public static void main(String[] args) {
		// Adivinar numero aleatorio entre 0 y 100
		
		int aleatorio = (int)(Math.random()*100);
		int numero = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);

		while (numero!=aleatorio) {
			System.out.println("Introduce un numero por favor");
			numero = sc.nextInt();
			if (aleatorio>numero){
				System.out.println("Mas alto");
			}
			if (aleatorio<numero){
				System.out.println("Mas bajo");
			}
			if (numero!=aleatorio) {
				contador++;
				System.out.println("Has fallado "+contador+ " veces. Prueba otra vez");
			}
			
		} if (numero == aleatorio) {
		System.out.println("Has acertado");
		}
		sc.close();
	} 

}
