package CLASES;

import java.util.Scanner;
public class MAIN_TRIANGULO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double lado1, lado2, lado3;
		boolean continuar = false;
		String respuesta;
		
		do {
		
		System.out.println("Introduce el lado A");
		lado1 = sc.nextDouble();
		System.out.println("Introduce el lado B");
		lado2 = sc.nextDouble();
		System.out.println("Introduce el lado C");
		lado3 = sc.nextDouble();
		
		
		Triangulo triangulito = new Triangulo (lado1, lado2, lado3);
		if (triangulito.IsEquilatero() ){
			System.out.println("Es un triangulo equilatero " + triangulito.IsEquilatero());
		}
		if (triangulito.IsEscaleno()){
			System.out.println("Es un triangulo escaleno " + triangulito.IsEscaleno());
		}
		if (triangulito.IsIsosceles()){
			System.out.println("Es un triangulo isosceles " + triangulito.IsIsosceles());
		}
		
		System.out.println("El perimetro es "+ triangulito.perimetro());
		System.out.println("El area es "+triangulito.area());
		
		System.out.println("¿Quieres continuar?");
		respuesta = sc.next();
		if (respuesta.equalsIgnoreCase("No")){
			continuar = true;
		}

		}while (!continuar);
	}

}
