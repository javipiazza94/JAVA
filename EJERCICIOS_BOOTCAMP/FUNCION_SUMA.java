package EJERCICIOS_BOOTCAMP;
import java.util.*;

public class FUNCION_SUMA {

	private static int suma(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int resultado;
		
		System.out.println("Introduce numero A");
		int a = teclado.nextInt();
		System.out.println("Introduce numero B");
		int b = teclado.nextInt();
		System.out.println("Introduce numero C");
		int c = teclado.nextInt();
	
		resultado = FUNCION_SUMA.suma(a, b, c);
		
		System.out.println("El resultado de la suma es " +resultado);
		teclado.close();
		
	}
	
	}

	

