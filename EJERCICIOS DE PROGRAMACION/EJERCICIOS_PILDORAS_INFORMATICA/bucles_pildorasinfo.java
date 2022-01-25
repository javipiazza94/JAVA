package EJERCICIOS_PILDORAS_INFORMATICA;

import java.util.*;
import javax.swing.*;

public class bucles_pildorasinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean continuar = false;

		do {
			System.out.println("Elige una opcion: \n 1: Cuadrado \n 2: Rectangulo \n 3: Triangulo \n 4: Circulo");
			int figura = sc.nextInt();
			switch (figura) {
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
				System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
				break;

			case 2:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectangulo"));
				System.out.println("El area del cuadrado es " + base * altura);
				break;

			case 3:
				int base2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
				int altura2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
				double area_triangulo = (double) (base2 * altura2) / 2;
				System.out.println("El area del cuadrado es " + area_triangulo);
				break;

			case 4:
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
				double area_circulo = (double) Math.PI * Math.pow(radio, 2);
				System.out.println("El area del circulo es " + area_circulo);
				break;
				
			default: System.out.println("Introduce bien el numero");break;

			}
			System.out.println("¿Quieres continuar? Responde 'si' o 'no'");
			String respuesta = sc.next();
			if (respuesta.equals("no")) {
				continuar = true;
				System.out.println("Has salido del programa");
			}
		} while (!continuar);
		sc.close();
	}
}
