package CLASES_PROPIAS;
import java.util.*;

public class MAIN_PUNTO {

	public static void main(String[] args) {
		// HACEMOS EL PROGRAMA DE LAS COORDENADAS
		
		Scanner sc = new Scanner(System.in);
		double x, y;
		boolean continuar = false;
		String respuesta;
		
		do {
		
		System.out.println("Introduce la x");
		x = sc.nextInt();
		System.out.println("Introduce la y");
		y = sc.nextInt();
		
		PUNTO punto = new PUNTO (x, y);
		
		punto.MoverXY(5, 6);
		System.out.println(punto);		
		
		System.out.println("¿Quieres continuar?");
		respuesta = sc.next();
		if (respuesta.equalsIgnoreCase("No")){
			continuar = true;
		}

		}while (!continuar);

	}

}
